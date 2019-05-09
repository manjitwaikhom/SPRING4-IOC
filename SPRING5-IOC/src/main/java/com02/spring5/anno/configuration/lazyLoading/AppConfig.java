package com02.spring5.anno.configuration.lazyLoading;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class AppConfig {
     
    @Lazy
    @Bean
    public EmployeeManager employeeManager() {
        return new EmployeeManagerImpl();
    }
     
}
