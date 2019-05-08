package com01.spring5.anno.configuration;

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
	
	@Bean(name="haiBean")
	@Scope("singleton")//default scope in singleton
	public Hai getHai() {
		return new Hai();
	}

}
