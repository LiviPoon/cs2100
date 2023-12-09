/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: fiveofakind checks to see if there are five of a kind in Dice arraylist, if so return sum, if not return 0
*/

public class FiveOfAKind extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     * @param d input dice
     * @return return score
     */

    // @Override
    public int evaluate(Dice d){
        if (d.count(1) == 5 || d.count(2) == 5 || d.count(3) == 5 || d.count(4) == 5 || d.count(5) == 5 || d.count(6) == 5)
            return 50;

        return 0;
    }
}

