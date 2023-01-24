package coe318.lab5;

import java.util.Scanner;

public class SimpleUI implements UserInterface {
    private BlackjackGame game;
    private Scanner user = new Scanner(System.in);

  @Override
    public void setGame(BlackjackGame game) {
        this.game = game;
    }

  @Override
    public void display() {
        System.out.println("House hand:" + this.game.getHouseCards().toString());
        System.out.println("Your hand:" + this.game.getYourCards().toString());
        int yourScore = game.score(game.getYourCards());  
        System.out.println("Your score " + yourScore);
    }

  @Override
    public boolean hitMe() {
        System.out.println("Hit? reply with y/n");              //if want another card its y if not say n or if you want to stand say n
        String choice = user.nextLine();
        boolean hit = false;
        switch(choice){
            case "y":
                hit = true;
                break;
            case "n":
                hit = false;
                break;
            default:
                System.out.println("reply with either y/n");
                hitMe();
        }
                return hit;
    }

  @Override
    public void gameOver() {
    this.display();
    int yourScore = game.score(game.getYourCards());                                //checks if your overall score is correct based on game rules and if you 
    int houseScore = game.score(game.getHouseCards());                              //beat the house OR hit 21 you win, loose if you have less than the dealer
    System.out.println("House score:" + houseScore + " Your score:" + yourScore);
    if((yourScore > houseScore || houseScore > 21 && (yourScore <= 21))){
        System.out.println("GG you win");
    }else{
        System.out.println("Better Luck next time!");
    }
    }
 
}