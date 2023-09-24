package character;

public class Player implements Character {
    private String state;
    private int HP;

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
        if (HP>=0) {
            this.HP = HP;
        }
    }

    public Player(String state, int hp) {
        this.state = state;
        HP = hp;
    }

    /**
     *   腳色移動 上下左右
     *   input: [x,y]
     *   output:[x,y]
     */
    @Override
    public void move() {

    }

    /**
     * input: hp
     * output:hp--
     */
    @Override
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

    @Override
    public void collusion() {

    }

    @Override
    public void changeState(String state) {
         setState(state);
    }


}
