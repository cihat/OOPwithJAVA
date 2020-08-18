public class Main {

    public static void main(String[] args) {
    int sayilar[] = new int []{1, 2, 5, 7, 9, 0, 6, 6} ;
    int aranacak = 6;
    boolean varMi = false;
        for (int variable: sayilar) {
            if (variable == aranacak) {
                varMi = true;
                break;
            }
        }
        if (varMi) {
            System.out.println("Arana deger dizide mevcuttur...f");
        }
        else {
            System.out.println("Arana değer dize yok ...");
        }
    }
}
