/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Opens numbers.txt of integers and produces an output file (numberSummary.txt) 
that contains a table with each integer from the input file and an indication of the properties
of the number: Repeating adjacent digits, prime, and even.
*/

// Importing input output classes
import java.io.*;

import java.util.Scanner;

public class NumberTester {
 
    // Main driver method
    public static void main(String[] args) throws Exception
    {
 
        //open files
        File numFile = new File("numbers.txt");
        Scanner numbers = new Scanner(numFile);

        FileWriter fwriter = new FileWriter("numberSummary.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);


        //write header for summary
        String[] strings = {"Number","Digits","Even",  "Prime"};
        outputFile.printf("%20s%n", "Repeat");
        outputFile.printf("%10s%10s%10s%10s", (Object[])strings);

        while (numbers.hasNext()){
            int currentNumber = numbers.nextInt();

            //declare variables
            String prime;
            String even;
            String repeatedDigits;

            String pBStr;
            String eBStr;
            String rDBStr;

            //grab results from methods
            boolean primeBool = isPrime(currentNumber);
            boolean evenBool =  isEven(currentNumber);
            boolean rDBool = isRepeatedDigits(currentNumber);

            //switch true/false statements to + & -
            if (primeBool == true)
                pBStr = "+";

            else
                pBStr = "-";

            if (evenBool == true)
                eBStr = "+";

            else
                eBStr = "-";


            if (rDBool == true)
                rDBStr = "+";

            else
                rDBStr = "-";
            
            //print output for current number in outputfile.
            outputFile.printf("%n%10d%10s%10s%10s", currentNumber, rDBStr, eBStr, pBStr);

        }
        
        //close file
        outputFile.close();
    }

    /**
     * method isPrime takes an integer value and returns true if the number is prime, false otherwise
     * @param  num  input number to method
     * @return      true or false variable based on whether num is prime or not.
     */

    public static boolean isPrime(int num) { 
        for(int i=2;i<num/2;i++){
           if(num%i==0)
                return false;
        }
        return true;   
    }

    /**
     * method isEven takes an integer value and returns true if the number is even, false otherwise
     * @param  num  input number to method
     * @return      true or false variable based on whether number is even or not.
     */

    public static boolean isEven(int num) {
        if (num%2 == 0){
            return true;
        }

        else {
            return false;
        }
    }

    /**
     * method isRepeatedDigits takes an integer value and returns true if the number contains the same digit in adjacent locations in the number, false otherwise
     * @param  num  input number to method
     * @return      true or false variable based on whether number has repeating digits or not.
     */

    public static boolean isRepeatedDigits(int num){ 
        String strNum = Integer.toString(num);

        for(int i = 0; i<strNum.length()-1; i++){ //for every digit
            if (strNum.charAt(i) == strNum.charAt(i+1)){ //compare the two digits
                return true;
            }
        }

        return false; //return false if loop doesn't break
    }

}