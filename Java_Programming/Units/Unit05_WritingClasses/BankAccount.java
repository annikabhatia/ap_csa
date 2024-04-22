package Units.Unit05_WritingClasses;

public class BankAccount {
    int accNumber;
    double accBalance;

    public void deposit(int amountAdded) {
        accBalance+=amountAdded;
    }

    public void withdraw(int amountSubtracted) {
        accBalance-=amountSubtracted;
    }
}

