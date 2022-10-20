package odev.sesliHarfler;

public class Main {
    public static void main(String[] args) {
        char harf = 'A';
        switch (harf) {
            case 'A':
            case 'O':
            case 'U':
            case 'I':
            case 'a':
            case 'o':
            case 'u':
            case 'ı':
                System.out.println("Kalın harf");
                break;
            case 'E':
            case 'e':
            case 'İ':
            case 'i':
            case 'Ö':
            case 'ö':
            case 'Ü':
            case 'ü':
                System.out.println("İnce harf");
                break;
            default:
                System.out.println("Geçersiz karakter girdiniz.");
        }
    }
}
