import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Stage2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage2 extends Stage
{
    
    public Stage2(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(character); 
        
        MonsterEnum monster = MonsterEnum.SLIME;
        handler = new MobHandler(monster,80);
        
        background = new GreenfootImage("images/backgrounds/forest.png");
        scroller = new Scroller(this, background);
        prepare();
        addObject(handler, 1, 1);
        
        description = new ArrayList<String>();
        description.add("You escaped the cementery and entered a forest");
        description.add("and are skeletons no longer attack you, now");
        description.add("survive the slimes roaming in the forest.");
        description.add(" ");
    }
}
