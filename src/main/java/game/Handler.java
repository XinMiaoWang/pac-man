package game;

import map.Tile;
import character.Character;

import java.awt.*;
import java.util.LinkedList;

public class Handler {
    public LinkedList<Character> characters = new LinkedList<>();
    public LinkedList<Tile> tile = new LinkedList<>();

    // draw map
    public void render(Graphics g){
        for(Character en:characters){
            en.render(g);
        }
        for(Tile ti:tile){
            ti.render(g);
        }
    }

    // update screen
    public void tick(){
        for(Character en:characters){
            en.tick();
        }
        for(Tile ti:tile){
            ti.tick();
        }
    }

    //add and remove object
    public void addEntity(Character en){
        characters.add(en);
    }
    public void removeEntity(Character en){
        characters.remove(en);
    }
    public void addTile(Tile ti){
        tile.add(ti);
    }
    public void removeTile(Tile ti){
        tile.remove(ti);
    }

    //create map
    public void createMap(){

    }

    //clear map
    public void clearMap(){
        characters.clear();
        tile.clear();
    }
}
