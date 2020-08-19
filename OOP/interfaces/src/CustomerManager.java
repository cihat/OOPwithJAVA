//Bir başka yöntem altdaki göre biraz kötü
/*
public class CustomerManager {
  ICustomerDal customerDal;
  public void add() {
    //iş kodları
    customerDal.add();
  }
}
*/
public class  CustomerManager {
  private ICustomerDal customerDal;

  public CustomerManager(ICustomerDal customerDal) {
  this.customerDal = customerDal;
  }
  public  void add() {
    customerDal.add();
  }
}    