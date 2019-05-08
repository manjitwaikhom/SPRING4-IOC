package com01.spring5.anno.dependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;

public class Hello 
{
	@Autowired
	Hai hai;
	
	public Hello()
	{
		System.out.println("Hello Default Constructor");
	}
	
	public void show()
	{
		System.out.println("Hello-show()");
		hai.display();
	}
}
