
/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: threeofakind checks to see if there are three of a kind in Dice arraylist, if so return sum, if not return 0
*/

public class ThreeOfAKind extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class'
     * @param d input dice
     * @return returns score in int format
     */

    // @Override
    public int evaluate(Dice d){
        if (d.count(1) == 3 || d.count(2) == 3 || d.count(3) == 3 || d.count(4) == 3 || d.count(5) == 3 || d.count(6) == 3)
            return d.sum();

        return 0;
    }
}

