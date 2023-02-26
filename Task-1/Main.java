import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String player1 , player2;
        // Take player1 name
        System.out.print("Player1 please enter your name: ");
        player1 = in.nextLine();
        // Take player2 name
        System.out.print("Player2 please enter your name: ");
        player2 = in.nextLine();
        // Create XO_board
        XO_Board board = new XO_Board();
        // Create Players
        XO_Player players[] = {
                new XO_Player(player1, 'x'),
                new XO_Player(player2, 'o')
        };
        // Create GameManger with XO_board and Players
        GameManager XO_Game = new GameManager(board, players);
        // Start Game
        XO_Game.playGame();
    }
}