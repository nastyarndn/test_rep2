

public class GameTest {

    private Dice dice;
    private  GameWinnerPrinter winnerPrinter;

    


    public   GameTest( GameWinnerPrinter winnerPrinter) {
    
        this.winnerPrinter = winnerPrinter;
    }

    public void playGame(Player player1, Player player2) {
        
        int player1Result = 8;
        int player2Result = 2;

        Player winner = (player1Result > player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    
    }

    public void playGameTest(Player player1, Player player2) {
        
        int player1Result = 8;
        int player2Result = 2;

        Player winner = (player1Result < player2Result)? player1: player2;
        winnerPrinter.printWinner(winner);
    
    }
}
