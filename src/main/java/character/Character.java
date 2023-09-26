package character;

public abstract class Character {
    private State state;
    private int HP;

    private int xPosition;

    private int yPosition;



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

    public Character(State state, int HP, int xPosition, int yPosition) {
        this.state = state;
        this.HP = HP;
        this.xPosition = xPosition;
        this.yPosition = yPosition;
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


    /**
     * input: hp
     * output:hp--
     */
    public void hpDecrease() {
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

}
