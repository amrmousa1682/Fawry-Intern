public class Account {
    protected long accountNumber;
    protected double balance;
    protected String accountHolderName;

    Account(String accountHolderName, double balance) throws Exception {
        if (balance < 0) throw new Exception("balance is not valid");
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        accountNumber = (long) (Math.random() * 1000000000) + 1;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) throws Exception {
        if (value <= 0) throw new Exception("amount of money is not valid");
        balance += value;
    }

    public void withdraw(double value) throws Exception {
        if (value <= 0) throw new Exception("amount of money  is not valid");
        if (value > balance) throw new Exception("the maximum amount you can withdraw from this account is " + balance);
        balance -= value;
    }
}
