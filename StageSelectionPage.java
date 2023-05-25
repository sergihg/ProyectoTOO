import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StageSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelectionPage extends SelectionPage
{
    //default stage: stage1
    private WorldEnum option= WorldEnum.STAGE1;
    private CharacterEnum character;
    private World world;
    
    //private CharacterSelection selection = new CharacterSelection(option);
    
    private Player currentPlayer = new Archer(new Gun());
    private CharacterButton start = new CharacterButton(world);
    
    private static final int STRINGS_X=400;
    private static final int STRINGS_Y=66;
    private static final int SPACING =20;
    public StageSelectionPage(CharacterEnum character)
    {    
        super(); 
        this.character = character;
        addObject(new MenuButton(), 100, getHeight()-50);
    }
}
