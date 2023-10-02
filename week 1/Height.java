/*
Livi Poon
CS 2100 Intermediate Programming
Description of Project: Takes in name and height in inches and prints out name and height translated to feet & inches.    
*/

import java.util.Scanner; 

class calculateHeight { 
    public static void main(String[] args) { 

        //grab name and height in inches
        Scanner myInput = new Scanner(System.in); 
        System.out.print("Your name?"); 
        String name = myInput.nextLine(); 

        System.out.print("How tall are you in inches?");
        int tmpDividend = myInput.nextInt();

        //calculated height in feet and inches
        int feet = tmpDividend/12; //calculate Feet
        int additionalInches = tmpDividend%12; //calculate additional inches.
        System.out.println(name + " is " + feet  + " feet, " + additionalInches + " inches tall");
    }
}