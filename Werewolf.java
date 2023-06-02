import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Werewolf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Werewolf extends Monster
{
    public Werewolf(){
        image = new GreenfootImage("images/monsters/werewolf.png");
        setImage(image);
        health = 100;
        damage = 10;
        speed = 2;
        score = 150;
    }
}
