/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: fives calculates fives score given obj Dice and extends Category
*/

public class Fives extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        int number = d.count(5);
        int score = number*5;

        return score;
    }
}

