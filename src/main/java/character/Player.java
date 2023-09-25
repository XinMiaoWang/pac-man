package character;

public class Player extends Character {
    private String state;
    private int HP;

    public Player(String state, int HP, String state1, int HP1) {
        super(state, HP);
        this.state = state1;
        this.HP = HP1;
    }
    /**
     *   腳色移動 上下左右
     *   input: [x,y]
     *   output:[x,y]
     */
    @Override
    public void move() {

    }




}
