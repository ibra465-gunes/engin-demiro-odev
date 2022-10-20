package odev.classes;

public class Main {
    public static void main(String[] args) {
        CostumerManager costumermanager;
        CostumerManager costumermanager2 = new CostumerManager();
        costumermanager = costumermanager2;
        costumermanager.Add();
        costumermanager.Remove();
        costumermanager.Update();
        int sayi1 = 10;
        int sayi2 = 20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);
        int[] sayilar = new int[] { 1, 2, 3 };
        int[] sayilar2 = new int[] { 4, 5, 6 };
        sayilar2 = sayilar;
        sayilar[0] = 10;
        System.out.println(sayilar2[0]);
    }
}
