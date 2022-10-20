package odev.reCapDemo2;

public class Main {
    public static void main(String[] args) {
        double[] mylist = { 1.2, 1.3, 1.4, 1.5 };
        double total = 0;
        double max = 0;
        for (double number : mylist) {
            System.out.println(number);
            total = total + number;
            System.out.println(total);
            if (max < number) {
                max = number;
            }
        }
        System.out.println(total);
        System.out.println("-------------------");
        System.out.println(max);

    }
}
