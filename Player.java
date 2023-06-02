import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Character here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Player extends Actor
{
    protected static final int DIRECTION_RIGHT= 0;
    protected static final int DIRECTION_LEFT = 1;
    protected static final int DAMAGE_DELAY = 100;
    
    protected static final int WEAPON_OFFSET = 10;
    
    protected CharacterEnum character;
    protected double cooldown;
    protected double maxHealth;
    protected double health;
    protected double defense;
    protected int speed;
    protected Weapon weapon;
    protected int score;
    
    protected boolean alive=true;
    protected double weaponCooldown;
    protected int damageInflictedDelay;
    protected int imageDelay;
    protected int imageIndex;
    protected String []images;
    protected int direction;
    
    public abstract void loadImages();
    
    public void act()
    {
        handleMovement();
        
        attack();
        checkMonsterCollisions();
        
        showScore();
        checkState();
    }
    protected void showScore(){
        World world = getWorld();
        world.showText("Score: "+score,world.getWidth()-100,20);
        world.showText("Health: "+health,world.getWidth()-500,20);
        
    }
    protected void attack(){
        if(weaponCooldown<=0){
            Greenfoot.playSound("sounds/attack.mp3");
            weapon.attack();
            weaponCooldown = cooldown;
        }else{
            weaponCooldown--;
        }
    }
    protected void handleMovement(){
        Stage stage = (Stage)getWorld();
        if(Greenfoot.isKeyDown("left")){
            direction=DIRECTION_LEFT;
            stage.scroll(-speed, 0);
            setLocation(getX()-speed,getY());
            imageSelector();
            weapon.changeDirection(direction);
        }else if(Greenfoot.isKeyDown("right")){
            direction=DIRECTION_RIGHT;
            stage.scroll(speed, 0);
            setLocation(getX()+speed,getY());
            imageSelector();
            weapon.changeDirection(direction);
        }else if(Greenfoot.isKeyDown("up")){
            stage.scroll(0, -speed);
            setLocation(getX(),getY()-speed);
        }else if(Greenfoot.isKeyDown("down")){
            stage.scroll(0, speed);
            setLocation(getX(),getY()+speed);
        }
        
        if(direction==1){
            weapon.moveWeapon(getX()-WEAPON_OFFSET, getY());
        }else{
            weapon.moveWeapon(getX()+WEAPON_OFFSET, getY());
        }
    }
    protected void imageSelector(){
        setImage(images[direction]);
    }
    protected void checkMonsterCollisions(){
        Monster monster = (Monster)this.getOneIntersectingObject(Monster.class);
        if(damageInflictedDelay == 0){
            if(monster!=null){
                score-=10;
                damageInflicted(monster.getDamage());
                damageInflictedDelay = DAMAGE_DELAY;
            }
        }else{
            damageInflictedDelay--;
        }
    }
    
    protected void damageInflicted(int damageReceived){
        health-= damageReceived;
    }
    public int getDirection(){
        return direction;
    }
    
    public void checkState(){
        if(isAlive() && health<=0){
            alive = false;
        }
    }
    public boolean isAlive(){
        return alive;
    }
    
    //SETTERS QUE USAN LOS OBJETOS QUE PUEDE RECOGER EL PLAYER
    public double getCooldown(){
        return cooldown;
    }
    public void setCooldown(double cooldown){
        this.cooldown -= (cooldown*this.cooldown);
    }
    
    public void setHealth(){
        health =maxHealth;
    }
    public double getMaxHealth(){
        return maxHealth;
    }
    public void setMaxHealth(double health){
        this.maxHealth += (health*this.maxHealth);
    }
    
    public double getDefense(){
        return defense;
    }
    public void setDefense(double defense){
        this.defense += (defense*this.defense);
    }
    
    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed +=speed;
    }
    
    public double getAttack(){
        return weapon.getDamage();
    }
    public void setAttack(double damage){
        weapon.setDamage(damage);
    }
    
    public void setScore(int score){
        this.score += score;
    }
    
    public CharacterEnum getEnum(){
        return character;
    }
    public Weapon getWeapon(){
        return weapon;
    }
    
    public int getScore(){
        return score;
    }
}
