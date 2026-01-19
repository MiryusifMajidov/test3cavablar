package task29dec2025;

public class BankAccount {
    double balance = 100;

    void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Balans kifayət etmir");
        }
        balance -= amount;
    }
}
