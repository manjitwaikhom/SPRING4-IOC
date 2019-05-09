package com02.spring5.anno.configuration.lazyLoading;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp{
    public static void main( String[] args )
    {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
         
        System.out.println("Bean Factory Initialized !!");
         
        EmployeeManager empManager = ctx.getBean(EmployeeManager.class);
        Employee emp = empManager.create();
         
        System.out.println(emp);
        
        ((AnnotationConfigApplicationContext)ctx).close();
    }
}
