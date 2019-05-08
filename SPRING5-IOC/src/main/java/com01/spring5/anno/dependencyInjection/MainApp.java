package com01.spring5.anno.dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp 
{
	public static void main(String[] args) 
	{
		ApplicationContext ctx=new AnnotationConfigApplicationContext(MyConfig.class);
		
		
		Hello hello=ctx.getBean(Hello.class);
		hello.show();
		
		((AnnotationConfigApplicationContext) ctx).close();
		
	}

}
