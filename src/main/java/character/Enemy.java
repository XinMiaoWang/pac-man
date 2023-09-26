package character;

public class Enemy extends Character{
    private String name="Enemy";
    public Enemy(State state, int HP,int xPosition, int yPosition) {
        super(state, HP, xPosition, yPosition);
    }


    public void move(String dir) {

    }
}
