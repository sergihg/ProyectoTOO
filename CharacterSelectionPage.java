import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelectionPage extends SelectionPage
{
    private Player currentPlayer;

    public CharacterSelectionPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        addObject(new StartButton(new StageSelectionPage()), getWidth()-100,getHeight()-50);
        addObject(new MenuButton(), 100, getHeight()-50);
        
        addObject(new CharacterSelection("images/characters/archer1.png","archer"),200,200);
    }
}
