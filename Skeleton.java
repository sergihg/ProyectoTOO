import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Skeleton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Skeleton extends Monster
{
    public Skeleton(){
        image = new GreenfootImage("images/monsters/skeleton.png");
        setImage(image);
        health = 20;
        damage = 5;
        speed = 1;
        score = 20;
    }
}
