import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Guide extends Button
{
    public Guide(){
        setImage("images/buttons/guide.png");
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new GuidePage());
        }
    }
}
