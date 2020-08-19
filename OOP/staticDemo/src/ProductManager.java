public class ProductManager {
  public void add(Product product) {
    //ProductValidator productValidator = new ProductValidator();
    if (ProductValidator.isValid(product)) {
      System.out.println("Eklendi.");
    } else {
      System.out.println("Ürün Bilgileri Geçersizdir.");
    }
    //productValidator.bisey();
  }
}

//static anahtar kelimesi bir fonk. static olarak taniımlanmış ise program başladığından itibaren çalışır ve ve bu bir maliyettir.
// ondan dolayı pek tavsiye edilmezler "new" anahtar kelimesi de aynı şekildedir.
//Manager Sınıfları asla static yapılmazlar.
