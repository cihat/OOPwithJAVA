import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
/*    int sayilar[] = new int[]{1, 2, 3};
    System.out.println(sayilar.length);
    System.out.println("🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈");
    sayilar = new int[4];
    for (int numbers: sayilar) {
      System.out.println(numbers);
    }*/
    // Collection (koleksiyonlar)
    ArrayList sayilar = new ArrayList();
    sayilar.add(12);
    sayilar.add(1);
    sayilar.add("Ankara");
    sayilar.add("istanbul");
    for (Object deger: sayilar) {
      System.out.println(deger);
    }
    System.out.println("🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎈🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎇🎃🎃🎃🎃🎃🎃🎃🎃🎃🎃");
    //System.out.println(sayilar.size());
    System.out.println(sayilar.get(1));
    sayilar.set(0, "Adıyaman");
    sayilar.remove(1);
    //sayilar.clear();//arrayListin elemanlarını siler
    System.out.println("💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻💻");
    for (Object deger: sayilar) {
      System.out.println(deger);
    }
  }
}
