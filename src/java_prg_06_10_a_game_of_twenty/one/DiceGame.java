/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_06_10_a_game_of_twenty.one;

/**
 *
 * @author bluebackdev
 */
public class DiceGame {
    
    private int intScorePlayer;
    private int intScoreComputer;
    
    final int INT_SCORE = 21;
    
    public DiceGame() {
        intScorePlayer = 0;
        intScoreComputer = 0;
    }
    
    public void incrementScorePlayer(int score) {
        intScorePlayer += score;
    }
    
    public int getScorePlayer() {
        return intScorePlayer;
    }
    
    public void incrementScoreComputer(int score) {
        intScoreComputer += score;
    }
    
    public int getScoreComputer() {
        return intScoreComputer;
    }
    
    public void resetScores() {
        intScorePlayer = 0;
        intScoreComputer = 0;
    }
}
