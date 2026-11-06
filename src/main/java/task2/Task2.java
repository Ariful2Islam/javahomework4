package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int even = 0;
        int odd = 0;

        System.out.println("Enter numbers (0 to stop):");

        while (true) {
            int number = input.nextInt();

            if (number == 0) {
                break;
            }

            if (number % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }

        System.out.println("Even numbers: " + even);
        System.out.println("Odd numbers: " + odd);

        input.close();
    }
}