//IoC - Inversion of Control
//Dependency Injection

package com.springdemo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    @SuppressWarnings("resource")
    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(IocConfig.class);

    ICustomerService customerService= context.getBean("service", ICustomerService.class);
    customerService.add();
  }
//i� kurallar�. Bir class bir class'� kullan�cak ise new'lememelidir.
//Dependency Injection
}
