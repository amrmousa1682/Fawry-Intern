import java.util.ArrayList;

public class Bank {
    ArrayList<Account> accounts;

    public Account addAccount(String accountHolderName, double balance) throws Exception {
        if (accounts == null)
            accounts = new ArrayList<>();
        Account newAccount = new SavingsAccount(accountHolderName, balance);
        accounts.add(newAccount);
        return newAccount;
    }

    private Account findAccount(long accountNumber) throws Exception {
        if (accounts == null)
            throw new Exception("account number is not exist");
        Account accountRef = null;
        for (Account account : accounts) {
            if (account.getAccountNumber() == accountNumber) {
                accountRef = account;
                break;
            }
        }
        if (accountRef == null)
            throw new Exception("account number is not exist");
        return accountRef;
    }

    public void deposit(long accountNumber, double value) throws Exception {
        findAccount(accountNumber).deposit(value);
    }

    public void withdraw(long accountNumber, double value) throws Exception {
        findAccount(accountNumber).withdraw(value);
    }

    public void displayBalance(long accountNumber) throws Exception {
        System.out.println("account balance : " + findAccount(accountNumber).getBalance());
    }

    public void displayCalculatedInterest(long accountNumber) throws Exception {
        System.out.println("interest : " + ((SavingsAccount) findAccount(accountNumber)).calculateInterest());
    }
}
