import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterButton extends StartButton
{
    public CharacterButton(World world)
    {
        super(world);
    }
    public void selectCharacter(World world)
    {
        this.world = world;
    }
}
