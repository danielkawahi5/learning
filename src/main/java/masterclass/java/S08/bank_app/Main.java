package masterclass.java.S08.bank_app;

public class Main {

    public static void main(String[] args) {

        Bank bank = new Bank("Santander");

        bank.addBranch("Cracow");

        bank.addCustomer("Cracow", "Daniel", 30.00);
        bank.addCustomer("Cracow", "Kamil", 40.00);
        bank.addCustomer("Cracow", "Michal", 50.00);

        bank.addBranch("Wroclove");
        bank.addCustomer("Love", "Bob", 45.00);

        bank.addCustomerTransaction("Cracow", "Daniel", 9.50);
        bank.addCustomerTransaction("Cracow", "Daniel", 5.50);
        bank.addCustomerTransaction("Cracow", "Michal", 60.00);

        bank.listCustomers("Cracow",true);

    }
}
