package com01.spring5.anno.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig1 {
	
	@Bean
	public Hai getHai() {
		return new Hai();
	}

}
