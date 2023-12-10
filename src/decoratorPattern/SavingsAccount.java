package decoratorPattern;

public class SavingsAccount {
    private int accountNumber;
    private String accountName;
    private double balance;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return this.balance;
    }

    public String showInfo() {
        return "Account Number: " + this.accountNumber + "\nAccount Name: " + this.accountName + "\nBalance: " + this.balance;
    }

    public String showAccountType() {
        return "Savings Account";
    }

    public double getInterestRate() {
        return 0.01; // 1%
    }

    public double computeBalanceWithInterest() {
        return this.balance * (1 + this.getInterestRate());
    }

    public String showBenefits() {
        return "Standard Savings Account";
    }
}