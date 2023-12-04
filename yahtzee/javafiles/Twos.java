package yahtzee;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: twos calculates twos score given obj Dice and extends Category
*/

public class Twos extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(2);
        int score = number*2;

        return score;
    }
}

