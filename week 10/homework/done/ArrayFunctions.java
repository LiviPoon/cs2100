import java.util.Scanner;
import java.io.*;


/**
 * Livi Poon
 * Cs2100 - Intermediate Programming
 * The ArrayFunctions class contains utility methods for working with arrays of strings.
 */

public class ArrayFunctions {
    
    /**
     * Reads data from a file and populates an array with the read values.
     *
     * @param fName The name of the file to read.
     * @param array The array to populate with the read values.
     * @return The number of elements loaded into the array.
     */

    // private static String[] array = new String[10];

    public static int readArray(String fName, String[] array){
        File file = new File(fName);
        try{
            Scanner withdrawalValues = new Scanner(file);
            int numLoaded = 0;
            while(withdrawalValues.hasNext() && numLoaded < array.length){
                array[numLoaded] = withdrawalValues.nextLine();
                numLoaded++;
            }

            withdrawalValues.close();
            
            return numLoaded;
        }

        catch (NullPointerException e){
            return 0;
        }

        catch (FileNotFoundException e){
            return 0;
        }
    }

        /**
     * Writes the contents of an array to a file.
     *
     * @param fname The name of the file to write.
     * @param array The array whose elements will be written to the file.
     * @return true if the write operation is successful, false otherwise.
     */

    public static boolean writeArray(String fname,String[] array) {
        try {
            FileWriter fwriter = new FileWriter(fname, true);
            PrintWriter outputFile = new PrintWriter(fwriter);

            for(String x : array){
                outputFile.println(x);
            }
            outputFile.close();
            return true;
        }
        
        catch (NullPointerException e){
            return false;
        }

        catch (FileNotFoundException e){
            return false;
        }

        catch (IOException e) {
            return false;
        }
    }

     /**
     * Sorts an array of strings using the selection sort algorithm.
     *
     * @param array The array to be sorted.
     * @param n     The number of elements in the array to consider during sorting.
     */

    public static void selectionSort(String[] array, int n) {
        int startScan, index, minIndex;
        String minValue;
        for (startScan = 0; startScan < (n - 1); startScan++) {
            minIndex = startScan;
            minValue = array[startScan];
            for (index = startScan + 1; index < n; index++) {
                if (array[index].compareTo(minValue) < 0) {
                    minValue = array[index];
                    minIndex = index;
                }
            }
    
            array[minIndex] = array[startScan];
            array[startScan] = minValue;
        }
    }

    /**
     * Performs binary search on a sorted array of strings to find a specific value.
     *
     * @param array The sorted array to search.
     * @param first The index of the first element to consider in the search.
     * @param last  The index of the last element to consider in the search.
     * @param value The value to search for in the array.
     * @return The index of the found value if present, otherwise -1.
     */


    public static int binarySearch(String[] array, int first, int last, String value) {
        if (first > last) {
            return -1; // Value not found
        }
    
        int middle = (first + last) / 2;
    
        if (array[middle].compareTo(value) == 0) {
            return middle; // Value found at index 'middle'
        } else if (array[middle].compareTo(value) < 0) {
            return binarySearch(array, middle + 1, last, value);
        } else {
            return binarySearch(array, first, middle - 1, value);
        }
    }

    
}
