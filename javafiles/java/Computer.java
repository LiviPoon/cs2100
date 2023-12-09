import java.util.*;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Computer is the class for the computer player, determines what to score and when to roll.
*/

public class Computer {
    private static final int MINIMUM_SCORE = 20;
    private static final int MINIMUM_SAVE_AMOUNT = 2;
    private ScoreCard s;
    private Dice d;


    /**
     * Computer constructor takes in the scorecard and the dice objects
     * @param s scorecard input
     * @param d dice object
     */
    public Computer(ScoreCard s, Dice d){
        this.s =s;
        this.d = d;
    }

    /**
     * method set saved sets the saved
     * @param sl input array list for the saved dice
     * @param value dice value that wants to be saved
     * @return returns arraylist of saved dice.
     */
    private ArrayList<Boolean> setSaved(ArrayList<Boolean> sl, int value){
        for(int len = 0; len<sl.size();len++){
            if(d.getDie(len).getValue() ==value){
                sl.set(len, true);
            }
        }

        return sl;
    }
    
    /**
     * method determine score based on the dice object
     * @param rolls the amount of rolls completed
     * @return string return value for what dice to score or "roll" to continue rolling
     */
    public String determineScore(int rolls){
        ArrayList<Integer> scores = new ArrayList<Integer>(Collections.nCopies(13, 0));
        int counter = 0;
        String max = "0"; //index
        boolean scored = false;

        for (CategoryValue cv: CategoryValue.values()){
            scores.set(counter, s.getEvaluation(cv, d));  
            counter++;
        }

        do{
            for(int len = 0; len<scores.size(); len++){
                if(scores.get(len)>Integer.parseInt(max)){
                    CategoryValue cv = CategoryValue.values()[len];
                    if(s.checkScored(cv, d) == false){
                        max=Integer.toString(len);
                    }
                }
            }

            if(Integer.parseInt(max) < MINIMUM_SCORE){
                if(rolls ==3){

                }
                else
                    max = "roll";
            }
            scored = true;

        }while(!scored);

        return max;
    }


    /**
     * method determinesaveddice determines which dice to save, simple parameters of if there are more than the minimum save amount then save those dice
     * @param d input dice 
     * @param sl input saved list
     * @return return save list (detailing which dice to save)
     */
    public ArrayList<Boolean> determineSavedDice(Dice d, ArrayList<Boolean> sl){
        int ones = d.count(1);
        int twos = d.count(2);
        int threes = d.count(3);
        int fours = d.count(4);
        int fives = d.count(5);
        int sixes = d.count(6);

        if(ones>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 1);
        }

        if(twos>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 2);
        }
        if(threes>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 3);
        }
        if(fours>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 4);
        }
        if(fives>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 5);
        }
        if(sixes>= MINIMUM_SAVE_AMOUNT){
            setSaved(sl, 6);
        }
        
        return sl;

    }

    /**
     * method score scores the target category
     * @param cv input category
     */
    public void score(CategoryValue cv){
        if(cv == CategoryValue.YAHTZEE){
            if(s.checkScored(cv, d) ==true){
                s.choose(cv,d);
            }
        }
        else{
            s.choose(cv,d);
            System.out.printf("The computer scored %d points in %s%n", s.getEvaluation(cv, d),cv); 
        }
    }

    public ScoreCard getScoreCard(){
        return s;
    }
}
