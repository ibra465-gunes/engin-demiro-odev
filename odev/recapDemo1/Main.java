package odev.recapDemo1;

public class Main {
    public static void main(String[] args) {
        int sayi, sayi2, sayi3;
        sayi = 20;
        sayi2 = 25;
        sayi3 = 27;
        if (sayi >= sayi2 && sayi >= sayi3) {
            System.out.println("En büyük sayı =" + sayi);
        } else if (sayi2 >= sayi3) {
            System.out.println("En büyük sayı =" + sayi2);
        } else
            System.out.println("En büyük sayı =" + sayi3);
    }
}
