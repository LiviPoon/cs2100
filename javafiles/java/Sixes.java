
/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: sixes calculates sixes score given obj Dice and extends Category
*/

public class Sixes extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(6);
        int score = number*6;

        return score;
    }
}

