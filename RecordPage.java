import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class RecordPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordPage extends SelectionPage
{

    /**
     * Constructor for objects of class RecordPage.
     * 
     */
    public RecordPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();  
        addObject(new MenuButton(), 100, getHeight()-50);
    }
}
