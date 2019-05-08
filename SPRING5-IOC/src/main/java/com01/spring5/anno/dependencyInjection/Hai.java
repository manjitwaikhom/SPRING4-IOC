package com01.spring5.anno.dependencyInjection;

public class Hai 
{
	String str;
	
	public Hai()
	{
		System.out.println("Hai Default Constructor");
	}

	/*
	 * //setter public void setStr(String str) { this.str=str; }
	 */
	public void display()
	{
		System.out.println("Hai-display()");
	}
}
