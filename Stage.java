import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
    
    protected boolean pause;
    
    public Stage(CharacterEnum character)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1,false); 
        this.character = character;
        pause = false;
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
    }
    public void act(){
        if(!(player.isAlive())){
            Greenfoot.setWorld(new ClearPage(player));
        }
        checkPauseResume();
    }
    private void checkPauseResume(){
        if(pause){
            resume();
        }
        pause();
    }
    private void pause(){
        
    }
    private void resume(){
        
    }
    public void setScore(int score){
        player.setScore(score);
    }
}
