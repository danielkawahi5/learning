package timbuchalka.java.S08.array_list_challenge;

import java.util.Scanner;

public class Main {
    private static Logic logic = new Logic();
    private static Scanner scanner = new Scanner(System.in);
    private  static MobilePhone mobilePhone = new MobilePhone("799994571258");

    public static void main(String[] args) {
        boolean quit = false;
        logic.startPhone();
        logic.printActions();
        while(!quit) {
            System.out.println("Enter action: |6| to show available actions");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action) {
                case 0:
                    System.out.println("\nshutting down.....");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    logic.addNewContact();
                    break;
                case 3:
                    logic.updateContact();
                    break;
                case 4:
                    logic.removeContact();
                    break;
                case 5:
                    logic.queryContact();
                    break;
                case 6:
                    logic.printActions();
                    break;
            }
        }
    }
}
