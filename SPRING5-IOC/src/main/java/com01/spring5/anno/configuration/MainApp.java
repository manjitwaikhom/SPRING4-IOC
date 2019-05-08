package com01.spring5.anno.configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		Hello hello=ctx.getBean(Hello.class);//getting bean by class
		hello.show();
		
		Hai hai=(Hai) ctx.getBean("haiBean");//getting bean by name
		hai.show();
		
		((AnnotationConfigApplicationContext) ctx).close();
		
	}

}
