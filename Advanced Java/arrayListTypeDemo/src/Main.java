import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

  public static void main(String[] args) {
    ArrayList<String> sehirler = new ArrayList<String>();
    sehirler.add("İzmir");
    sehirler.add("İstanbul");
    sehirler.add("Ankara");
    sehirler.add("Malatya");
    sehirler.add("Adana");

    sehirler.remove("İstanbul");
    Collections.sort(sehirler);
    for (String sehir: sehirler) {
      System.out.println(sehir);
    }
  }
}
