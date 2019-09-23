package nz.ac.eit;

import java.util.ArrayList;

public class Game {
    private static final int numOfDice = 3; //Set the number of dice a game can have
    ArrayList<Die> dice;

    public Game(){
        dice = new ArrayList<Die>();
        createDice();
    }

    //creates the dice
    private void createDice(){
        for(int i = 0; i <= numOfDice; i++){
            Die newDie = new Die();
            dice.add(newDie);
        }
    }
}
