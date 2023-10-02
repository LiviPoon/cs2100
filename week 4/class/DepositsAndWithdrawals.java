/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Creates a savings account with the inputed interest rate and starting 
balance, then opens Withdrawals.txt and Deposits.txt and utilizes the savings account
class methods to do the subsequent actions. Program reports interest earned at the end 
of the month and current balance.
*/

import java.util.Scanner;
import java.io.*;

public class DepositsAndWithdrawals{

    //create static main method
    public static void main(String[] args) throws Exception {

        //create scanner keyboard input and open files.
        Scanner input = new Scanner(System.in);

        File withdrawalFile = new File("Withdrawals.txt");
        File depositFile = new File("Deposits.txt");

        Scanner withdrawalValues = new Scanner(withdrawalFile);
        Scanner depositValues = new Scanner(depositFile);


        //grab use annual interest rate and starting balance
        System.out.print("Enter the savings account's annual interest rate: ");
        double inputRate = input.nextDouble();
        System.out.print("Starting Balance: ");
        double startingBalance = input.nextDouble();

        //create a SavingsAccount
        SavingsAccount savings = new SavingsAccount(startingBalance, inputRate);


        //run through withdrawal and deposit files, update savingsaccount accordingly
        while(depositValues.hasNext()){
            double currentDepositValue = depositValues.nextDouble();

            savings.deposit(currentDepositValue);

            double currentBalance = savings.getBalance();

            System.out.printf("%nDeposit: $%.2f, balance = $%.2f", currentDepositValue, currentBalance);
        }

         while(withdrawalValues.hasNext()){
            double currentWithdrawalValue = withdrawalValues.nextDouble();

            savings.withdrawal(currentWithdrawalValue);

            double currentBalance = savings.getBalance();

            System.out.printf("%nWithdrawal: $%.2f, balance = $%.2f", currentWithdrawalValue, currentBalance);
        }

        //close files

        withdrawalValues.close();
        depositValues.close();

        //add interest at the end of the month and calculate the final balance & how much interest earned last month.

        savings.addInterest();
        double currentBalance = savings.getBalance();
        double interestEarned = savings.getLastInterest();

        //print out results.

        System.out.printf("%nInterest earned: $%.2f", interestEarned);
        System.out.printf("%nEnding balance: $%.2f", currentBalance);

    }

}










