import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WorldSelection extends Button
{
    private WorldEnum option;
    public WorldSelection(WorldEnum option){
        this.option = option;
        switch(option){
            case STAGE1:
                setImage("images/characters/archer1.png"); 

        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            selectWorld();
        }
    }
    public void selectWorld(){
        StageSelectionPage world = (StageSelectionPage)getWorld();
        try{
            world.setOption(option);
        }catch(Exception ex){
            
        }
    }
}
