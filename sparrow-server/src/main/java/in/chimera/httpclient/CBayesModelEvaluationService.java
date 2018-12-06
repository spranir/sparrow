package in.chimera.httpclient;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.HashMap;
import java.util.Map;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.io.IntWritable;
import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.util.Version;
import org.apache.mahout.classifier.naivebayes.BayesUtils;
import org.apache.mahout.classifier.naivebayes.NaiveBayesModel;
import org.apache.mahout.classifier.naivebayes.StandardNaiveBayesClassifier;
import org.apache.mahout.common.Pair;
import org.apache.mahout.common.iterator.sequencefile.SequenceFileIterable;
import org.apache.mahout.math.RandomAccessSparseVector;
import org.apache.mahout.math.Vector;
import org.apache.mahout.math.Vector.Element;
import org.apache.mahout.vectorizer.TFIDF;

import com.google.common.collect.ConcurrentHashMultiset;
import com.google.common.collect.Multiset;

public class CBayesModelEvaluationService {
	
	public static void main(String args[]) {
		
		CBayesModelEvaluationService ml = new CBayesModelEvaluationService();
		String modelPath = "/home/sid/auto-classifier/nb-scenario-store-without-metalabel/model";
		String labelIndexPath = "/home/sid/auto-classifier/nb-scenario-store-without-metalabel/labelindex";
		String dictionaryPath = "/home/sid/auto-classifier/nb-scenario-store-without-metalabel/dictionary.file-0";
		String documentFrequencyPath = "/home/sid/auto-classifier/nb-scenario-store-without-metalabel/df-count";
		String dataFilePath = "/home/sid/auto-classifier/test-data/sample-tests.csv";
		ml.testBayesian_6(modelPath, labelIndexPath, dictionaryPath, documentFrequencyPath, dataFilePath);
		
		
	}

	public static Map<String, Integer> readDictionnary(Configuration conf, Path dictionnaryPath) {
		Map<String, Integer> dictionnary = new HashMap<String, Integer>();
		for (Pair<Text, IntWritable> pair : new SequenceFileIterable<Text, IntWritable>(dictionnaryPath, true, conf)) {
			dictionnary.put(pair.getFirst().toString(), pair.getSecond().get());
		}
		return dictionnary;
	}

	public static Map<Integer, Long> readDocumentFrequency(Configuration conf, Path documentFrequencyPath) {
		Map<Integer, Long> documentFrequency = new HashMap<Integer, Long>();
		for (Pair<IntWritable, LongWritable> pair : new SequenceFileIterable<IntWritable, LongWritable>(
				documentFrequencyPath, true, conf)) {
			documentFrequency.put(pair.getFirst().get(), pair.getSecond().get());
		}
		return documentFrequency;
	}
	
	public void testBayesian_6(String modelPath, String labelIndexPath, String dictionaryPath, String documentFrequencyPath, String dataFilePath) {
/*		String modelPath = modelPath;
		String labelIndexPath = "/home/sid/Workspace/ffs/mahout/labelindex";
		String dictionaryPath = "/home/sid/Workspace/ffs/mahout/dictionary.file-0";
		String documentFrequencyPath = "/home/sid/Workspace/ffs/mahout/df-count";
		String dataFilePath = "/home/sid/Workspace/ffs/mahout/sample/new.csv";*/
		Configuration configuration = new Configuration();
		try {
			NaiveBayesModel model = NaiveBayesModel.materialize(new Path(modelPath), configuration);
			StandardNaiveBayesClassifier classifier = new StandardNaiveBayesClassifier(model);
			Map<Integer, String> labels = BayesUtils.readLabelIndex(configuration, new Path(labelIndexPath));
			Map<String, Integer> dictionary = readDictionnary(configuration, new Path(dictionaryPath));
			Map<Integer, Long> documentFrequency = readDocumentFrequency(configuration,
					new Path(documentFrequencyPath));

			@SuppressWarnings("deprecation")
			Analyzer analyzer = new StandardAnalyzer(Version.LUCENE_46);

			int labelCount = labels.size();
			int documentCount = documentFrequency.get(-1).intValue();
			System.out.println("Number of labels: " + labelCount);

			BufferedReader reader = new BufferedReader(new FileReader(dataFilePath));
			while (true) {
				String line = reader.readLine();
				if (line == null) {
					break;
				}
				// String tokens[] = line.split(",");

				/*
				 * String browser = tokens[0]; String gender = tokens[1]; String device =
				 * tokens[2]; String manufacturer = tokens[3]; String os = tokens[5]; String
				 * osGroup = tokens[6];
				 */
				Multiset<String> words = ConcurrentHashMultiset.create();
				TokenStream ts = analyzer.tokenStream("text", new StringReader(line));
				CharTermAttribute termAtt = ts.addAttribute(CharTermAttribute.class);
				ts.reset();
				int wordCount = 0;
				while (ts.incrementToken()) {
					if (termAtt.length() > 0) {
						String word = ts.getAttribute(CharTermAttribute.class).toString();
						Integer wordId = dictionary.get(word);
						// if the word is not in the dictionary, skip it
						if (wordId != null) {
							words.add(word);
							wordCount++;
						}
					}
				}
				ts.end();
				ts.close();

				Vector vector = new RandomAccessSparseVector(10000);
				TFIDF tfidf = new TFIDF();
				for (Multiset.Entry<String> entry : words.entrySet()) {
					String word = entry.getElement();
					int count = entry.getCount();
					Integer wordId = dictionary.get(word);
					Long freq = documentFrequency.get(wordId);
					double tfIdfValue = tfidf.calculate(count, freq.intValue(), wordCount, documentCount);
					vector.setQuick(wordId, tfIdfValue);
				}

				Vector resultVector = classifier.classifyFull(vector);
				double bestScore = -Double.MAX_VALUE;
				int bestCategoryId = -1;

				for (Element element : resultVector.all()) {
					int categoryId = element.index();
					double score = element.get();
					if (score > bestScore) {
						bestScore = score;
						bestCategoryId = categoryId;
					}
					System.out.print("  " + labels.get(categoryId) + ": " + score);
				}
				System.out.println(" => " + labels.get(bestCategoryId));
			}
			analyzer.close();
			reader.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
