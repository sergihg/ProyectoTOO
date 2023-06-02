import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class BigOrb here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class OrbBig extends Collectible
{
    public OrbBig(){
        sound = new GreenfootSound("sounds/pickup.mp3");
        setImage("images/objects/bigorb.png");
    }
    public void applyObject(Player player){
        int score = Greenfoot.getRandomNumber(31) + 70;
        player.setScore(score);
    }
}
