package odev.miniProjeAsalSayi;

public class Main {
    public static void main(String[] args) {
        int number = 1;
        int remainder = number;
        for (int i = 2; i < number; i++) {
            remainder = number % i;
            if (remainder == 0) {
                System.out.println("Asal sayı değildir.");
                break;
            }

        }
        if (remainder < 2) {
            System.out.println("Geçersiz sayı");
        }

        else if (remainder != 0) {
            System.out.println("Asal sayıdır.");

        }
    }
}
