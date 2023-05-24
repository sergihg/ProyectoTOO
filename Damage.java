import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Damage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Damage extends Collectible
{
    public Damage(){
        setImage("images/objects/damage.png");
    }
    public void applyObject(Player player){
        double x = (Greenfoot.getRandomNumber(11) +10) / 100;
        player.setAttack(x);
    }
}
