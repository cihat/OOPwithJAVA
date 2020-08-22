package springIntro;

public class CustomerManager implements ICustomerService {

  private ICustomerDal customerDal;

//  // constructor injection bu yöntemi tercih ederler 99%
//  public CustomerManager(ICustomerDal customerDal) {
//    this.customerDal = customerDal;
//  }

  
  //setter injection 
  public void setCustomerDal(ICustomerDal customerDal) {
    this.customerDal = customerDal;
  }

  public void add() {
    customerDal.add();
  }
}
