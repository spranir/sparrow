package org.etl.tests;


import java.util.Iterator;

import org.eclipse.emf.ecore.EObject;
import org.etl.sparrow.Action;
import org.etl.sparrow.Copydata;

public class CopydataAdapter implements Command{

	private Copydata copydata;

	public CopydataAdapter(Action action) {
		super();
		this.copydata = (Copydata) action;
	}
	
	public void execute()
	{
		System.out.println(this.copydata.getName()+","+this.copydata.getSource()
		+",="+this.copydata.getTo()+", value="+this.copydata.getValue());
	}
}
