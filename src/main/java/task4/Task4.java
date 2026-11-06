import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(new File("duomenys.txt"));

            int n = input.nextInt();
            int count = 0;

            int previous = input.nextInt();

            for (int i = 1; i < n; i++) {
                int current = input.nextInt();

                if (current < previous) {
                    count++;
                }

                previous = current;
            }

            System.out.println(count);

            input.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: duomenys.txt");
        }
    }
}