package yahtzee;
import java.util.*;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: scorecard stores all values for score
*/


public class ScoreCard {
    private ArrayList<Category> scorecard;
    private int yahtzeeBonus = 0;
    private final static int NUM_CATS = 13;


    /**
     * constructor creates all Category objects and saves it to scorecard variable
     */
    public ScoreCard(){
        scorecard = new ArrayList<Category>(NUM_CATS);
        Ones a = new Ones();
        Twos b = new Twos();
        Threes c = new Threes();
        Fours d = new Fours();
        Fives e = new Fives();
        Sixes f = new Sixes();
        ThreeOfAKind g = new ThreeOfAKind();
        FourOfAKind h = new FourOfAKind();
        FullHouse i = new FullHouse();
        SmallStraight j = new SmallStraight();
        LargeStraight k = new LargeStraight();
        FiveOfAKind l = new FiveOfAKind();
        Chance m = new Chance();
        
        scorecard.add(a);
        scorecard.add(b);
        scorecard.add(c);
        scorecard.add(d);
        scorecard.add(e);
        scorecard.add(f);
        scorecard.add(g);
        scorecard.add(h);
        scorecard.add(i);
        scorecard.add(j);
        scorecard.add(k);
        scorecard.add(l);
        scorecard.add(m);
    }

    /**
     * choose method gets the gets the score of the cv
     * @param cv is the Category value
     * @param d selected dice to get the score of.
     * @return returns score in int
     */
    public int choose(CategoryValue cv, Dice d){
        if (cv == CategoryValue.YAHTZEE){
            if(scorecard.get(cv.getValue()).getUsed()){
                yahtzeeBonus +=100;
                return 100;
            }
        }
        else{
            scorecard.get(cv.getValue()).addValue(d);
            return scorecard.get(cv.getValue()).getScore();
        }

        return 0;
    }

    /**
     * getEvaluation method evaluates Category value
     * @param cv is the Category value
     * @param d selected dice to get evaluate.
     * @return returns score in int
     */
    public int getEvaluation(CategoryValue cv, Dice d){
        return scorecard.get(cv.getValue()).evaluate(d);

    }

    /**
     * checkScored method gets determines if the Category has already been scored
     * @param cv is the Category value
     * @param d selected dice to determine if dice has been used.
     * @return returns boolean true if used.
     */
    public boolean checkScored(CategoryValue cv, Dice d){
        return scorecard.get(cv.getValue()).getUsed();

    }

    /**
     * method getCategoryScore returns the current score for the specified category
     * @return Return the current score
     */

    public int getCategoryScore(CategoryValue cv){
        return scorecard.get(cv.getValue()).getScore();
    }

    

    /**
     * scoreTop method gets the gets the upper section score of the scorecard
     * @return returns score in int
     */
    public int scoreTop(){
        int total = 0;
        for (int i = 0; i < Math.min(scorecard.size(), 5); i++){
            total+= scorecard.get(i).getScore();
        }

        return total;
    }

    /**
     * scoreBottom method gets the gets the bottom section score of the scorecard
     * @return returns score in int
     */
    public int scoreBottom(){
        int total = 0;

        for (int i = 5; i < Math.min(scorecard.size(),12); i++){
            total+= scorecard.get(i).getScore();
        }

        return total;
    }

    /**
     * scoreTop method gets the gets the total score of the scorecard
     * @return returns score in int
     */
    public int score(){
        int total = 0;

        for (int i = 0; i <scorecard.size(); i++){
            total+= scorecard.get(i).getScore();
        }

        if(scoreTop()>= 63){
            total+=35;
        }

        return total;
    }

    /**
     * toString method overrides default method and prints in the correct format
     * @return returns strin output.
     */
    @Override
    public String toString(){
        return String.format("Current Scorecard:\n" +
        " Ones:             %2d\n" +
        " Twos:             %2d\n" +
        " Threes:           %2d\n" +
        " Fours:            %2d\n" +
        " Fives:            %2d\n" +
        " Sixes:            %2d\n" +
        " Three of a Kind:  %2d\n" +
        " Four of a Kind:   %2d\n" +
        " Full House:       %2d\n" +
        " Small Straight:   %2d\n" +
        " Large Straight:   %2d\n" +
        " Yahtzee:          %2d\n" +
        " Chance:           %2d\n" +
        " Yahtzee bonus:    %2d\n" +
        " Upper Total:      %2d\n" +
        " Lower Total:      %2d\n" +
        " Total:            %2d\n",
        scorecard.get(0).getScore(), 
        scorecard.get(1).getScore(),
        scorecard.get(2).getScore(),
        scorecard.get(3).getScore(),
        scorecard.get(4).getScore(), 
        scorecard.get(5).getScore(), 
        scorecard.get(6).getScore(), 
        scorecard.get(7).getScore(), 
        scorecard.get(8).getScore(), 
        scorecard.get(9).getScore(), 
        scorecard.get(10).getScore(), 
        scorecard.get(11).getScore(), 
        scorecard.get(12).getScore(), 
        yahtzeeBonus, 
        scoreTop(), 
        scoreBottom(),
        score());
    }


    

}
