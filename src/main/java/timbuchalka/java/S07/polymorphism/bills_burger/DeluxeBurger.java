package timbuchalka.java.S07.polymorphism.bills_burger;

public class DeluxeBurger extends Hamburger {
    public DeluxeBurger() {
        super("Deluxe", "Sausage and Bacon", 14.00, "White");
        super.addHamburgerAddition1("Chips", 2.10);
        super.addHamburgerAddition2("Drink", 1.50);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("Can not add addition to DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("Can not add addition to DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("Can not add addition to DeluxeBurger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("Can not add addition to DeluxeBurger");
    }
}
