public class ProductValidator {

  public ProductValidator() {
    System.out.println("Yapıcı Blog Çalıştı...");
  }

  static {
    System.out.println("Static Yapıcı Blog Çalıştı...");
    System.out.println("Bu bir static yapıcı blogtur ve new anahtar kelimesi kullanılmayan ve " +
            "Direct class'ın adıyla çağrıldığında olan durumlarda aktif olur.");
  }

  public static boolean isValid(Product product) {
    if (product.price > 0 && !product.name.isEmpty()) {
      return true;
    } else {
      return false;
    }
  }

  public void bisey() {

  }
}


//innerClass
  /*public static class BaskaBirClass{
    public  static void Sil() {

    }
  }
*/
//Eğer "new" kullanmadan fonk. çağıracaksanız fonksiyon static olmalı ve eğer constructor'ı da new'siz çağıracak isek
//static ile yukardaki gibi yaparak gerçekleştiriyoruz.
//inner classlar ise class içinde classlardır.Eğer inner class içindeki fonksiyon static ise class da static olmalı