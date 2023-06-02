import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

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
        direction = false;
        this.damage = damage;
    }

    public void act()
    {
        if(!direction){
            turnDirection();
        }
        move(5);
        checkCollisions();
    }

    private void turnDirection(){
        List monsters = getObjectsInRange(300, Monster.class);
        if(monsters!=null && monsters.size()>0)
        {
            Monster monster = (Monster)monsters.get(0);
            turnTowards(monster.getX(), monster.getY());
        }
        direction = true;
    }

    private void checkCollisions(){
        Monster monster = (Monster)getOneIntersectingObject(Monster.class);
        if(monster!=null){
            monster.dealDamage(damage);
            //quitar try catch
            getWorld().removeObject(this);
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
