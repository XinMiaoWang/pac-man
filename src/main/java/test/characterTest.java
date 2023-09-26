package test;

import character.Enemy;
import character.Player;
import character.State;
import map.Item;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class characterTest {


    //Given player HP is 0
    //When player getDamage
    //then player state change to dead
    @Test
    public void whenPlayerHpIsZeroGetDamage(){
        Player player = new Player(State.Live,0,0,0);
        player.hpDecrease();
        assertEquals(State.Dead,player.getState());
    }
    //Given player position is 0,0
    //When player move to right
    //then player position should be 1,0
    @Test
    public void playerMoveToRight(){
        Player player = new Player(State.Live,0,0,0);
        player.move("right");
        assertEquals(1,player.getxPosition());
        assertEquals(0,player.getyPosition());
    }
    //Given player position is 0,0
    //When player move to left
    //then player position should be 0,0
    @Test
    public void playerCollusionWall() {
        Player player = new Player(State.Live,0,0,0);
        player.move("left");
        assertEquals(0,player.getxPosition());
        assertEquals(0,player.getyPosition());
    }
    //Given player position is 0,0 Hp is 0 and  Enemy position is 1,0
    //When player move to right
    //then player state should be Dead
    @Test
    public void playerMoveToRightAndCollusionEnemy() {
        Player player = new Player(State.Live,0,0,0);
        Enemy enemy   = new Enemy(State.Live,0,1,0);
        player.move("right");
        player.collusion(enemy);
        assertEquals(State.Dead,player.getState());
    }
    //Given player position is 0,0 Hp is 0 and  Item position is 1,0
    //When player move to right
    //then player state should be Super
    @Test
    public void playerMoveToRightAndCollusionItem(){
        Player player = new Player(State.Live,0,0,0);
        ArrayList<Item> items= new ArrayList<>() ;
        items.add(new Item(1,0));
        items.add(new Item(4,2));
        items.add(new Item(7,3));
        player.move("right");
        for( Item i:items){
            player.collusion(i);
        }
        assertEquals(State.Super,player.getState());
    }

    //Given player position is 0,0 Hp is 0 and  Enemy position is 1,0
    //When player move to 2,0
    //then Enemy state should be Dead
    @Test
    public void playerStateIsSuperMoveToRightAndCollusionEnemy(){
        Player player = new Player(State.Super,0,0,0);
        Enemy enemy   = new Enemy(State.Live,0,1,0);
        player.move("right");
        player.collusion(enemy);
        assertEquals(State.Dead,enemy.getState());
    }
}
