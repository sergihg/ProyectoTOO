import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainPage extends SelectionPage
{

    /**
     * Constructor for objects of class MainPage.
     * 
     */
    public MainPage()
    {    
        super(); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new StartButton(new CharacterSelectionPage()),getWidth()/2,258);
        addObject(new GuideButton(),getWidth()/3,335);
        addObject(new ScoreButton(),getWidth()/3*2,335);
    }
}
