package character;

public class Player extends Character {
    private String state;
    private int HP;


    public Player(String state, int HP,int xPosition, int yPosition) {
        super(state, HP, xPosition, yPosition);
    }
    /**
     *   腳色移動 上下左右
     *   input: left,right,up,down
     *   output:[x,y]
     */

    public void move(String dir) {
        if (dir=="right"){
        setxPosition(getxPosition()+1);}
    }




}
