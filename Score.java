import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Score extends Button
{
    public Score(){
        setImage("images/buttons/record.png");
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.setWorld(new RecordPage());
        }
    }
}
