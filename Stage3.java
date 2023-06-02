import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.ArrayList;

/**
 * Write a description of class Stage3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage3 extends Stage
{
    
    public Stage3(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(character); 
        
        MonsterEnum monster = MonsterEnum.WEREWOLF;
        handler = new MobHandler(monster,150);
        
        background = new GreenfootImage("images/backgrounds/wasteland.png");
        scroller = new Scroller(this, background);
        prepare();
        addObject(handler, 1, 1);
        
        description = new ArrayList<String>();
        description.add("You discovered no one is left, now there are");
        description.add("only monsters and you are the sole survivor,");
        description.add("the only ones left turned into werewolves.");
        description.add("SURVIVE!!!!!!");
    }
}
