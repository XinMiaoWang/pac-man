package map;

import game.Handler;
import game.Id;

import java.awt.*;

public class Wall extends Tile{
    public Wall(int x, int y, int width, int height, boolean solid, Id id, Handler handler){
        super(x,y,width,height,solid,id,handler);
    }

    // draw wall
    public void render(Graphics g) {
//        g.drawImage(Game.wall.getBufferedImage(), x, y, width,height,null);
    }

    public void tick() {

    }
}
