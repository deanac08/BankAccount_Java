

public class TestAccount{
    public static void main(String[] args){

        BankAccount account1 = new BankAccount(001, 20, 16.25);

        account1.checkingDeposit(250.12);
        // System.out.println(account1.checkingBalance);
        System.out.println(account1.getCheckingBalance());
        



        // System.out.println(account1.accountNumber);
        // account1.checkingWithdrawal(2.46);
        // account1.savingsDeposit(560.0);
        // System.out.println(account1.getChecking());
        // System.out.println(account1.getTotal());
    }
}