import java.util.Scanner;

public class XO_Player extends Player{
    // Constructor
    XO_Player(String name, char symbol){
        super(name, symbol);
    }
    // Function to get move from player
    public int[] getMove(int x, int y){
        Scanner input = new Scanner(System.in);
        int k = -1;
        while ((k < 0 || k > 8)){
            System.out.printf("%s, enter cell number (1 -- 9) >> ", name);
            k = input.nextInt();
            k--;
        }
        x = k / 3;
        y = k % 3;
        // store movement of player
        int pos[] = {x,y};
        return pos;
    }
}
