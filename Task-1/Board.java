abstract public class Board{
    // Private data members
    protected int n;
    protected int grid[][];
    // Constructor
    public Board(int n){
        this.n = n;
        grid = new int[n][n];
    }
    // Abstract methods
    abstract public boolean updateBoard(int x, int y, char symbol);
    abstract public boolean isWinner(char symbol);
    abstract public boolean isDraw();
    // Public method to display the board
    public void displayBoard(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}