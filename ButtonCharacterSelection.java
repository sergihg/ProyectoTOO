import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.EnumMap;

/**
 * Write a description of class CharacterSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButtonCharacterSelection extends Actor
{
    private CharacterEnum option;
    public ButtonCharacterSelection(CharacterEnum option){
        this.option = option;
        switch(option){
            case ARCHER:
                setImage("images/characters/archer1.png"); 
            break;
            case KNIGHT:
                setImage("images/characters/knight1.png"); 
            break;

        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.playSound("sounds/beep.mp3");
            selectCharacter();
        }
    }
    public void selectCharacter(){
        CharacterSelectionPage world = (CharacterSelectionPage)getWorld();
        world.setOption(option);    
        }
}
