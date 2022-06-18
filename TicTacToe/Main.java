package ticTacToe;

import java.util.Scanner; // TODO wo genau, muss der Import hin?
//in Main-Klasse immer nur Objekte erstellen

public class Main {
    public static void main(String[] args) {
        Scanner prompt = new Scanner(System.in);
        GameBoard board = new GameBoard();
        GameLogic logic = new GameLogic(prompt, board); // Der Konstruktor erwartet Scanner scan und GameBoard board
        Game game = new Game(board, logic); // Im Konstruktor werden die Attribute des Objekts mit Standardwerten
                                            // initialisiert.
        game.welcome();
        PlayerManagement player = new PlayerManagement("x");
//        PlayerManagement player2 = new PlayerManagement("o");
        
    }
}
