import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
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
        
        monster1=MonsterEnum.SLIME;
        monster2=MonsterEnum.SLIME;
        monster3=MonsterEnum.SLIME;
        handler = new MobHandler(monster1,monster2,monster3);
        
        background = new GreenfootImage("images/characters/archer1.png");
        scroller = new Scroller(this, background);
        prepare();
        addObject(handler, 1, 1);
    }
}
