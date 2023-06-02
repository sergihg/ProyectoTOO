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
    private int attackDirection;

    private static final int INITIAL_ROTATION = 0;

    
    public Sword(){
        loadImages();
        setImage(images[0]);
        damage = 20;
        weaponDelay = 100;
        currentWeaponDelay = 0;
        attacking=false;

    }

    public void act(){
        if(attacking==true){
            doAttack();
        }
    }

    public void doAttack(){
        checkMonsterCollisions();
        currentWeaponDelay+=2;
        if(currentWeaponDelay<=3){
            attackDirection = direction;
        }
        
        if(attackDirection == 0){
            setRotation(currentWeaponDelay);
        }else if(attackDirection == 1){
            setRotation(359-currentWeaponDelay);
        }
        
        if(currentWeaponDelay>=weaponDelay){
            currentWeaponDelay = 0;
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
            "images/weapons/sword.png",
            "images/weapons/sword.png"
        };
    }
}
