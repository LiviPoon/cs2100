/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Player class is the player class for a player. It holds the scorecard and the name of the player.
*/

public class Player {
    private ScoreCard sc;
    private String name;

    /**
     * player constructor takes in name from game input
     * @param name name in string format
     */

    public Player(String name){
        sc = new ScoreCard();
        this.name = name;
    }

    /**
     * method setname sets the name
     * @param n input name
     */
    public void setName(String n){
        name = n;
    }

    /**
     * method getName gets the name and returns it
     * @return returns the name
     */
    public String getName(){
        return name;
    }

    /**
     * method getscorecard returns scorecard
     * @return returns scorecard.
     */
    public ScoreCard getScoreCard(){
        return sc;
    }
}
