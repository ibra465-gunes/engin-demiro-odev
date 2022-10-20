package odev.abstractClasses;

public class Main {
    public static void main(String[] args) {
        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.hesapla();
        ManGameCalculator manGameCalculator = new ManGameCalculator();
        manGameCalculator.gameOver();

    }
}
