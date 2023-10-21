package character;

import game.Handler;
import game.Id;

import java.awt.*;

public abstract class Character {
    private State state;
    private int HP;
    private int xPosition;
    private int yPosition;
    private int width;
    private int height;

    public Id id;
    public Handler handler;

    public Character(State state, int HP, int xPosition, int yPosition, int width, int height
                    ,Id id, Handler handler) {
        this.state = state;
        this.HP = HP;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
        this.width = width;
        this.height = height;
        this.id = id;
        this.handler = handler;
    }

    public abstract void tick(); // for screen update
    public abstract void render(Graphics g);

    public Id getId(){ return id; }

    public int getxPosition() {
        return xPosition;
    }

    public void setxPosition(int xPosition) {
        if (xPosition>0  && xPosition< 200){
            this.xPosition = xPosition;
        }
    }

    public int getyPosition() {
        return yPosition;
    }

    public void setyPosition(int yPosition) {
        if (xPosition>0  && xPosition< 100){
            this.yPosition = yPosition;
        }
    }



    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * input: hp
     * output:hp--
     */
    public void hpDecrease() {
        handler.removeEntity(this);
        if (getHP()==0){
            changeState(State.Dead);
        }
        else {
            setHP(getHP()-1);
        }
    }

    /**
     * 判斷碰撞
     *   input: x,y,coinPostion,itemPosition,emenyPosition
     *   output:["True","coin"] or["True","item"]or ["True","enemy"] or ["False","NULL"]
     */


    public void changeState(State state) {
        setState(state);
    }

    /**
     *  畫角色
     *  @param graphics
     *  @param x : 水平起點
     *  @param y : 垂直起點
     *  @param width : 角色寬度
     *  @param height : 角色高度
     */
    public void draw(Graphics graphics, int x, int y, int width, int height) {

    }

}
