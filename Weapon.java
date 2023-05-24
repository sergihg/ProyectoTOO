import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Weapon here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Weapon extends Actor
{
    protected String []images;
    protected int weaponDelay;
    protected int currentWeaponDelay;
    
    protected int direction;
    protected double damage;
    protected boolean attacking;
    
    public abstract void doAttack();
    
    public void attack(){
        attacking=true;
    }
    
    protected void loadImage(){
        setImage(images[direction]);
    }
    public void setDamage(double damage){
        this.damage += (this.damage * damage);
    }
    public void moveWeapon(int x,int y){
        setLocation(x, y);
    }
    public void changeDirection(int direction){
        this.direction = direction;
        loadImage();
    }
}
