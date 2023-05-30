import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Knight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Knight extends Player
{
    public Knight(){
        loadImages();
        setImage(movementSequence[DIRECTION_RIGHT][0]);
        score =0;
        
        character = CharacterEnum.KNIGHT;
        cooldown = 200;
        maxHealth = 150;
        health = maxHealth;
        defense = 0.2;
        speed = 2;
        damageInflictedDelay = 0;
        weaponCooldown=10;
        
        this.weapon = new Sword();
    }
    public void loadImages(){
        movementSequence = new String[4][];
        
        movementSequence[DIRECTION_RIGHT] = new String[]{
            "images/characters/archer1.png",
            "images/characters/archer1.png"
        };
        movementSequence[DIRECTION_LEFT] = new String[]{
            "images/characters/archer1.png",
            "images/characters/archer1.png"
        };
    }
}
