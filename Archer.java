import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Swordsman here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Archer extends Player
{
    public Archer(Weapon weapon){
        loadImages();
        setImage(movementSequence[DIRECTION_RIGHT][0]);
        score =0;
        
        character = CharacterEnum.ARCHER;
        cooldown = 100;
        maxHealth = 100;
        health = maxHealth;
        defense = 0.1;
        speed = 3;
        damageInflictedDelay = 0;
        weaponCooldown=10;
        
        this.weapon = weapon;
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
