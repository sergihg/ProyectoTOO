import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class StageSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StageSelectionPage extends World
{
    //default stage: stage1
    private WorldEnum option= WorldEnum.GRAVEYARD;
    private CharacterEnum character;
    private Stage world;
    private ButtonWorldSelection selection1 = new ButtonWorldSelection(WorldEnum.GRAVEYARD);
    private ButtonWorldSelection selection2 = new ButtonWorldSelection(WorldEnum.FOREST);
    private ButtonWorldSelection selection3 = new ButtonWorldSelection(WorldEnum.WASTELAND);
    
    //private CharacterSelection selection = new CharacterSelection(option);
    private ButtonStart start;
    private boolean update;
    
    private static final int SELECTIONS_X=150;
    private static final int SELECTIONS_Y=130;
    private static final int STRINGS_X=300;
    private static final int STRINGS_Y=200;
    private static final int SPACING =20;
    
    public StageSelectionPage(CharacterEnum character)
    {    
        super(600,400,1);
        BackgroundSelector.setBackground(BackgroundEnum.OTHER, this);
        this.character = character;
        world = new Stage1(character);
        start = new ButtonStart(world);
        
        this.character = character;
        
        addObject(new Button(ButtonEnum.MENU), 100, getHeight()-50);
        addObject(start, getWidth()-100,getHeight()-50);
        
        addObject(selection1,SELECTIONS_X,SELECTIONS_Y);
        addObject(selection2,2*SELECTIONS_X,SELECTIONS_Y);
        addObject(selection3,3*SELECTIONS_X,SELECTIONS_Y);
        
        update= true;
    }
    
    public void act(){
        if(update){
            showText("*********** "+option+" ***********", 300, STRINGS_Y);
            List description = world.getDescription();
            for(int i = 0; i< description.size() ; i++){
                showText((String)description.get(i), 300, STRINGS_Y+(SPACING*(i+1)));
            }
            update = false;
        }
    }
    
    public void setOption(WorldEnum option){
        this.option = option;
        switch(option){
            case GRAVEYARD:
                world = new Stage1(character);
                start.setWorld(world);
                break;
            case FOREST:
                world = new Stage2(character);
                start.setWorld(world);
                break;
            case WASTELAND:
                world = new Stage3(character);
                start.setWorld(world);
                break;
        }
        update = true;
    }
}
