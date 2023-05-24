import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Object here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Collectible extends Actor
{
    public void act()
    {
        Player player = (Player)getOneIntersectingObject(Player.class);
        if(player!=null){
            applyObject(player);
            getWorld().removeObject(this);
        }
    }
    public abstract void applyObject(Player player);
}
