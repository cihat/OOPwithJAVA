//IoC - Inversion of Control
//Dependency Injection

package springIntro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    try {
      @SuppressWarnings("resource")
      ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");  
      ICustomerService customerService = context.getBean("service", ICustomerService.class);
      customerService.add();

    } catch (Exception e) {
      System.out.println(e.getMessage());
    }
    
  }
//iþ kurallarý. Bir class bir class'ý kullanýcak ise new'lememelidir.
//Dependency Injection
}
