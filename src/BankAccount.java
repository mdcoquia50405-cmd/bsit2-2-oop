
public class BankAccount {
    static String bankName = "Liceo Bank";
    static int totalAccounts = 0;
    static double interestRate = 0.03;

    private String accountNumber;
    private String accountHolderName;
    private double balance;

    public static String generateAccountNumber() {
        totalAccounts++;
        return String.format("ACC%03d", totalAccounts);
    }

    public BankAccount(String accountHolderName, double initialBalance) {
        this.accountHolderName = accountHolderName;
        this.balance = initialBalance;
        this.accountNumber = generateAccountNumber();
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println(accountHolderName + " deposited $" + amount + ". New balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println(accountHolderName + " withdrew $" + amount + ". New balance: $" + balance);
        } else {
            System.out.println("Insufficient funds for " + accountHolderName);
        }
    }

    public double calculateInterest() {
        return balance * interestRate;
    }

    public void displayAccountInfo() {
        System.out.println("Account Created: " + accountNumber + " for " + accountHolderName + " with initial balance: $" + balance);
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }
}
