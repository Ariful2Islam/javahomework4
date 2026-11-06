package task3;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        try {
            Scanner input = new Scanner(new File("task3-data/duomenys.txt"));

            int n = input.nextInt();
            int count = 0;

            for (int i = 0; i < n; i++) {
                int temperature = input.nextInt();

                if (temperature < 0) {
                    count++;
                }
            }

            if (count == 0) {
                System.out.println("No negative temperatures recorded");
            } else {
                System.out.println(count);
            }

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: duomenys.txt");
        }
    }
}