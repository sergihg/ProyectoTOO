import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swordsman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Player
{
    public Archer(){
        loadImages();
        setImage(images[DIRECTION_RIGHT]);
        score =0;
        
        character = CharacterEnum.ARCHER;
        cooldown = 100;
        maxHealth = 100;
        health = maxHealth;
        defense = 0.1;
        speed = 3;
        damageInflictedDelay = 0;
        weaponCooldown=10;
        
        this.weapon = new Gun();
    }
    public void loadImages(){
        images = new String[]{
            "images/characters/archer1.png",
            "images/characters/archer2.png",
        };
    }
}
