public class Main {

    public static void main(String[] args) {
        int total = topla2(1,2,3,4,5,6,7,8,9,0);
        System.out.println(total);
    }
    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }
    public  static int topla2(int... sayilar){
        int toplam = 0;
        for (int sayi: sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
