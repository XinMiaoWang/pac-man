package character;

import map.Item;

import java.awt.*;

public class Player extends Character {
    private String state;
    private int HP;
    private int score;
    private final Image image;


    public Player(State state, int HP, int xPosition, int yPosition, Image img) {
        super(state, HP, xPosition, yPosition);
        this.score = 0;
        this.image = img;
    }

    /**
     * 畫角色
     * input: 起點座標[x, y] 和 寬度、高度
     * output:Graph
     */
    @Override
    public void draw(Graphics graphics, int x, int y, int width, int height) {
        graphics.drawImage(image, x, y, x + width, y + height, 0, 0,
                image.getWidth(null), image.getHeight(null), null);
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

    /**
     * 取得分數
     */
    public int getScore() {
        return score;
    }

    /**
     * 得分
     */
    public void addPoints() {
        score++;
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