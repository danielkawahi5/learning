package masterclass.java.S05.lessons;

import java.util.Scanner;

public class L73ReadingUserInputChallenge {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enteredNumbers = 0;
        int sumOfTheEnteredNumbers = 0;

        while (enteredNumbers < 10) {
            int input = enteredNumbers + 1;
            System.out.println("Entered number #" + input + ":");

            boolean isInt = scanner.hasNextInt();

            if (isInt) {
                int number = scanner.nextInt();
                enteredNumbers++;
                sumOfTheEnteredNumbers += number;
            } else {
                System.out.println("Invalid number");
            }
            scanner.nextLine();
        }
        System.out.println("SUM : " + sumOfTheEnteredNumbers);
        scanner.close();
    }
}
