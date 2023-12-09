/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: DiceRoll is object which takes all of the dice and rolls them.
*/

public class DiceRoll extends Dice {
    private static final int NUM_DIE = 5;

     /**
     * constructor DiceRoll takes in nothing and inits super to NUM_DIE
     */
    public DiceRoll(){
        super(NUM_DIE);
    }

    /**
     * method toss takes in nothing and returns nothing, but rolls all die in super.
     */
    public void toss(){
        for (int i = 0; i<=4; i++){
            Die current = super.getDie(i);
            current.roll();
        }
    }
}
