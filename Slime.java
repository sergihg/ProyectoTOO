import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Slime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Slime extends Monster
{
    public Slime(){
        image = new GreenfootImage("images/monsters/slime.png");
        setImage(image);
        health = 50;
        damage = 10;
        speed = 1;
        score = 50;
    }
}
