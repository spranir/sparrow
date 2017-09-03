package org.etl.tests;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.IParseResult;
import org.eclipse.xtext.parser.IParser;
import org.etl.SparrowStandaloneSetup;
import org.etl.parser.antlr.SparrowParser;
import org.etl.sparrow.Action;
import org.etl.sparrow.Copydata;
import org.etl.sparrow.Googlecal;
import org.junit.Test;

import com.google.inject.Injector;

public class ProcessDefinitionTest {

	@Test
	public void test() throws IOException {
		String path = this.getClass().getResource("publishcalendar.spw").getPath();
		String model = readFromFile(path);
		Injector guiceInjector =new SparrowStandaloneSetup().createInjectorAndDoEMFRegistration();
		IParser parser = guiceInjector.getInstance(SparrowParser.class);
		IParseResult result = parser.parse(new StringReader(model));
		EObject eRoot = result.getRootASTElement();
		org.etl.sparrow.Process root = (org.etl.sparrow.Process) eRoot;
		
		List<Action> actionList1 = root.getTry().getAction();
		System.out.println("What is the process name="+root.getName()+", action list="+actionList1);
		for (Action action : actionList1) {
			System.out.println(action.getClass()+","+action.eContainmentFeature().getName()+","
					+action.eClass().getName());
			if(action.eClass().getName().equals("Googlecal"))
			{
				Googlecal calAction = (Googlecal) action;
				System.out.println(calAction);
				
			}
		}
		
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
