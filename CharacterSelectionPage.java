import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharacterSelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharacterSelectionPage extends World
{
    //default character: archer
    private CharacterEnum option= CharacterEnum.ARCHER;
    private ButtonCharacterSelection selection1 = new ButtonCharacterSelection(CharacterEnum.ARCHER);
    private ButtonCharacterSelection selection2 = new ButtonCharacterSelection(CharacterEnum.KNIGHT);

    private World world = new StageSelectionPage(option);
    private Player currentPlayer = new Archer();
    //private CharacterButton start = new CharacterButton(world);
    private ButtonStart start = new ButtonStart(world);

    private static final int STRINGS_X=400;
    private static final int STRINGS_Y=66;
    private static final int SPACING =20;

    private boolean update;

    public CharacterSelectionPage()
    {    
        super(600, 400, 1); 
        update = true;

        //por default ARCHER esta seleccionado
        BackgroundSelector.setBackground(BackgroundEnum.OTHER, this);
        addObject(start, getWidth()-100,getHeight()-50);
        addObject(new Button(ButtonEnum.MENU), 100, getHeight()-50);

        addObject(selection1,200,200);
        addObject(selection2,150,200);
    }

    public void act()
    {
        //checar cambios no ejecutar en cada pasado
        if(update){
            showText("**********Stats**********", STRINGS_X , STRINGS_Y);
            showText("Character:  "+ option, STRINGS_X , STRINGS_Y + SPACING);
            showText("Health: "+ currentPlayer.getMaxHealth(),STRINGS_X,STRINGS_Y + 2*SPACING);
            showText("Defense: "+ currentPlayer.getDefense(),STRINGS_X,STRINGS_Y + 3*SPACING);
            showText("Speed: "+ currentPlayer.getSpeed(),STRINGS_X,STRINGS_Y + 4*SPACING);
            showText("Attack: "+ currentPlayer.getAttack(),STRINGS_X,STRINGS_Y + 5*SPACING);
            showText("Cooldown: "+ currentPlayer.getCooldown(),STRINGS_X,STRINGS_Y + 6*SPACING);
            update = false;
        }
    }

    public void setOption(CharacterEnum option){
        this.option = option;
        world = new StageSelectionPage(option);
        start.setWorld(world);
        switch(option){
            case ARCHER:
                currentPlayer = new Archer();
                break;
            case KNIGHT:
                currentPlayer = new Knight();
                break;
        }
        update=true;
    }
}
