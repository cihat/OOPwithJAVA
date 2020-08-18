public class Main {

  public static void main(String[] args) {
    KrediUI krediUI = new KrediUI();
    System.out.println("Asker ");
    krediUI.KrediHesapla(new AskerKrediManager());
    System.out.println("Ogretmen ");
    krediUI.KrediHesapla(new OgretmenKrediManager());
    System.out.println("Tarim ");
    krediUI.KrediHesapla(new TarimKrediManager());
  }
}