import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelectionPage extends SelectionPage
{
    //default character: archer
    private CharacterEnum option= CharacterEnum.ARCHER;
    private CharacterSelection selection = new CharacterSelection(option);
    
    private World world = new StageSelectionPage(option);
    private Player currentPlayer = new Archer(new Gun());
    private CharacterButton start = new CharacterButton(world);
    
    private static final int STRINGS_X=400;
    private static final int STRINGS_Y=66;
    private static final int SPACING =20;
    
    public CharacterSelectionPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(); 
        //por default ARCHER esta seleccionado
        addObject(start, getWidth()-100,getHeight()-50);
        addObject(new MenuButton(), 100, getHeight()-50);
        
        addObject(selection,200,200);
    }
    
    public void act()
    {
        showText("**********Stats**********", STRINGS_X , STRINGS_Y);
        showText("Character:  "+ option, STRINGS_X , STRINGS_Y + SPACING);
        showText("Health: "+ currentPlayer.getMaxHealth(),STRINGS_X,STRINGS_Y + 2*SPACING);
        showText("Defense: "+ currentPlayer.getDefense(),STRINGS_X,STRINGS_Y + 3*SPACING);
        showText("Speed: "+ currentPlayer.getSpeed(),STRINGS_X,STRINGS_Y + 4*SPACING);
        showText("Attack: "+ currentPlayer.getAttack(),STRINGS_X,STRINGS_Y + 5*SPACING);
        showText("Cooldown: "+ currentPlayer.getCooldown(),STRINGS_X,STRINGS_Y + 6*SPACING);
        
    }
    
    public void setOption(CharacterEnum option){
        this.option = option;
        world = new StageSelectionPage(option);
        start.selectCharacter(world);
        switch(option){
            case ARCHER:
                currentPlayer = new Archer(new Gun());
        }
    }
}
