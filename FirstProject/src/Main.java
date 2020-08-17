import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int a;
	int b;
	int total;
	Scanner scn = new Scanner(System.in);
    System.out.print("Lütfen Bir Sayı Giriniz: ");
	a = scn.nextInt();
    System.out.print("Lütfen Bir Sayı Giriniz: ");
	b = scn.nextInt();
	total = a + b;
	System.out.print("Toplam Sayu: " + total);
    }
}
