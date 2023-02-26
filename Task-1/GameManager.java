public class GameManager {
    // Private data member
    private int turn = 0;
    private Board board;
    private Player players [];
    // Constructor
    public GameManager(Board board, Player []players){
        this.board = board;
        this.players = new Player[]{players[0],players[1]};
    }
    // Function to run game
    public void playGame(){
        while (true){
            this.board.displayBoard();
            int x = 0, y = 0;
            int pos[] = this.players[turn].getMove(x, y);
            if(this.board.updateBoard(pos[0], pos[1], this.players[turn].getSymbol())){
                if(this.board.isWinner(this.players[turn].getSymbol())){
                    this.board.displayBoard();
                    System.out.printf("%s is the winner!", this.players[turn].getName());
                    break;
                }
                if(this.board.isDraw()){
                    this.board.displayBoard();
                    System.out.println("The game is draw!");
                    break;
                }
                // Assigns turn to the next player
                turn = (turn == 0) ? 1 : 0;
            }
        }
    }
}
