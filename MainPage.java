import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainPage extends World
{

    /**
     * Constructor for objects of class MainPage.
     * 
     */
    public MainPage()
    {    
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new Play(),getWidth()/2,258);
        addObject(new Guide(),getWidth()/3,335);
        addObject(new Score(),getWidth()/3*2,335);
    }
}
