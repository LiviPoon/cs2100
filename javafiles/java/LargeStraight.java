/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: LargeStraight checks to see if there is a straight of five numbers, if so return 40, if not return 0
*/

public class LargeStraight extends Category{

     /**
     * evaluates overrides abstract method evaluate in super class
     */

    // @Override
    public int evaluate(Dice d){
        if (d.getNumDice() < 4) {
            // If there are less than 4 dice, it's not possible to have four consecutive numbers
            return 0;
        }
        if (d.contains(2) && d.contains(3) && d.contains(4) && d.contains(5)){
            if (d.contains(1) || d.contains(6)){
                return 40;
            }
            
        }

        return 0;
    }
}

