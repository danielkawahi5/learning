package masterclass.java.S05.lessons;

import java.util.Scanner;

public class L74MinMaxInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 0;
        int max = 0;
        boolean first = true;

        while (true) {
            System.out.println("Entered number: ");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int input = scanner.nextInt();

                if (first) {
                    first = false;
                    min = input;
                    max = input;
                }
                if (max < input) {
                    max = input;
                }
                if (min > input) {
                    min = input;
                }
            } else {
                break;
            }
            scanner.nextLine();
        }
        System.out.println("max entered number: " + max);
        System.out.println("min entered number: " + min);
        scanner.close();
    }

}
