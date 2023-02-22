public class Player {
    // Private data members
    protected String name;
    protected char symbol;
    // Constructor
    public Player(String name, char symbol){
        this.name = name;
        this.symbol = symbol;
    }
    // Getter to get the name of the player
    public String getName(){
        return name;
    }
    // Getter to get the symbol of the player
    public char getSymbol(){
        return symbol;
    }
    public void getMove(int x, int y){}
}
