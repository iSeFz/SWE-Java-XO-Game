abstract public class Board{
    // Private data members
    protected int n;
    protected char grid[][];
    // Constructor
    public Board(){
        this.n = 0;
    }
    public Board(int n){
        char count = '1';
        this.n = n;
        grid = new char[n][n];
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++)
                grid[i][j] = count++;
        }
    }
    // Abstract methods
    abstract public boolean updateBoard(int x, int y, char symbol);
    abstract public boolean isWinner(char symbol);
    abstract public boolean isDraw();
    // Public method to display the board
    public void displayBoard(){
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(j != 0)
                    System.out.print(" | ");
                System.out.print(grid[i][j]);
            }
            if(i != 2) {
                System.out.println();
                System.out.print("---------");
            }
            System.out.println();
        }
    }
}