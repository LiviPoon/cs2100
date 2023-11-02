public class CheckingAccount extends BankAccount {

    private static final double FEE = 0.15;
    
    public CheckingAccount(String name, double amount){
        super(name, amount);
        String tmpAN = getAccountNumber() + "-10";
        setAccountNumber(tmpAN);

    }

    @Override
    public boolean withdraw(double a){
        double tmpAmount = a + FEE;
        return super.withdraw(tmpAmount);
    }
    
}
