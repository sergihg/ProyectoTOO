import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Chicken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Chicken extends Collectible
{
    public Chicken(){
        setImage("images/objects/chicken.png");
    }
    public void applyObject(Player player){
        player.setHealth();
    }
}
