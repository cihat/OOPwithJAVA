public class Main {

    //interFaceler temel anlamda new'lemezler ve imza(içi boş fonksiyon) taşırlar ve referans tutucudurlar .

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();
    }
}
