import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Sword here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sword extends Weapon
{
    private GreenfootImage currentImage;
    private static final int INITIAL_ROTATION = 179;
    
    
    public Sword(){
        loadImages();
        setImage(images[0]);
        /*
        GreenfootImage image = getImage();
        image.setTransparency(0);
        setImage(image);*/
        
        damage = 20;
        weaponDelay = 100;
        currentWeaponDelay = 0;
        attacking=false;
        
    }
    
    public void act(){
        if(attacking==true){
            turnTowards(300, 200);
            doAttack();
        }else{
            turnTowards(300,200);
        }
    }
    
    public void doAttack(){
        checkMonsterCollisions();
        currentWeaponDelay++;
        if(currentWeaponDelay<=weaponDelay){
            setRotation(INITIAL_ROTATION-currentWeaponDelay);
        }else{
            setRotation(INITIAL_ROTATION);
            attacking = false;
        }
    }
    private void checkMonsterCollisions(){
        Monster monster = (Monster)getOneIntersectingObject(Monster.class);
        if(monster!=null){
            monster.dealDamage(damage);
        }
    }
    public void loadImages(){
        
        images = new String[]{
            "images/weapons/gunright.png",
            "images/weapons/gunleft.png"
        };
    }
}
