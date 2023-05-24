import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Gun here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gun extends Weapon
{
    public Gun(){
        loadImages();
        setImage(images[0]);
        /*
        GreenfootImage image = getImage();
        image.setTransparency(0);
        setImage(image);*/
        
        damage = 50;
        weaponDelay = 0;
        currentWeaponDelay = 0;
        attacking=false;
        
    }
    
    
    public void act(){
        getWorld().showText("attacking:"+attacking ,getWorld().getWidth()-200,60);
        if(attacking==true){
            getWorld().showText("attacked: ", -200,60);
            doAttack();
            attacking=false;
        }
    }
    
    public void doAttack(){
        Bullet b = new Bullet(damage);
        getWorld().addObject(b, getX(), getY());
    }
    public void loadImages(){
        
        images = new String[]{
            "images/weapons/gunright.png",
            "images/weapons/gunleft.png"
        };
    }
}
