import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WorldSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonWorldSelection extends Actor
{
    private WorldEnum option;
    private GreenfootImage image;
    
    public ButtonWorldSelection(WorldEnum option){
        this.option = option;
        switch(option){
            case GRAVEYARD:
                image = new GreenfootImage("images/backgrounds/graveyardPlaceholder.png");
                break;
            case FOREST:
                image = new GreenfootImage("images/backgrounds/forestPlaceholder.png"); 
                break;
            case WASTELAND:
                image = new GreenfootImage("images/backgrounds/wastelandPlaceholder.png"); 
                break;
        }
        image.scale(100,100);
        setImage(image);
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sounds/beep.mp3");
            selectWorld();
        }
    }
    public void selectWorld(){
        StageSelectionPage world = (StageSelectionPage)getWorld();
        //quitar try catch
        world.setOption(option);
    }
}
