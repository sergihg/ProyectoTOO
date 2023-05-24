import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Stage extends World
{
    protected Scroller scroller = null;
    
    public Stage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        setBackground("images/characters/archer1.png");
        scroller = new Scroller(this, getBackground());
    }
    public void scroll(int x, int y){
        scroller.scroll(x, y);
    }
}
