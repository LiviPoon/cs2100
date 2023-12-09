package yahtzee;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: smallStraight checks to see if there is a straight of four numbers, if so return 30, if not return 0
*/

public class SmallStraight extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     */

    // @Override
    public int evaluate(Dice d){
        if (d.getNumDice() < 4) {
            // If there are less than 4 dice, it's not possible to have four consecutive numbers
            return 0;
        }

        if (d.contains(3) && d.contains(4)){
            if(d.contains(1) && d.contains(2) || d.contains(2) && d.contains(5) || d.contains(5) && d.contains(6)){
                return 30;
            }
        }
        
        return 0;
    }
}

