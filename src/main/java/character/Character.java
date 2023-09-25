package character;

public abstract class Character {
    private String state;
    private int HP;

    public Character(String state, int HP) {
        this.state = state;
        this.HP = HP;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public abstract void move();

    /**
     * input: hp
     * output:hp--
     */
    public void hpDecrease() {
        if (getHP()==0){
            changeState("Dead");
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


    public void collusion() {

    }


    public void changeState(String state) {
        setState(state);
    }



}
