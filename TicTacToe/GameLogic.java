package ticTacToe;

import java.util.Scanner;

public class GameLogic {
    private Scanner prompt; // das brauche ich, weil das Scanner-Objekt in main erstellt wird
    private GameBoard board;    // und so die Verbindung hergestellt wird
    String player;
    

    public GameLogic(Scanner prompt, GameBoard board) { // jetzt existiert eine Verbindung zw. den Objekten GameLogic und Scanner
        this.prompt = prompt;
        this.board = board;
    }

    public void nextField() {
        // TODO es wird noch nicht zwischen den Spielern unterschieden
        System.out.println("Wähle ein Feld von [1 - 9]");
//        System.out.println();
        Integer fieldIndex = this.prompt.nextInt();
        
        // Ergebnis wird ans GameBoard geschickt, damit es ins Feld eingetragen wird
        this.board.setField(fieldIndex, player); // das bedeutet, dass festgelegt wird, welcher Spieler spielt
        player = PlayerManagement.this.getNextPlayer();
    }
    
    public boolean hasWon() {
        return false;
    }
    
}
