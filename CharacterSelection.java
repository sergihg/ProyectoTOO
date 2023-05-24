import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterSelection here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelection extends Button
{
    private String player;
    public CharacterSelection(String image, String player){
        setImage(image);
        this.player=player;
    }
    String getPlayer(){
        return player;
    }
}
