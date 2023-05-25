import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.EnumMap;

/**
 * Write a description of class CharacterSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelection extends Button
{
    private CharacterEnum option;
    public CharacterSelection(CharacterEnum option){
        this.option = option;
        switch(option){
            case ARCHER:
                setImage("images/characters/archer1.png"); 

        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(this)){
            selectCharacter();
        }
    }
    public void selectCharacter(){
        CharacterSelectionPage world = (CharacterSelectionPage)getWorld();
        try{
            world.setOption(option);
        }catch(Exception ex){
            
        }
    }
}
