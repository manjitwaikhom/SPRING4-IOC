package com01.spring5.anno.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class MyConfig {
	
	@Bean
	//@Scope("prototype")
	public Hello getHello() {
		return new Hello();
	}
	
	@Bean
	@Scope("singleton")//default scope in singleton
	public Hai getHai() {
		return new Hai();
	}

}
