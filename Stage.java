import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Stage extends World
{
    protected GreenfootImage background;
    protected Scroller scroller = null;
    
    protected CharacterEnum character;
    
    public Stage(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        this.character = character;
    }
    
    public void scroll(int x, int y){
        scroller.scroll(x, y);
    }
    
    protected void prepare()
    {
        switch(character){
            case ARCHER:
                Gun gun = new Gun();
                addObject(new Archer(gun),getWidth()/2,getHeight()/2);
                addObject(gun,getWidth()/2,getHeight()/2);
        }
    }
}
