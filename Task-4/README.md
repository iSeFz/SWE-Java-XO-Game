# AI-generated Generic Board Game System

## 1. Implementation using `C++` programming language

<details>
<summary>Description of the program in C++</summary>

## **Overview**

This code implements a generic board game system in C++ that can be modified to create various board games.\
It includes two classes: **`Board`** and **`Game`**.

The **`Board`** class represents the game board and provides methods to update and print the board, and check for a winner.\
The **`Game`** class represents the game and handles the game loop, getting player input, and updating the board.

The code includes a sample implementation of a Tic Tac Toe game using the **`Board`** and **`Game`** classes.

## **Board Class**

The **`Board`** class represents the game board and provides the following methods:

### **`Board(int rows, int cols)`**

The constructor for the **`Board`** class initializes a board with the specified number of rows and columns. It sets all cells to empty.

### **`void updateBoard(int row, int col, char symbol)`**

This method updates a cell on the board with the specified symbol.

### **`void print()`**

This method prints the current state of the board to the console.

### **`bool checkWinner(char symbol)`**

This method checks if the specified symbol has won the game. It returns **`true`** if the symbol has won, and **`false`** otherwise.

### **`bool isCellEmpty(int row, int col)`**

This method checks if the cell at the specified row and column is empty. It returns **`true`** if the cell is empty, and **`false`** otherwise.

## **Game Class**

The **`Game`** class represents the game and provides the following methods:

### **`Game(int rows, int cols, vector<Player> players)`**

The constructor for the **`Game`** class initializes a new game with the specified number of rows and columns, and the specified list of players.

### **`void printGameState()`**

This method prints the current state of the game to the console, including the current player's turn and the current state of the board.

### **`void play()`**

This method starts the game loop and runs the game until a player wins or the game is a draw.

## **Player Struct**

The **`Player`** struct represents a player in the game, and includes a name and a symbol.

## **Sample Implementation**

The code includes a sample implementation of a Tic Tac Toe game using the **`Board`** and **`Game`** classes.\
The game board has 3 rows and 3 columns, and there are two players.\
The sample implementation defines the players, initializes the game, and starts the game loop.

The **`main`** function sets up the game and calls the **`play`** method to start the game.

## **Conclusion**

This code provides a generic board game system that can be modified to create various board games.\
It includes a **`Board`** class for managing the game board, a **`Game`** class for managing the game loop and player input, and a sample implementation of a Tic Tac Toe game.
  
</details>

---

## 2. Implementation using `Python` programming language

<details>
  <summary>Description of the program in Python</summary>

## **Overview**

This system implements a simple board game in Python, which can be played by two players on a square board of any size.\
The game is played by alternately placing markers (X or O) on the board until one player gets three markers in a row horizontally, vertically, or diagonally, or the board is full, in which case the game is a tie.

The system is implemented using three classes: **`Board`**, **`Player`**, and **`Game`**.\
The **`Board`** class represents the game board and has methods for making moves, checking for valid moves, and checking for a winner.\
The **`Player`** class represents a player and has properties for the player's name and marker symbol.\
The **`Game`** class represents the game and has methods for playing the game, getting moves from players, switching players, and checking for game over conditions.

## **Board class**

The **`Board`** class represents the game board and has the following methods:

### **`__init__(self, size)`**

The constructor for the **`Board`** class takes a single argument **`size`**, which is the size of the square board.\
It initializes the board as a 2D array of empty strings (representing empty spaces on the board) of size **`size x size`**.

### **`display(self)`**

This method displays the game board on the console, using pipes (**`|`**) to separate columns and dashes (**`-`**) to separate rows.

### **`is_valid_move(self, row, col)`**

This method takes **`row`** and **`col`** as arguments and checks if the specified cell on the board is empty. It returns **`True`** if the cell is empty, and **`False`** otherwise.

### **`make_move(self, row, col, player)`**

This method takes **`row`**, **`col`**, and **`player`** as arguments and places the specified player's marker on the board at the specified cell.

### **`is_winner(self, player)`**

This method takes **`player`** as an argument and checks if the specified player has won the game.\
It checks all rows, columns, and diagonals for three in a row of the specified player's marker.\
It returns **`True`** if the player has won, and **`False`** otherwise.

## **Player class**

The **`Player`** class represents a player and has the following properties:

### **`name`**

A string representing the player's name.

### **`symbol`**

A string representing the player's marker symbol on the board.

## **Game class**

The **`Game`** class represents the game and has the following methods:

### **`__init__(self, board_size, player1_name, player2_name)`**

The constructor for the **`Game`** class takes three arguments: **`board_size`**, **`player1_name`**, and **`player2_name`**.\
It initializes the game board (a **`Board`** object) with size **`board_size`**, creates two players (represented by **`Player`** objects) with the names **`player1_name`** and **`player2_name`**, and sets the current player to **`player1`**.

### **`play(self)`**

This method starts the game and loops until the game is over (either a player wins or the board is full).\
It displays the board, gets a move from the current player, switches to the other player, and checks for game over conditions.

### **`get_move(self)`**

This method gets a move from the current player by asking for a row and column input.\
It checks if the move is valid and makes the move if it is. If the move is not valid, it displays an error message and asks for input again.

### **`switch_player(self)`**

This method switches the current player to the other player.

### **`is_game_over(self)`**

This method checks if the game is over by calling the **`is_winner()`** method on the current player's marker symbol, and checking if the board is full.
If the game is over, it prints the winner (if any) to the console and returns **`True`**. If the game is not over, it returns **`False`**.

## **`__main__` block**

The **`__main__`** block of the code sets up a new game with a board size of 3 and two player names input by the user.\
It then creates a new **`Game`** object with the specified parameters and starts the game by calling the **`play()`** method on the object.\
When the game is over, the winner (if any) is printed to the console, and the program exits.

## **Limitations**

This board game system is a simple implementation with hardcoded rules for a specific game.\
It does not have any options for changing the rules or the victory conditions.\
Also, it does not have any graphics or sound effects, as it runs entirely in the console.

## **Possible Extensions**

This system can be extended in various ways to support other board games with different rules and victory conditions. Some possible extensions are:

- Adding support for different board shapes (e.g., rectangular, hexagonal).
- Adding support for different victory conditions (e.g., four in a row, capturing opponent pieces).
- Adding support for more than two players.
- Adding graphics and sound effects to make the game more engaging.

## **Conclusion**

In summary, this board game system implemented in Python provides a simple framework for implementing and playing board games.
It can be extended and modified to support various types of board games with different rules and victory conditions.

</details>
