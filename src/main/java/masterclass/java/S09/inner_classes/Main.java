package masterclass.java.S09.inner_classes;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    private static Button button = new Button("Print");

    public static void main(String[] args) {
        /*GearBox mclaren = new GearBox(6);
        mclaren.operateClutch(true);
        mclaren.changeGear(1);
        mclaren.operateClutch(false);
        System.out.println(mclaren.wheelSpeed(1000));
        mclaren.changeGear(2);
        System.out.println(mclaren.wheelSpeed(3000));*/

        /*class ClickListener implements Button.OnClickListener {
            public ClickListener() {
                System.out.println("I habe been attached");
            }

            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        }
        button.setOnClickListener(new ClickListener());*/

        button.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(String title) {
                System.out.println(title + " was clicked");
            }
        });

        listen();
    }
    public static void listen() {
        boolean quit = false;
        while(!quit) {
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    button.onClick();
            }
        }
    }
}
