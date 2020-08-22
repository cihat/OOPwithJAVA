//IoC - Inversion of Control
//Dependency Injection

package stringIntro;

public class Main {

  public static void main(String[] args) {
    System.out.println("Merhaba...");
    CustomerManager manager = new CustomerManager(new MySqlCustomerDal());
    manager.add();
  }
//i� kurallar�. Bir class bir class'� kullan�cak ise new'lememelidir.
//Dependency Injection
}
