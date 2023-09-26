package test;

import character.Player;
import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class characterTest {


    //Given player HP is 0
    //When player getDamage
    //then player state change to dead
    @Test
    public void whenPlayerHpIsZeroGetDamage(){
        Player player = new Player("Live",0,0,0);
        player.hpDecrease();
        assertEquals("Dead",player.getState());
    }
    //Given player position is 0,0
    //When player move to right
    //then player position should be 1,0
    @Test
    public void playerMoveToRight(){
        Player player = new Player("Live",0,0,0);
        player.move("right");
        assertEquals(1,player.getxPosition());
        assertEquals(0,player.getyPosition());
    }

}
