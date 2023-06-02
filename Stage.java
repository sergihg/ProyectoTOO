import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class Stage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class Stage extends World
{
    protected GreenfootImage background;
    protected Scroller scroller = null;
    protected MobHandler handler;
    
    protected MonsterEnum monster;
    protected CharacterEnum character;
    protected Player player;
    protected List description;
    
    protected boolean pause;
    protected static final GreenfootSound sound = new GreenfootSound("sounds/music.mp3");
    
    public Stage(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        this.character = character;
    }
    
    public void scroll(int x, int y){
        scroller.scroll(x, y);
    }
    
    protected void prepare()
    {
        switch(character){
            case ARCHER:
                player = new Archer();
                addObject(player,getWidth()/2,getHeight()/2);
                addObject(player.getWeapon(),getWidth()/2,getHeight()/2);
                break;
            case KNIGHT:
                player = new Knight();
                addObject(player,getWidth()/2,getHeight()/2);
                addObject(player.getWeapon(),getWidth()/2,getHeight()/2);
        }
        sound.stop();
    }
    public void act(){
        if(!sound.isPlaying())
        {
            startMusic();
        }
        if(!(player.isAlive())){
            Greenfoot.playSound("sounds/gameOver.mp3");
            Greenfoot.setWorld(new ClearPage(player));
            sound.stop();
        }
    }
    public void setScore(int score){
        player.setScore(score);
    }
    public int getPlayerDirection(){
        return player.getDirection();
    }
    public List getDescription(){
        return description;
    }

    public void startMusic(){
        sound.playLoop();
    }
}
