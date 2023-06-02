import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Monster here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Monster extends Actor
{
    protected int damage;
    protected double health;
    protected int speed;
    protected int score;
    protected GreenfootImage image;
    
    public void act()
    {
        move(speed);
        Player character = getWorld().getObjects(Player.class).get(0);
        turnTowards(character.getX(), character.getY());
    }
    public int getDamage(){
        return damage;
    }
    public void dealDamage(double damage){
        health -= damage;
        if(health<=0){
            Stage world = (Stage)getWorld();
            dropObject();
            world.setScore(score);
            Greenfoot.playSound("sounds/kill.mp3");
            world.removeObject(this);
        }
    }
    protected void dropObject(){
        int generation = Greenfoot.getRandomNumber(10)+1;
        World world = getWorld();
        int x = getX();
        int y = getY();
        
        if(generation%2==0)
        {
            generation = Greenfoot.getRandomNumber(2)+1;
            if(generation==1){
                world.addObject(new OrbBig(), getX(), getY());
            }else{
                world.addObject(new OrbSmall(), getX(), getY());
            }
            return;
        }
        generation = Greenfoot.getRandomNumber(30)+1;
        if(generation<7){
            switch(generation){
                case 1:
                    world.addObject(new Chicken(), x, y);
                    break;
                case 2:
                    world.addObject(new Damage(), x, y);
                    break;
                case 3:
                    world.addObject(new Drink(), x, y);
                    break;
                case 4:
                    world.addObject(new Feather(), x, y);
                    break;
                case 5:
                    world.addObject(new Hearth(), x, y);
                    break;
                case 6:
                    world.addObject(new Shield(), x, y);
                    break;
            }
            
        }
    }
}
