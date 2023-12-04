package yahtzee;

import java.util.*;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Game driver creates game object and plays the game. It also creates the input so as to not have infinite print statements
*/


//Please grade for extra credit: player class and computer player
public class GameDriver {

    /**
     * static main method runs and creates the game object, it also gets the name of the player
     * @param args default main method argument
     */
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.printf("Please enter player name: ");
        String name = input.nextLine();
        Game game = new Game(name, input);
        game.playGame();
        input.close();
    }
}
