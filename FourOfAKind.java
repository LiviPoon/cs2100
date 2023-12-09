package yahtzee;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: fourofakind checks to see if there are four of a kind in Dice arraylist, if so return sum, if not return 0
*/

public class FourOfAKind extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        if (d.count(1) == 4 || d.count(2) == 4 || d.count(3) == 4 || d.count(4) == 4 || d.count(5) == 4 || d.count(6) == 4)
            return d.sum();

        return 0;
    }


}

