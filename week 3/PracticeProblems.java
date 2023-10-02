import java.lang.Math;

public class PracticeProblems {

    public static void main(String [] args) {

        boolean outputVowel = myVowel('A');

        System.out.print(outputVowel);

        String outputString = trim("SDLKFJSDLKJF       ");

        System.out.print(outputString);

        double value = futureValue(123134.0, .035, 10);

        System.out.printf("%n%f", value);

    }

    /**
     * method myVowel takes in a character and returns a true and false value depending on if ch is a vowel.
     * 
     * @param ch input character 
     * @return returns true if ch is a vowel, false if it isn't
     */

    public static boolean myVowel(char ch){

        char input = Character.toLowerCase(ch);

        if(input == 'a' || input == 'e' || input == 'i' || input == 'o' || input == 'u' ||input == 'y'){
            return true;
        }

        return false;
    }

    /** Method trim() will take a String and return the String with any trailing spaces removed
    * @param s String to trimmed
    * @return trimmed string
    */

   public static String trim(String s){
        String outputString = s.stripTrailing();

        return outputString;
   }

   /** The futureValue method takes two double parameters, for present value and annual interest rate, and an integer # of years and determines
    * future value. Formula requires interest rate as .035 for 3.5%
    * futureVal = presentValue * (1 + monthlyInterestRate) ^ (# of months)
    * @param presentValue starting value of investment
    * @param rate annual interest rate (e.g., 3.5 for 3.5%)
    * @param years number of years
    * @return future value of investment
 */

    public static double futureValue (double presentValue, double rate, int years){

        int numMonths = years*12;
        double monthRate = rate/12.0;

        double futureVal = presentValue * Math.pow((1.0 + monthRate),numMonths);

        return futureVal;
    }
}