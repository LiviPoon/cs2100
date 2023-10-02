import java.util.Random; //to use the random number generator
/**
 This class simulates rolling a pair of dice 10,000 times and
 counts the number of times doubles of are rolled for each different
 pair of doubles.
*/
public class DiceSimulationForLoop{
    public static void main(String[] args){
        final int NUMBER = 10000; //the number of times to roll the dice
        //a random number generator used in simulating rolling a dice
        Random generator = new Random();

        // int dieMax = 6; // number of spots on the first die
        // int dieMin = 1; // number of spots on the second die
        int rolls = 0; // number of times the dice were rolled
        int snakeEyes = 0; // number of times snake eyes is rolled
        int twos = 0; // number of times double two is rolled
        int threes = 0; // number of times double three is rolled
        int fours = 0; // number of times double four is rolled
        int fives = 0; // number of times double five is rolled
        int sixes = 0; // number of times double six is rolled

        for (int count = 0; count<10000; count++){
            int die1Value = generator.nextInt(6)+1;
            int die2Value = generator.nextInt(6)+1;

            if (die1Value==die2Value){
                if (die1Value == 1){
                    snakeEyes++;
                }

                else if (die1Value == 2){
                    twos++;
                }

                else if (die1Value == 3){
                    threes++;
                }

                else if (die1Value == 4){
                    fours++;
                }

                else if (die1Value == 5){
                    fives++;
                }

                else if (die1Value == 6){
                    sixes++;
                }

            }

            rolls++;
        }

        //ENTER YOUR CODE FOR THE ALGORITHM HERE
        System.out.println ("You rolled snake eyes " + snakeEyes +
        " out of " + rolls + " rolls.");
        System.out.println ("You rolled double twos " + twos +
        " out of " + rolls + " rolls.");
        System.out.println ("You rolled double threes " + threes +
        " out of " + rolls + " rolls.");
        System.out.println ("You rolled double fours " + fours +
        " out of " + rolls + " rolls.");
        System.out.println ("You rolled double fives " + fives +
        " out of " + rolls + " rolls.");
        System.out.println ("You rolled double sixes " + sixes +
        " out of " + rolls + " rolls.");
    }
}