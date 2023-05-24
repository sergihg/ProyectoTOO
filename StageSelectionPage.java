import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelectionPage extends SelectionPage
{
    public StageSelectionPage()
    {    
        super(); 
        addObject(new MenuButton(), 100, getHeight()-50);
    }
}
