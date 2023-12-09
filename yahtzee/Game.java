package yahtzee;

import java.util.*;

/* 
Livi Poon
CS2100 - Intermediate Programming
Explanation: Game class creates and plays the game.
*/


public class Game{
    private ArrayList<Player> players;
    private ArrayList<Boolean> savedDice; // Each value is associated with a die, True = saved and vis versa
    private final int NUM_ROUNDS = 13;
    private DiceRoll dRoll = new DiceRoll();
    private Scanner input;
    private Computer c;

    /**
     * constructor game takes in the name of the player and the input object
     * @param pName input name
     * @param input input scanner class
     */
    public Game(String pName, Scanner input){
        players = new ArrayList<Player>(2);
        savedDice = new ArrayList<Boolean>(Collections.nCopies(5, false));

        Player player1 = new Player(pName);
        Player player2 = new Player("Computer");
        c = new Computer(player2.getScoreCard(), dRoll);

        this.input = input;

        players.add(player1);
        players.add(player2);
        
        Die dieA = new Die();
        Die dieB = new Die();
        Die dieC = new Die();
        Die dieD = new Die();
        Die dieE = new Die();

        dRoll.addDie(dieA);
        dRoll.addDie(dieB);
        dRoll.addDie(dieC);
        dRoll.addDie(dieD);
        dRoll.addDie(dieE);
    }

    /**
     * method printDice prints the dice 
     * @param d input dice object
     * @param sd saved dice list of boolean values determining 
     */

    private void printDice(){
        System.out.printf("Dice:%n");
                        
        //print out all die.
        for(int len = 0; len<=savedDice.size()-1;len++){     
            System.out.printf("%d: value %d", len+1, dRoll.getDie(len).getValue());
            if (savedDice.get(len) == true){
                System.out.printf("    SAVE%n");
            }
            else
                System.out.printf("%n");
        }
    }

    /**
     * method scoreMethod takes in the player and scanner and loops over the score selection process
     * @param player input player object (ie current player)
     * @param input input scanner object
     */
    private void scoreMethod(int player, Scanner input){
        boolean validCategory = false;
        
        while(!validCategory){
            try{
                System.out.printf("Select a category that you have not scored in yet:%n");
                for (CategoryValue cv: CategoryValue.values()){
                    System.out.printf("%d: %s, %d points%n", cv.getValue(), cv, players.get(player).getScoreCard().checkScored(cv, dRoll));
                }

                String categorySelection = input.nextLine();

                int categorySelectionI = Integer.parseInt(categorySelection);

                if(categorySelectionI >12 || categorySelectionI <1){
                    System.out.printf("%nPlease enter a valid category%n");
                }

                else{

                    CategoryValue cv = CategoryValue.values()[categorySelectionI];

                    if(cv == CategoryValue.YAHTZEE){
                        if(players.get(player).getScoreCard().checkScored(cv, dRoll) ==true){
                            players.get(player).getScoreCard().choose(cv,dRoll);
                        }
                    }

                    else if(players.get(player).getScoreCard().checkScored(cv, dRoll) ==true){
                        System.out.printf("%nPlease enter a category you have not scored yet%n");
                    }

                    else{
                        players.get(player).getScoreCard().choose(cv,dRoll);
                        System.out.printf("You scored %d points in %s", players.get(player).getScoreCard().getEvaluation(cv, dRoll),cv); 
                        validCategory = true;
                    }
                }
            
            }
            
            catch (InputMismatchException a){
                System.out.println("\nPlease enter a valid category\n");
                // input.next();
            }

            catch (NumberFormatException b){
                System.out.println("\nPlease enter a valid category\n");
                // input.next();
            } 
        }
    }
    
    /**
     * method playGame is as the name suggests, its responsible for the entire game.
     */
    public void playGame(){
        boolean scored = false;
        int roll = 0;
        int round = 0;
        System.out.printf("*******************************************************\n" + 
                " WELCOME TO YAHTZEE\n" +
                "*******************************************************\n");
        round = 0;
        while(round <= NUM_ROUNDS){ //for every round
            round++;
            dRoll.toss();
            for(int player = 0; player<2; player++){ //alternate between each player
                savedDice = new ArrayList<Boolean>(Collections.nCopies(5, false));
                String userInput = "";
                System.out.printf("%n");
                roll = 0;
                scored = false;
                while(roll <= 3 && !scored){ //repeat this until player is done playing

                    if(roll==3){ //if the rolls get to three then you ran out of rolls
                        System.out.printf("%nOut of rolls, you must score%n");
                        if(player==0){
                            scoreMethod(player, input);
                            scored = true;
                        }
                        else{
                            CategoryValue cv = CategoryValue.values()[Integer.parseInt(c.determineScore(roll))];
                            c.score(cv);
                            scored = true;
                        }
                    }

                    else if(player == 0){ //if tis the player's turn
                        System.out.printf("%n*** Player %s: ***%n", players.get(player).getName());
                        System.out.println(players.get(player).getScoreCard());
                        System.out.printf("%n******************************%n");
                        printDice();
                        System.out.printf("%nPlease select a die # to toggle it between save and unsave, \"roll\" or \"score\": ");
                        userInput = input.nextLine();
                        try{
                            //check if this is the correct die value
                            if(userInput.equals("roll")){
                                    roll++; 

                                    for(int len = 0; len<=savedDice.size()-1;len++){
                                        if(savedDice.get(len) == false){
                                            dRoll.getDie(len).roll();
                                        }
                                    }
                                }

                            else if (userInput.equals("score")){
                                scoreMethod(player, input);
                                System.out.printf("%n");
                                scored= true;   
                            }

                            else {
                                int newIn = Integer.parseInt(userInput);

                                if(newIn<=5 && newIn >=1){
                                    if(savedDice.get(newIn-1) == true)
                                        savedDice.set(newIn-1, false);
                                    else
                                        savedDice.set(newIn-1, true);
                                }
                                else{//make sure to display error message
                                    System.out.printf("\n%d is not a valid die value", newIn);
                                }
                            }
                        }

                        catch (InputMismatchException | NumberFormatException e) {
                            System.out.printf("\n%s is not a valid die value", userInput);
                            }
                    }
                    else{
                        System.out.printf("%n*** Player %s: ***%n", players.get(player).getName());
                        System.out.println(c.getScoreCard());
                        System.out.printf("%n******************************%n");
                        printDice();
                        if(c.determineScore(roll).equals("roll")){
                            roll++; 

                            savedDice = c.determineSavedDice(dRoll, savedDice);

                            for(int len = 0; len<=savedDice.size()-1;len++){
                                if(savedDice.get(len) == false){
                                    dRoll.getDie(len).roll();
                                }
                            }
                        }

                        else{
                            CategoryValue cv = CategoryValue.values()[Integer.parseInt(c.determineScore(roll))];
                            c.score(cv);
                            scored=true;
                        }
                    }

                    
            }//playerplaying end
            
        } 


    }
    System.out.printf("%n******************************%n");

        if(players.get(0).getScoreCard().score()> players.get(1).getScoreCard().score()){
            System.out.printf("%nPlayer 1 Won!%n");
        }

        else
            System.out.printf("%nThe Computer Won!%n");
    }// gameplaying end


} 