package odev.stringsDemo;

public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava çok güzel";
        System.out.println(mesaj);
        /*
         * System.out.println("Metnin eleman sayısı=" + mesaj.length());
         * System.out.println("5.eleman= " + mesaj.charAt(4));
         * System.out.println(mesaj.concat(" elma yiyelim"));
         * System.out.println(mesaj.startsWith("B"));
         * System.out.println(mesaj.endsWith("l"));
         * char[] key = new char[5];
         * mesaj.getChars(0, 5, key, 0);
         * System.out.println(key);
         * System.out.println(mesaj.indexOf("a"));
         * System.out.println(mesaj.lastIndexOf("a"));
         */
        System.out.println(mesaj.replace(' ', '-'));
        System.out.println(mesaj.substring(2, 5));
        for (String kelime : mesaj.split(" ")) {
            System.out.println(kelime);
        }
        System.out.println(mesaj.toLowerCase());
        System.out.println(mesaj.toUpperCase());
        System.out.println(mesaj.trim());
    }
}
