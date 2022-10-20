package odev.mukemmelSayi;

public class Main {
    public static void main(String[] args) {
        int number = 25;
        int sum = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum = sum + i;
            }
        }
        if (number == sum) {
            System.out.println(number + " sayısı mükemmel sayıdır.");
        } else if (number != sum) {
            System.out.println(number + " sayısı mükemmel sayı değildir.");
        } else
            System.out.println("Geçersiz karakter girdiniz.");
    }
}
