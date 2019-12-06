package timbuchalka.java.S08.grocery;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();
        while(!quit) {
            System.out.println("enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch(choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    processArrayList();
                    break;
                case 7:
                    quit = true;
                    break;
            }
        }
    }

    private static void processArrayList() { // copying an array
        //#1
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceryList());
        //#2
        ArrayList<String> nextArray = new ArrayList<String>(groceryList.getGroceryList());
        //#3
        String[] myArray = new String[groceryList.getGroceryList().size()];
        myArray = groceryList.getGroceryList().toArray(myArray);
    }

    public static void printInstructions()
    {
        System.out.println("\nPress");
        System.out.println("\t0 - Print choice options");
        System.out.println("\t1 - Print the list of grocery items");
        System.out.println("\t2 - Add an item to the list");
        System.out.println("\t3 - Modify an item in the list");
        System.out.println("\t4 - Remove an item from the list");
        System.out.println("\t5 - Search for an item in the list");
        System.out.println("\t6 - Quit the application");
    }
    public static void addItem()
    {
        System.out.println("Enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }
    public static void modifyItem() {
        System.out.println("Current item name: ");
        String itemNo = scanner.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNo, newItem);
    }
    public static void removeItem() {
        System.out.println("Enter item name to remove: ");
        String itemNo = scanner.nextLine();
        scanner.nextLine();
        groceryList.removeGroceryItem(itemNo);
    }
    public static void searchForItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = scanner.nextLine();
        if (groceryList.onFile(searchItem)) {
            System.out.println("Found " + searchItem + " in grocery list");
        } else {
            System.out.println(searchItem + " is not in the grocery list");
        }
    }
}
