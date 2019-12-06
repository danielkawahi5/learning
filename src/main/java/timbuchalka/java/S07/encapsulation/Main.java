package timbuchalka.java.S07.encapsulation;

public class Main {
    public static void main(String[] args) {

        Printer printer = new Printer(50, false);
        System.out.println("initial page count = " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was " + pagesPrinted + " new total print count for printer " + printer.getPagesPrinted());


/*
        EnhancedPlayer player = new EnhancedPlayer("Daniel", 100, "Bazooooka");
        System.out.println("initial health is " + player.getHealth());
*/




        /*Player player = new Player();

        player.name = "Daniel";
        player.health = 100;
        player.weapon = "AK47";

        int damage = 20;
        player.loseHealth(damage);
        System.out.println("ramaining health " + player.healthRemaining());

        damage = 81;
        player.loseHealth(damage);
        System.out.println("ramaining health " + player.healthRemaining());*/
    }
}
