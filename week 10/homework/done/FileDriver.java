/**
 * Livi Poon
 * Cs2100 - Intermediate Programming
 * The FileDriver class is a program that reads names from a file, performs various operations on the names,
 * and then outputs the results.
 */
import java.util.Scanner;

public class FileDriver {


    /**
     * The main method of the program where the execution starts.
     *
     * @param args The command line arguments passed to the program (not used in this program).
     */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file: ");
        String filename = scanner.nextLine();

        int numberOfNames = 0;
        while (numberOfNames <= 0) {
            try {
                System.out.print("How many names would you like to search through?  ");
                numberOfNames = scanner.nextInt();

                if (numberOfNames < 0)
                {
                    System.out.println("Enter a positive int. ");

                }

            } catch (NumberFormatException e) {
                System.out.print("That was not a positive int. Please input a positive int");
            }


            
        }

        // Create the array
        String[] names = new String[numberOfNames];
        int namesLength = ArrayFunctions.readArray(filename, names);

        if (namesLength < numberOfNames) {
            System.out.println("Warning: Only " + namesLength + " names read from the file.");
        }

        ArrayFunctions.selectionSort(names, namesLength);
        boolean namesWritten = ArrayFunctions.writeArray("sorted_" + filename, names);

        String nameInQuestion = "Larkin";

        int spot = ArrayFunctions.binarySearch(names, 0, namesLength, nameInQuestion);

        if (spot == -1){
            System.out.println(nameInQuestion + "not found");
        }

        else
            System.out.println(names[spot] + " found at: " + spot);

        

        scanner.close();

    }
}