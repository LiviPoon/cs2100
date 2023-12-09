
/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Category is the parent class of all of the different way's to score.
It is an abstract class which can be altered by its children.
*/

public abstract class Category {
    private int score;
    private boolean used;

    /**
     * abstract evaluate function... this function will be declared in all children classes
     */
    public abstract int evaluate(Dice d);
    
    /**
     * method addValue takes in dice, evaluates it, adds it to the score, and then sets it to true
     * @param d input dice.
     */
    public void addValue(Dice d){
        if (!used) {
            int valueToAdd = evaluate(d);
            score += valueToAdd;
            used = true;
        } else {
            System.out.println("Category already used.");
        }
    }

    /**
     * getScore returns the score of the category.
     * @return returns score in int
     */
    public int getScore(){
        return score;
    }

    /**
     * getUsed returns if the category has been used or not 
     * @return returns boolean, true if the category has been used.
     */
    public Boolean getUsed(){
        return used;
    }

}
