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
    private WorldSelection selection1 = new WorldSelection(WorldEnum.STAGE1);
    
    //private CharacterSelection selection = new CharacterSelection(option);
    private WorldButton start;
    
    private static final int STRINGS_X=400;
    private static final int STRINGS_Y=66;
    private static final int SPACING =20;
    
    public StageSelectionPage(CharacterEnum character)
    {    
        super(); 
        this.character = character;
        world = new Stage1(character);
        start = new WorldButton(world);
        
        this.character = character;
        
        addObject(new MenuButton(), 100, getHeight()-50);
        addObject(start, getWidth()-100,getHeight()-50);
        
        addObject(selection1,200,200);
    }
    
    public void setOption(WorldEnum option){
        this.option = option;
        switch(option){
            case STAGE1:
                world = new Stage1(character);
                start.selectWorld(world);
                break;
        }
    }
}
