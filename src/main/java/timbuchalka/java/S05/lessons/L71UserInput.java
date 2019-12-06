package timbuchalka.java.S05.lessons;

import java.util.Scanner;

public class L71UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your year of birth please:");
        boolean hasNextInt = scanner.hasNextInt();
        if (hasNextInt){
            int yearOfBirth = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Enter your name:");
            String name = scanner.nextLine();

            int age = 2019 - yearOfBirth;

            if (age >= 0 && age <= 100) {
                System.out.println(name + " you are " + age + " years old");
            } else {
                System.out.println("Invalid year of birth");
            }
        } else {
            System.out.println("unable to parse year of birth");
        }
        scanner.close();
    }
}
