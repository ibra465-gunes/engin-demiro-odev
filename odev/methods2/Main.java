package odev.methods2;

public class Main {
    public static void main(String[] args) {
        // String mesaj = "Bugün hava çok iyi.";
        String yeniMesaj = sehirVer(); // mesaj.substring(0, 2);
        System.out.println(yeniMesaj);
        int sayi = topla(28, 7);
        System.out.println(sayi);
        int toplam = toplam2(3, 5, 9);
        System.out.println(toplam);
    }

    public static void eklse() {

    }

    public static void sil() {

    }

    public static void guncelle() {

    }

    public static int topla(int i, int j) {
        return i + j;
    }

    public static String sehirVer() {
        return "Samsun";
    }

    public static int toplam2(int... sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }
        return toplam;
    }
}
