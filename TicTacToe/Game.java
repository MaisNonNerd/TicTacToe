package ticTacToe;

// Diese Datei liegt im Git-Ordner

public class Game {
    private GameBoard board; // Hierdurch "kennt" Game Gameboard
    private GameLogic logic;

    public Game(GameBoard board, GameLogic logic) { // TODO Notwendig, damit eine Referenz auf die Objekte GameBoard und
                                                    // GameLogic besteht
        this.board = board;
        this.logic = logic;
    }

    public void welcome() {
        System.out.println();
        System.out.println("Welcome to Tic Tac Toe!");
        System.out.println();
        this.play(); // Das Spiel beginnt
    }

    private void play() {
        this.board.print();
        
        while (!this.logic.hasWon()) {
            this.logic.nextField();
            this.board.print();
       }
    }
}
