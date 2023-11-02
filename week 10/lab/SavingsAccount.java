public class SavingsAccount extends BankAccount {
    private double rate = 2.5;
    private int savingsNumber = 0;
    private String accountNumber;

    public SavingsAccount(String n, double initBal){
        super(n, initBal);
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public SavingsAccount(SavingsAccount a, double amount){
        super(a, amount);
        this.savingsNumber = a.savingsNumber + 1;
        this.accountNumber = super.getAccountNumber() + "-" + savingsNumber;
    }

    public void postInterest(){
        super.deposit(getBalance()*(rate/12));
    }

    @Override
    public String getAccountNumber(){
        return this.accountNumber;
    }

    

}
