
// must use getters in order to see private member vars

class BankAccount{
    //member vars
    private int accountNumber;
    private double checkingBalance;  // ask John or someone else to better explain private
    private double savingsBalance; 
    private static double totalBalance;
    private static int numberOfAccounts = 0;

    //constructor
    public BankAccount(int accountNumber, double checkingBalance, double savingsBalance){
        this.accountNumber = accountNumber;
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
        numberOfAccounts++;
    }

    //method
    public String getSavings() {
        String savings = String.valueOf(this.savingsBalance);
        return "Your savings balance is: " + savings;
    }


    public void checkingDeposit(double depositAmount){
        checkingBalance += depositAmount;
        totalBalance += depositAmount;
    }
    
    public void savingsDeposit(double depositAmount){
        savingsBalance += depositAmount;
        totalBalance += depositAmount;
    }

    public double savingsWithdrawal(double withdrawalAmount){
        if(withdrawalAmount > savingsBalance){
            return savingsBalance;
        }else{
            savingsBalance -= withdrawalAmount;
        }
        return savingsBalance;
    }

    public double checkingWithdrawal(double withdrawalAmount){
        if(withdrawalAmount > checkingBalance){
            return checkingBalance;
        }else{
            checkingBalance -= withdrawalAmount;
        }
        return checkingBalance;
    }

    public String getTotal(){
        String total = String.valueOf(this.savingsBalance + this.checkingBalance);
        return "Your total balance is: " + total;
    }

    //getters and setters
    public double getCheckingBalance() {  // 
        return this.checkingBalance;
    }

}
