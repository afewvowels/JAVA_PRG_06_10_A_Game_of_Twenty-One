/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_10_a_game_of_twenty.one;

import java.util.Scanner;
/**
 *
 * @author bluebackdev
 */
public class JAVA_PRG_06_10_A_Game_of_TwentyOne {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int intMenuSelection = -1;
        
        Scanner scrKeyboard = new Scanner(System.in);
        DiceGame game = new DiceGame();
        
        while(intMenuSelection != 2) {
            displayMainMenu();
            intMenuSelection = validateMenuInput(1,2,scrKeyboard);
            
            game.generateScoreComputer();
            
            if(intMenuSelection != 2) {
                if(game.getScoreComputer() > 21) {
                    System.out.println("Computer score over 21, player wins!");
                }
                else if(game.getScoreComputer() <= 21) {
                    while(intMenuSelection != 3) {
                        displayGameMenu(game);
                        intMenuSelection = validateMenuInput(1,3,scrKeyboard);
                        
                        if(intMenuSelection == 1) {
                            
                            game.incrementScorePlayer();
                            
//                            Loop needs work to check player score against 21
//                            and automatically go to compare score screen
//                            if(game.getScorePlayer() > 21) {
//                                break;
//                            }
//                            else if(game.getScorePlayer() <= 21) {
//                            }
                        }
                        else if(intMenuSelection == 2) {
                            if(game.getScorePlayer() > 21) {
                                System.out.println("Player score: " + game.getScorePlayer());
                                System.out.println("Computer score: " + game.getScoreComputer());
                                System.out.println("Sorry, you went over 21!");
                                System.out.println("Game over!");
                            }
                            else if(game.getScorePlayer() > game.getScoreComputer()) {
                                System.out.println("Player score: " + game.getScorePlayer());
                                System.out.println("Computer score: " + game.getScoreComputer());
                                System.out.println("Player wins!");
                            }
                            else if(game.getScorePlayer() < game.getScoreComputer()) {
                                System.out.println("Player score: " + game.getScorePlayer());
                                System.out.println("Computer score: " + game.getScoreComputer());
                                System.out.println("Computer wins!");
                            }
                            else if(game.getScorePlayer() == game.getScoreComputer()) {
                                System.out.println("Player score: " + game.getScorePlayer());
                                System.out.println("Computer score: " + game.getScoreComputer());
                                System.out.println("Tie game!");
                            }
                            else {
                                System.out.println("ERROR CHECKING SCORES");
                            }
                        }
                    }
                }
                else {
                    System.out.println("ERROR COMPARING COMPUTER SCORE TO TOTAL");
                }
                
                game.resetScores();
            }

        }
    }
    
    public static void displayMainMenu() {
        System.out.println("");
        System.out.println("1. Play Game");
        System.out.println("2. Exit Game");
        System.out.print("Selection: ");
    }
    
    public static void displayGameMenu(DiceGame game) {
        System.out.println("");
        System.out.println("Your score is: " + game.getScorePlayer());
        System.out.println("1. Roll again");
        System.out.println("2. Compare score");
        System.out.println("3. Exit");
        System.out.print("Selection: ");
    }
    
    public static int validateMenuInput(int a, int b, Scanner scrKeyboard) {
        int intMenuSelection;
        
        intMenuSelection = scrKeyboard.nextInt();
        
        while(intMenuSelection < a || intMenuSelection > b) {
            System.out.print("Please make a valid selection: ");
            intMenuSelection = scrKeyboard.nextInt();
        }
        
        return intMenuSelection;
    }
}
