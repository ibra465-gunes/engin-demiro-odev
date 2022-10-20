package odev.overridding;

public class Main {
    public static void main(String[] args) {
        BaseKrediManager[] kredis = new BaseKrediManager[] { new TarımKrediManager(), new OgretmenKrediManager(),
                new OgrenciKrediManager() };
        for (BaseKrediManager kredi : kredis) {
            System.out.println(kredi.Hesapla(1000));
        }
    }
}
