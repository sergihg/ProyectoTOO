import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Menu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Menu extends Button
{
    public Menu(){
        setImage("images/buttons/menu.png");
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new MainPage());
        }
    }
}
