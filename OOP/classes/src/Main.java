public class Main {

    public static void main(String[] args) {
        CustomerManager cM = new CustomerManager();
        CustomerManager cM1 = new CustomerManager();
        cM = cM1;
        cM.Add();
        cM.Remove();
        cM.Update();
        int sayilar1[] = new int[]{1, 2, 3};
        int sayilar2[] = new int[]{4, 5, 6};
        sayilar2 = sayilar1;
        sayilar1[0] = 100;
        for (int sayi: sayilar2) {
            System.out.println(sayi);
        }
    }
}
