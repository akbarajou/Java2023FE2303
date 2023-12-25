public class BankAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;


    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


    public void deposit(double amount) { balance += amount; }

    public void withdrawal(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds");
    }

    public void displayBalance() { System.out.println("Balance: " + balance); }

}
