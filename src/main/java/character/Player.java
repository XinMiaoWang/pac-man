package character;

import map.Item;

public class Player extends Character {
    private String state;
    private int HP;


    public Player(State state, int HP, int xPosition, int yPosition) {
        super(state, HP, xPosition, yPosition);
    }

    /**
     * 腳色移動 上下左右
     * input: left,right,up,down
     * output:[x,y]
     */

    public void move(String dir) {
        switch (dir) {
            case "right":
                setxPosition(getxPosition() + 1);
                break;
            case "left":
                setxPosition(getxPosition() - 1);
                break;
            case "up":
                setyPosition(getyPosition() + 1);
                break;
            case "down":
                setyPosition(getyPosition() - 1);
                break;
            default:
                break;
        }
    }

    public void collusion(Character enemy) {
        if (getxPosition() == enemy.getxPosition() & getyPosition() == enemy.getyPosition()) {
            if (getState() == State.Super) {
                enemy.setState(State.Dead);
            } else {
                hpDecrease();
            }
        }
    }

    public void collusion(Item item) {
        if (getxPosition() == item.getxPosition() & getyPosition() == item.getyPosition()) {
            setState(State.Super);
        }
    }
}