import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Shield here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shield extends Collectible
{
    public Shield(){
        setImage("images/objects/shield.png");
    }
    public void applyObject(Player player){
        double x = (Greenfoot.getRandomNumber(6) +5) / 100;
        player.setDefense(x);
    }
}
