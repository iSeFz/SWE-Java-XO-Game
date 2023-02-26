public class XO_Board extends Board {
    // Constructor
    XO_Board() {
        super(3);
    }
    // Function to update board with desired movement
    public boolean updateBoard(int x, int y, char symbol) {

        // check if position valid
        if (Character.toLowerCase(grid[x][y]) != 'x' && Character.toLowerCase(grid[x][y]) != 'y') {
            grid[x][y] = symbol;
            return true;
        }
        return false;
    }

    // Function if game ended with winner state or not
    public boolean isWinner(char symbol) {
        for (int x = 0; x <= 2; x++) {

            // horizontal check
            if (grid[x][0] == symbol && grid[x][1] == symbol && grid[x][2] == symbol) {
                return true;
            }

            // vertical check
            if (grid[0][x] == symbol && grid[1][x] == symbol && grid[2][x] == symbol) {
                return true;
            }
        }

        // diagonal \ check
        if (grid[0][0] == symbol && grid[1][1] == symbol && grid[2][2] == symbol) {
            return true;
        }

        // diagonal / check
        return grid[2][0] == symbol && grid[1][1] == symbol && grid[0][2] == symbol;
    }

    // Function if game ended with draw state or not
    public boolean isDraw() {

        // Another method
        for (int x = 0; x < n; x++) {
            for (int y = 0; y < n; y++) {
                if (Character.isDigit(grid[x][y]))
                    return false;
            }
        }
        return true;
    }
}
