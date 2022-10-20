package odev.methods;

public class Main {
    public static void main(String[] args) {
        int[] sayilar = new int[] { 1, 2, 5, 7, 9, 0 };
        int aranacak = 5;
        boolean varMi = false;
        Main.bul(sayilar, aranacak, varMi);
        if (varMi == true) {
            System.out.println("Bulundu");
        } else
            System.out.println("Bulunamadı");
    }

    public static void bul(int[] sayi, int aranacak, boolean varMi) {
        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] == aranacak) {
                varMi = true;
            }
        }
    }
}
