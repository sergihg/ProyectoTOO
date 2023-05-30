import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
    private double damage;
    private boolean direction;
    public Bullet(double damage){
        setImage("images/weapons/bullet.png");
                
        this.damage = damage;
    }
    public void act()
    {
        turnDirection();
        move(5);
        checkCollisions();
    }
    private void turnDirection(){
        if(!direction)
        {
            try{Monster monster = getObjectsInRange(300, Monster.class).get(0);
                //Monster monster = getWorld().getObjects(Monster.class).get(0);
                turnTowards(monster.getX(), monster.getY());
            }catch(Exception ex){} 
        }
    }
    private void checkCollisions(){
        Monster monster = (Monster)getOneIntersectingObject(Monster.class);
        if(monster!=null){
            monster.dealDamage(damage);
            try{getWorld().removeObject(this);}catch(Exception ignored){}
        }else if(isAtEdge()){
            try{getWorld().removeObject(this);}catch(Exception ignored){}
        }
    }
}
