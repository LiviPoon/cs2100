/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Savings account class, with options to grab the value hidden variables,
and methods to withdrawal, deposit, and add interest.
*/

import java.io.*;
import java.util.Scanner;

public class SavingsAccount{
    //declare variables (class scope)
    private double balance; 
    private double interestRate;
    private double lastInterest;
    private double monthlyInterestRate;


    //class constructor
    public SavingsAccount(double bal, double intRT){
        balance = bal;
        interestRate = intRT/100.0;
        monthlyInterestRate = interestRate/12.0;
    }

    /**
     * method withdrawal withdrawals input value from balance
     * @param  amountWithdraw amount to be withdrawn from the balance
     */

    public void withdrawal(double amountWithdraw){
        balance -= amountWithdraw;
    }

    /**
     * method deposit deposits input value from balance
     * @param  amountdeposit amount to be deposit into balance
     */
    public void deposit(double amountDeposit){
        balance += amountDeposit;
    }

    /**
     * method addInterest adds monthly interest to balance
     */

    public void addInterest(){
        balance = balance*(1.0+monthlyInterestRate);
    }

    /**
     * method getBalance returns the current balance
     * @return returns current balance
     */

    public double getBalance(){
        return balance;
    }

    /**
     * method getInterestRate returns the set annual interest rate
     * @return returns set interest rate
     */
    public double getInterestRate(){
        return interestRate;
    }

    /**
     * method getLastInterest gets the amount of interest earned last month
     * @return returns the amount of interest earned last month.
     */
    public double getLastInterest(){
        double lastInterestCAL = (balance/(1.0+monthlyInterestRate))*(monthlyInterestRate);
        return lastInterestCAL;
    }
}




