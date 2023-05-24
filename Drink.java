import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Drink here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Drink extends Collectible
{
    public Drink(){
        setImage("images/objects/drink.png");
    }
    public void applyObject(Player player){
        double x =0.1;
        player.setCooldown(x);
    }
}
