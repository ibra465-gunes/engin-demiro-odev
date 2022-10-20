package odev.multiDimensionalArrayDemo;

public class Main {
    public static void main(String[] args) {
        String[][] sehirler = new String[7][4];
        sehirler[0][0] = "Karadeniz";
        sehirler[1][0] = "Marmara";
        sehirler[2][0] = "Ege";
        sehirler[3][0] = "Akdeniz";
        sehirler[4][0] = "Güneydoğu Anadolu";
        sehirler[5][0] = "Doğu Anadolu";
        sehirler[6][0] = "İç Anadolu";
        sehirler[0][1] = "Samsun";
        sehirler[0][2] = "Sinop";
        sehirler[0][3] = "Zonguldak";
        sehirler[1][1] = "İstanbul";
        sehirler[1][2] = "Edirne";
        sehirler[1][3] = "Tekirdağ";
        sehirler[2][1] = "İzmir";
        sehirler[2][2] = "Aydın";
        sehirler[2][3] = "Muğla";
        sehirler[3][1] = "Antalya";
        sehirler[3][2] = "Adana";
        sehirler[3][3] = "Mersin";
        sehirler[4][1] = "Diyarbakır";
        sehirler[4][2] = "Şırnak";
        sehirler[4][3] = "Şanlı Urfa";
        sehirler[5][1] = "Van";
        sehirler[5][2] = "Muş";
        sehirler[5][3] = "Erzurum";
        sehirler[6][1] = "Ankara";
        sehirler[6][2] = "Sivas";
        sehirler[6][3] = "Çankırı";
        for (int i = 0; i < 4; i++) {

            for (int j = 0; j < 7; j++) {
                System.out.print("\t\t\t" + sehirler[j][i]);
            }
            System.out.println();
        }
    }
}
