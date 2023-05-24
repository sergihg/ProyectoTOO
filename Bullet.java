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
    public Bullet(double damage){
        setImage("images/weapons/bullet.png");
        try{
            Monster monster = getWorld().getObjects(Monster.class).get(0);
            turnTowards(monster.getX(), monster.getY());
        }catch(Exception ex){}         
        this.damage = damage;
    }
    public void act()
    {
        move(5);
        checkCollisions();
        if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
    private void checkCollisions(){
        Monster monster = (Monster)getOneIntersectingObject(Monster.class);
        if(monster!=null){
            monster.dealDamage(damage);
        }
    }
}
