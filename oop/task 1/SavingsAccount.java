public class SavingsAccount extends Account {
    private double interestRate = 2.5;

    SavingsAccount(String accountHolderName, double balance) throws Exception {
        super(accountHolderName, balance);
    }

    public double calculateInterest() {
        return (interestRate * balance) / 100.0;
    }
}
