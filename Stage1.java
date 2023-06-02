import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Stage1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage1 extends Stage
{
    
    public Stage1(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(character); 
        
        MonsterEnum monster = MonsterEnum.SKELETON;
        handler = new MobHandler(monster,60);
        
        background = new GreenfootImage("images/backgrounds/graveyard.png");
        scroller = new Scroller(this, background);
        prepare();
        addObject(handler, 1, 1);
        description = new ArrayList<String>();
        description.add("You wake up, alone in a graveyard, don't know");
        description.add("what happened but you are certain of something,");
        description.add("you must survive the hordes of skeletons.");
        description.add(" ");
    }
}
