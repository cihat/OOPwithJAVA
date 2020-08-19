import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    ArrayList<Customer> customers = new ArrayList<Customer>();
    Customer engin = new Customer(1, "Engin", "Demiroğ");
    customers.add(engin);
    customers.add(new Customer(1, "Cihat", "Salik"));
    customers.add(new Customer(1, "Recep", "KaşıBüyükBey"));
    customers.add(new Customer(1, "Ahmet", "Ali"));
    customers.add(new Customer(1, "Mehmet", "Ayşe"));
    //Burda engini sildik ama engin nesnesini farklı yaptığımız için silebildik yokda olmuyor dikkat etmek gerekiyor.
    customers.remove(engin);

    for (Customer customer: customers) {
      System.out.println(customer.firstName);
    }
  }
}
