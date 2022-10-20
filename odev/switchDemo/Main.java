package odev.switchDemo;

public class Main {
    public static void main(String[] args) {
        char grade = 'g';
        switch (grade) {
            case 'A':
                System.out.println("Mükemmel");
                break;
            case 'B':
                System.out.println("Çok güzel");
                break;
            case 'C':
                System.out.println("İyi");
                break;
            case 'D':
                System.out.println("Fena değil");
                break;
            case 'F':
                System.out.println("Kaldınız");
                break;
            default:
                System.out.println("Geçersiz karakter girdiniz");
                break;
        }
    }
}
