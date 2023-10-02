/*
Livi Poon
CS2100 - Intermediate Programming
Explanation: Small 5 problem subtraction quiz generator which lets you know when 
you got a problem wrong and how many you got right at the end of the quiz.
*/

import java.util.Scanner; 
import java.util.Random;

class SubtractionTutor { 
    public static void main(String [] args){

        //declare variables & final variables
        int numQuestionsCorrect = 0;
        final Random rand = new Random();
        int problems = 0;

        //print prompt
        System.out.println("You will supply a low value and high value, defining the range");
        System.out.println("of values to be included in your quiz.");
        System.out.println("The values must be positive and no larger than 9999.");
        System.out.println("I will give you 5 problems.");

        //promt user for min and max range of subtraction
        final Scanner question = new Scanner(System.in);
        System.out.printf("Low end of range : ");
        int rangeMin = question.nextInt();
        System.out.printf("High end of range : ");
        int rangeMax = question.nextInt();

        //validate values to between 1 and 9999

        if (rangeMin < 1){
            System.out.println("error rangeMin too small... defaulting to 1");
            rangeMin = 1;
        }

        if (rangeMax > 9999){
            System.out.println("error rangeMax too small... defaulting to 9999");
            rangeMax = 9999;
        }
        
        //give student five problems
        while(problems<5){

            int randNum1 =  rand.nextInt(rangeMin+1, rangeMax);
            int randNum2 = rand.nextInt(rangeMin, randNum1);

            System.out.printf("\n%5d\n-%4d\n -----\n",randNum1, randNum2);
            
            final Scanner input = new Scanner(System.in);
            System.out.print("Answer? ");
            int answer = input.nextInt();

            //check if the answer is correct, if it is make sure to take note of how many are correct
            if (answer == randNum1-randNum2){
                System.out.println("Correct!");
                numQuestionsCorrect++;
            }

            else
                System.out.printf("Incorrect! The answer is %d%n", randNum1-randNum2);

            problems++;
        }

        //let the user know how many answers they got right.
        System.out.printf("\nThe quiz is over\n");
        
        if (numQuestionsCorrect == 5)
            System.out.print("Excellent! You got all 5 problems correct.");

        else if (numQuestionsCorrect >= 3)
            System.out.print("You got over half correct, practice makes perfect!");

        else
            System.out.print("You got less than half correct, you need to spend more time practicing.");
    }

}