public class PowerSavings extends SavingsAccount {
    public static final double PENALTY = 2.5;
    private int rate = 5;
    private int numMonthMature;
    private int monthElasped;

    public PowerSavings(String n, double initial, int numMonth){
        super(n, initial);
        this.numMonthMature = numMonth;
        this.monthElasped = 0;
    }

    public void addAMonth(){
        this.monthElasped+= 1;
        super.deposit(getBalance()*(this.rate/12));
    }

    @Override
    public boolean withdraw(double amount){
        boolean completed = true;

        if (amount <= super.getBalance())
        {
            if (this.monthElasped >= this.numMonthMature){
                super.setBalance(super.getBalance() - amount);
            }

            else{
                super.setBalance(super.getBalance() - (amount*PENALTY));
            }
        }
        else
        {
            completed = false;
        }
        return completed;
    }

    public int getNumMonthMature(){
        return this.numMonthMature;
    }

    public int getElapsedMonths(){
        return this.monthElasped;
    }


    @Override
    public String toString(){
        return String.format("%s, %s, $%f: %d months elapsed : %d months required",super.getOwner(), super.getAccountNumber(), super.getBalance(), this.monthElasped, this.numMonthMature);
    }

}
