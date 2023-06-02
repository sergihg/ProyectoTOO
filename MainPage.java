import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainPage extends World
{
    private static World world;
    public MainPage()
    {    
        super(600, 400, 1);
        BackgroundSelector.setBackground(BackgroundEnum.MENU, this);
        world = this;
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        addObject(new ButtonStart(new CharacterSelectionPage()),getWidth()/2,258);
        addObject(new Button(ButtonEnum.GUIDE),getWidth()/3,335);
        addObject(new Button(ButtonEnum.RECORD),getWidth()/3*2,335);
    }
    public static World getMainPage(){
        return world;
    }
}
