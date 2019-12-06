package timbuchalka.java.S07.polymorphism.bills_burger;

public class Main {
    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Classic", "Beef", 2.50, "White");
        double price = hamburger.itemizeHamburger();

        hamburger.addHamburgerAddition1("tomato", 0.20);
        hamburger.addHamburgerAddition2("lettuce", 0.50);
        hamburger.addHamburgerAddition3("cheese", 0.80);
        System.out.println("total burger price is " + hamburger.itemizeHamburger());

        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.50);
        healthyBurger.addHealthyAddition1("egg", 1.50);
        healthyBurger.addHealthyAddition2("lentils", 2.20);
        System.out.println("total healthy burger cost " + healthyBurger.itemizeHamburger());

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        deluxeBurger.addHamburgerAddition1("asihgfds", 2.12);
        deluxeBurger.itemizeHamburger();
    }
}
