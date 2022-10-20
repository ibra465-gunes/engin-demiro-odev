package odev.arraysDemo;

public class Main {
    public static void main(String[] args) {
        String ogrenci1 = "Salih";
        String ogrenci2 = "Derin";
        String ogrenci3 = "Engin";
        String[] ogrenci = new String[3];
        ogrenci[0] = "Salih";
        ogrenci[1] = "Derin";
        ogrenci[2] = "Engin";
        for (int i = 0; i < ogrenci.length; i++) {
            System.out.println(ogrenci[i]);
        }
        System.out.println("-----------------------");
        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);
        System.out.println("-----------------------");
        for (String student : ogrenci) {
            System.out.println(student);
        }
    }
}
