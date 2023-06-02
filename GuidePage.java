import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class GuidePage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class GuidePage extends World
{

    private static final World world = new GuidePage();
    /**
     * Constructor for objects of class GuidePage.
     * 
     */
    public GuidePage()
    {    
        super(600,400,1);
        BackgroundSelector.setBackground(BackgroundEnum.OTHER, this);
        addObject(new Button(ButtonEnum.MENU), 100, getHeight()-50);
        addObject(new Label2(), getWidth()/2, (getHeight()/2)-30 );
    }
    
    public static World getGuidePage(){
        return world;
    }
}
