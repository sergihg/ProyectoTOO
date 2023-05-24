import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SmallOrb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrbSmall extends Collectible
{
    public OrbSmall(){
        setImage("images/objects/smallorb.png");
    }
    public void applyObject(Player player){
        int score = Greenfoot.getRandomNumber(31) + 20;
        player.setScore(score);
    }
}
