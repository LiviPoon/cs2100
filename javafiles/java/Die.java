/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Die class creates die
*/

import java.util.Random;

public class Die{
    private int value;
    private static final int SIDES = 6;
    private Random r = new Random();


    /**
     * constructor die takes in nothing, but initializes random side
     */
    public Die(){
        value = r.nextInt(SIDES) + 1;
    }

    /**
     * method roll takes in nothing, and sets the value of the die to a random int
     */

    public void roll(){
        value = r.nextInt(SIDES) + 1;
    }

    /**
     * method getValue returns the value of the die
     * @return value of die int
     */

    public int getValue(){
        return value;
    }

    /**
     * toString overrides default to string method
     * @return return value of the die
     */

    @Override
    public String toString(){
        return String.format("%d", value);
    }
}
