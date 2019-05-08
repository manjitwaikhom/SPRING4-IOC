package com01.spring5.anno.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp2 {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ctx=new AnnotationConfigApplicationContext();
		ctx.register(AppConfig1.class,AppConfig2.class);
		ctx.refresh();
		
		Hello hello=ctx.getBean(Hello.class);
		hello.show();
		
		ctx.close();
	}
}
