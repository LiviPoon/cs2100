import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.*;

// TASK #3 Add the file I/O import statement here
/**
 This class reads numbers from a file, calculates the
 mean and standard deviation, and writes the results
 to a file.
*/
public class StatsDemo{
 // TASK #3 Add the throws clause
    public static void main(String[] args)throws Exception {
        double sum = 0; // The sum of the numbers
        int count = 0; // The number of numbers added
        double mean = 0; // The average of the numbers
        double stdDev = 0; // The standard deviation
        String line; // To hold a line from the file
        double difference; // The value and mean difference
        // Create an object of type Scanner
        // Scanner keyboard = new Scanner (System.in);
        // Prompt the user and read in the file name
        System.out.println("This program calculates " +
        "statistics on a file " +
        "containing a series of numbers");
        // System.out.print("Enter the file name: ");
        // String filename = keyboard.nextLine();

        File file = new File("numbers.txt");
        Scanner numbers = new Scanner(file);
        
        while (numbers.hasNext()){
            double currentNumber = numbers.nextDouble();
            System.out.println(currentNumber);

            sum += currentNumber;

            count++;

        }

        numbers.close();

        mean = sum/count;

        Scanner numbers2 = new Scanner(file);

        double standardDeviation = 0;
        count = 0;


        sum = 0;
    
        while (numbers2.hasNext()){
            double currentNumber = numbers2.nextDouble();
            System.out.println(currentNumber);

            double dif = currentNumber-mean;

            sum += Math.pow(dif, 2);

            count++;
        }

        double variance = sum / (count);

        standardDeviation = Math.sqrt(variance);

        FileWriter fwriter = new FileWriter("numberSummary.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        outputFile.printf("mean: %f ", mean);
        outputFile.printf("StandardDeviation: %f", standardDeviation);

        numbers2.close();
        outputFile.close();


        }
}