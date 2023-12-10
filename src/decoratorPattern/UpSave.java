package decoratorPattern;

public class UpSave implements BankAccountDecorator {
    private SavingsAccount account;

    public UpSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public String showAccountType() {
        return "UpSave";
    }

    @Override
    public double getInterestRate() {
        return 0.04; // 4.0%
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", With Insurance";
    }

    @Override
    public double computeBalanceWithInterest() {
        return account.getBalance() * (1 + this.getInterestRate());
    }

    @Override
    public String showInfo() {
        return account.showInfo();
    }
}