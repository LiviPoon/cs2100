

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: threes calculates threes score given obj Dice and extends Category
*/

public class Threes extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(3);
        int score = number*3;

        return score;
    }
}

