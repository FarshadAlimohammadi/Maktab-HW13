package ir.maktabsharif;

public class CheckingAccount {
    private int balance;

    public CheckingAccount(int balance) {
        this.balance = balance;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException e) {

            }
            if (amount <= balance) {
                balance -= amount;
                return true;
            } else
                return false;
        }
        return false;
    }
}
