public class Main {

    public static void main(String[] args) {
        int number = 28;
        int bolenler[] = new int[6];
        int total = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                total += i;
                System.out.println("Bölenler: " + i);
            }
        }
        System.out.println("Bölenlerin Toplamı: " + total);
        if (total == number) {
            System.out.println("Bu bir Mükemmel Sayıdır.");
        }
        else {
            System.out.println("Bu Mükemmel Bir Sayı Değildir.");
        }
    }
}
