package org.etl.dsl.Sparrow.tests;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.etl.SparrowStandaloneSetup;
import org.etl.parser.antlr.SparrowParser;
import org.etl.sparrow.Process;
import org.junit.Test;

import com.google.inject.Injector;

public class ProcessDefinitionTest {

	@Test
	public void test() throws IOException {
		String path = this.getClass().getResource("helloworld.ydl").getPath();
		String model = readFromFile(path);
		Injector guiceInjector =new SparrowStandaloneSetup().createInjectorAndDoEMFRegistration();
		IParser parser = guiceInjector.getInstance(SparrowParser.class);
		IParseResult result = parser.parse(new StringReader(model));
		EObject eRoot = result.getRootASTElement();
		org.etl.sparrow.Process process = (Process) eRoot;
		System.out.println("What is the process name="+process.getName());
	}
	private String readFromFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		String readerString;
		StringBuilder builder = new StringBuilder();
		while ((readerString = br.readLine()) != null) {
			builder.append(readerString);
		}
		br.close();
		return builder.toString();
	}

}
