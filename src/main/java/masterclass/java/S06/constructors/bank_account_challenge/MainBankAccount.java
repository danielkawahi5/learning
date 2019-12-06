package masterclass.java.S06.constructors.bank_account_challenge;

public class MainBankAccount {

    public static void main(String[] args) {
        BankAccount danielsAccount = new BankAccount();
        BankAccount tomsAccount = new BankAccount("1547888813", 12000.00, "Tom Banana", "tom@banana.com", "145-4578-64");

        danielsAccount.depositFunds(1500.00);
        danielsAccount.withdrawal(2000.00);

        danielsAccount.depositFunds(1000.00);
        danielsAccount.withdrawal(2000.00);
    }
}
