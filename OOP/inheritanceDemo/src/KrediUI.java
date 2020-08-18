public class KrediUI {
  public void KrediHesapla(BaseKrediManager baseKrediManager) {
    baseKrediManager.Hesapla();
    baseKrediManager.Faiz();
    baseKrediManager.Fatura();
    baseKrediManager.Vade();
    System.out.println("***********************************************");
  }
}
