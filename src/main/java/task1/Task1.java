package task1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter laptop price: ");
        long p = input.nextLong();

        System.out.print("Enter saved money: ");
        long s = input.nextLong();

        System.out.print("Enter weekly savings: ");
        long m = input.nextLong();

        if (s >= p) {
            System.out.println("k = 0");
        } else if (m <= 0) {
            System.out.println("Invalid weekly savings");
        } else {
            long k = (p - s + m - 1) / m;
            System.out.println("k = " + k);
        }

        input.close();
    }
}