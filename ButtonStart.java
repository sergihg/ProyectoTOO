import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonStart extends Actor
{
    private World world;
    
    public ButtonStart(World world){
        setImage("images/buttons/start.png");
        this.world=world;
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/beep.mp3");
            Greenfoot.setWorld(world);
        }
    }
    public void setWorld(World world){
        this.world = world;
    }
}
