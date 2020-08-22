import java.util.ArrayList;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    double numberDouble;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Lütfen Bir Sayi Giriniz: ");
    numberDouble = scanner.nextDouble();
    String s = String.valueOf(numberDouble);
    System.out.println("Tersi: ");
    for (int i = s.length() - 1; i >= 0; i--) {
      System.out.print(s.charAt(i));
    }
  }
}

/*    String name ;
    Scanner scn = new Scanner(System.in);
    String array[] ;
    ArrayList<String> arrayList = new ArrayList<>();
    int sayac = 0;
    for (int i = 0; i < 20; i++) {
      name = scn.nextLine();
      if (name.charAt(0) == 'A' || name.charAt(0) == 'a'){
        arrayList.add(name);
      }
    }
    System.out.println("A veya a ile başlayan kelimeler");
    for (String item:arrayList) {
      System.out.println(item);
    }*/


/*    Scanner scn = new Scanner(System.in);

    int number;
    boolean asalMi = false;
    System.out.println("Lütfen Bir Sayi Giriniz: ");
    number = scn.nextInt();
    do {
      System.out.println("Lütfen Bir Sayi Giriniz: ");
      number = scn.nextInt();
      for (int i = 2; i <= number; i++) {
        if (number % i != 0) {
          asalMi = true;
        }
      }
      if (asalMi == true) {
        System.out.println("Sayi Asal Değil");
      } else {
        System.out.println(number);
      }
    } while (number != 10);*/
