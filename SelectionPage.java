import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class SelectionPage extends Menu
{
    public SelectionPage()
    {
        super();
        addObject(new Label(), getWidth()/2, (getHeight()/2)-30 );
    }
}
