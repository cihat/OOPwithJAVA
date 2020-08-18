public class Main {
 
  public static void main(String[] args) {
    String mesaj = "Bugün hava çok güzel.";
/*    System.out.println("Eleman Sayısı : " + mesaj.length());
    //Bir stringe ekleme yapar ve yeni bir string yaratır .
    String newStr = mesaj.concat(" Yaşasın!");
    System.out.println(newStr);
    //Stringin içindeki verilen karakterle mi başladığını boolean ile cevap verir .
    System.out.println(mesaj.startsWith("B"));
    //Stringin içindeki verilen karakterle mi sonlandığnı  boolean ile cevap verir .
    System.out.println(mesaj.endsWith("."));
    //getChars() 4 parametre alıyor .Bir stringi alır ve hedef diziye atulır
    char[] karaterler = new char[5];
    mesaj.getChars(0,5, karaterler, 0);
    System.out.println(karaterler);
    //String'de ilk bulduğu karaklterin veya karakterlerin index numarasını geri dondürür.
    System.out.println(mesaj.indexOf('a'));
    //String'de en solunda aramaya başlar ilk bulduğu karaklterin veya karakterlerin index numarasını geri dondürür.
    System.out.println(mesaj.lastIndexOf("."));*/

    System.out.println(mesaj.replace(" ", "-"));

    String subString = mesaj.substring(2, 6);
    System.out.println(subString);

    for (String kelime:mesaj.split(" ") ){
      System.out.print(kelime + "\n" );
    }
    System.out.println(mesaj.trim());
  }
}






