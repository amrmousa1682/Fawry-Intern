import java.util.Scanner;

public class BankApplication {
    private static final Scanner in = new Scanner(System.in);

    private static int menuHandler() throws Exception {
        System.out.println("1- add account");
        System.out.println("2- display account balance");
        System.out.println("3- add a deposit in an account");
        System.out.println("4- withdraw money from account");
        System.out.println("5- calculate interest");
        System.out.println("6- exit");
        System.out.print("Enter your choice : ");
        int menuChoice = in.nextInt();
        if (menuChoice > 6 || menuChoice <= 0)
            throw new Exception("choice is not valid");
        return menuChoice;
    }

    private static long takeAccountNumber() {
        System.out.print("Enter account number : ");
        return in.nextLong();
    }

    private static double takeAmountOfMoney() {
        System.out.print("Enter amount of money: ");
        return in.nextDouble();
    }

    private static void addAccountHandler(Bank bank) throws Exception {
        System.out.print("Enter account holder name : ");
        String name = in.next();
        System.out.print("Enter account balance : ");
        Account addedAccount = bank.addAccount(name, in.nextDouble());
        System.out.println("account add successfully");
        System.out.println("account number : " + addedAccount.getAccountNumber());
    }


    private static void withdrawHandler(Bank bank) throws Exception {
        bank.withdraw(takeAccountNumber(), takeAmountOfMoney());
        System.out.println("process done successfully");
    }

    private static void depositHandler(Bank bank) throws Exception {
        bank.deposit(takeAccountNumber(), takeAmountOfMoney());
        System.out.println("process done successfully");
    }

    private static void calculateInterestHandler(Bank bank) throws Exception {
        bank.displayCalculatedInterest(takeAccountNumber());
    }

    private static void balanceHandler(Bank bank) throws Exception {
        bank.displayBalance(takeAccountNumber());
    }

    public static void main(String[] args) {
        System.out.println("Bank Application");
        Bank bank = new Bank();
        boolean flag = true;
        while (flag) {
            try {
                int menuChoice = menuHandler();
                switch (menuChoice) {
                    case 1:
                        addAccountHandler(bank);
                        break;
                    case 2:
                        balanceHandler(bank);
                        break;
                    case 3:
                        depositHandler(bank);
                        break;
                    case 4:
                        withdrawHandler(bank);
                        break;
                    case 5:
                        calculateInterestHandler(bank);
                        break;
                    case 6:
                        flag = false;
                        break;
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}