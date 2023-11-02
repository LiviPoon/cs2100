public class powerDriver {
    public static void main(String [] args){
        BankAccount[] accounts = new BankAccount[3];

        PowerSavings p = new PowerSavings("Livi", 1000, 2);
        CheckingAccount ca = new CheckingAccount("Livi", 1000);
        SavingsAccount sa = new SavingsAccount("Livi", 1000);

        accounts[0] = p;
        accounts[1] = ca;
        accounts[2] = sa;

        for (int i = 0; i <= accounts.length-1; i++){
            accounts[i].getBalance();
        }

        for (int i = 0; i <= accounts.length-1; i++){
            accounts[i].deposit(100);
        }

        for (int i = 0; i <= accounts.length-1; i++){
            System.out.println(accounts[i]);
        }






    }

}
