import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuidePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuidePage extends SelectionPage
{

    /**
     * Constructor for objects of class GuidePage.
     * 
     */
    public GuidePage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        addObject(new MenuButton(), 100, getHeight()-50);
    }
}
