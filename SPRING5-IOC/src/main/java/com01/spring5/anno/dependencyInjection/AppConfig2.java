package com01.spring5.anno.dependencyInjection;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig2 {
	
	@Bean
	public Hello getHello() {
		return new Hello();
	}

}
