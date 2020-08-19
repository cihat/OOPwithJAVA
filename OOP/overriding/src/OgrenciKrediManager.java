public class OgrenciKrediManager extends BaseKrediManager {
  public double hesapla(double tutar) {
    return tutar * 1.11;
  }
}

//Final anahtar kelimesi overrinding'i engeller ve extend edilen sınıf overrinding yapamaz.