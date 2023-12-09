

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: chance no matter the combination of die, add them all up and return the sum
*/

public class Chance extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     */

    // @Override
    public int evaluate(Dice d){
        return d.sum();
    }
}

