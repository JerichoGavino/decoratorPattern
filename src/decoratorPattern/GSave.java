package decoratorPattern;

public class GSave implements BankAccountDecorator {
    private SavingsAccount account;

    public GSave(SavingsAccount account) {
        this.account = account;
    }

    @Override
    public String showAccountType() {
        return "GSave";
    }

    @Override
    public double getInterestRate() {
        return 0.025; // 2.5%
    }

    @Override
    public String showBenefits() {
        return account.showBenefits() + ", GCash Transfer";
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