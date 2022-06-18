package ticTacToe;

public class PlayerManagement {
    String Player;
    
    PlayerManagement (String Player) {
        this.Player = Player;       // Hier wird übergeben, wer anfängt, ob x oder o
    }
    
    String getNextPlayer() {
        if (Player == "x") 
                return "o";
        else 
            return "x";
        
    }
}
