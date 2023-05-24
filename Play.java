import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Start here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play extends Button
{
    public Play(){
        setImage("images/buttons/start.png");
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            if(getWorld().getClass()==MainPage.class)
                Greenfoot.setWorld(new CharacterSelectionPage());
        }
    }
    
}
