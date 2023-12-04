package yahtzee;

import java.util.*;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Dice is object for an array list of die
*/

public class Dice{
    
    private ArrayList<Die> dice;
    private static final int DEF_CAP = 5;


     /**
     * constructor dice takes in nothing, but initializes array list
     */
    public Dice(){
        dice = new ArrayList<Die>(DEF_CAP);
         //create dice
    }

     /**
     * alt constructor dice(int) takes in int, double checks if its in range, then inits arraylist to that size.
     * @param num input number of dice to include
     */

    public Dice(int num){
        if (num>=6)
            num = DEF_CAP;

        else if (num<=0){
            num = 1;
        }

        dice = new ArrayList<Die>(num);
    }

    /**
     * method addDie adds die obj to list
     * @param d input die
     */
    public void addDie(Die d){
        dice.add(d);
    }

     /**
     * method getNumDice returns the size of dice arraylist
     * @return int size of dice arraylist
     */
    public int getNumDice(){
        return dice.size();
    }

     /**
     * method getDie takes in index i, returns dice obj
     * @param i index
     * @return dice object at index i
     */
    public Die getDie(int i){

        if (i>= DEF_CAP){
            i = DEF_CAP;
        }

        else if (i<=0){
            i = 0;
        }

        return dice.get(i);
    }

     /**
     * method takes in index i, and removes it from arraylist
     * @param i index
     */
    public ArrayList<Die> removeDie(int i){
        if (i>= DEF_CAP){
            i = DEF_CAP;
        }

        else if (i<=0){
            i = 0;
        }
        dice.remove(i);

        return dice;
    }

     /**
     * method count, counts how many die have a certain value. double checks if the input value is valid.
     * @param i die value
     * @return number of die with input value
     */
    public int count(int val){

        if (val <=0){
            val = 1;
        }

        if (val > 6){
            val = 6;
        }
        int count = 0;
        for (Die d: dice){
            if (d.getValue() == val){
                count++;
            }
        }
        return count;
    }

     /**
     * method sum returns sum of all die
     * @return int sum
     */
    public int sum(){
        int sum = 0;

        for (Die d: dice){
            sum += d.getValue();
        }
        
        return sum;
    }

     /**
     * method contains double checks if the input val is in arraylist of die
     * @param val input value (assumed that input is correct)
     * @return returns true if value is in arraylist & false if not.
     */
    public boolean contains(int val){

        boolean value = false;

        for (Die d: dice){
            if (d.getValue() == val){
                value = true;
            }
        }

        return value;
    }

     /**
     * method toString overrides default method, and lists out all die in Arraylist
     * @return returns string list.
     */
    @Override
    public String toString(){
        String output = "";
        int count = 0;

        for (Die d: dice){
            count++;
            output += String.format("%d: value %d%n", count, d.getValue());
        }

        return output;
    }
}
