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
        image = new GreenfootImage("images/characters/archer1.png");
        setImage(image);
        health = 20;
        damage = 5;
        speed = 2;
    }
}
