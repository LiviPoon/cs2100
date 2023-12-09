/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Ones calculates ones score given obj Dice and extends Category
*/

public class Ones extends Category {

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(1);
        int score = number*1;

        return score;
    }
}
