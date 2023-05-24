import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hearth here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hearth extends Collectible
{
    public Hearth(){
        setImage("images/objects/hearth.png");
    }
    public void applyObject(Player player){
        double x = 0.1;
        player.setMaxHealth(x);
    }
}
