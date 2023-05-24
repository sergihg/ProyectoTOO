import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Feather here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Feather extends Collectible
{
    public Feather(){
        setImage("images/objects/feather.png");
    }
    public void applyObject(Player player){
        player.setSpeed(1);
    }
}
