/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: fours calculates fours score given obj Dice and extends Category
*/

public class Fours extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(4);
        int score = number*4;

        return score;
    }
}

