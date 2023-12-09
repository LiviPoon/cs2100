package yahtzee;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: fullhouse checks to see if there are three of a kind and two of a kind in Dice arraylist , if so return 25, if not return 0
*/

public class FullHouse extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     */

    // @Override
    public int evaluate(Dice d){
        if (d.count(1) == 3 || d.count(2) == 3 || d.count(3) == 3 || d.count(4) == 3 || d.count(5) == 3 || d.count(6) == 3)
            if((d.count(1) == 2 || d.count(2) == 2 || d.count(3) == 2 || d.count(4) == 2 || d.count(5) == 2 || d.count(6) == 2))
                return 25;

        return 0;
    }
}

