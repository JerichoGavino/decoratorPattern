package decoratorPattern;

public interface BankAccountDecorator {
    String showAccountType();
    double getInterestRate();
    String showBenefits();
    double computeBalanceWithInterest();
    String showInfo();
}