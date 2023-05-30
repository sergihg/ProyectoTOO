import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ClearPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ClearPage extends SelectionPage
{
    private Player player;
    private GreenfootImage playerImage;
    private boolean newHighscore;
    private static final int STRINGS_X=300;
    private static final int STRINGS_Y=70;
    private static final int SPACING =25;
    
    public ClearPage(Player player)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super();
        this.player = player;
        playerImage = player.getImage();
        newHighscore = RecordHandler.newRecord(player.getScore());
        addObject(new MenuButton(), 100, getHeight()-50);
        
    }
    public void act()
    {
        if(player.isAlive()){
            showText("**********STAGE CLEARED***********", STRINGS_X , STRINGS_Y);
        }else{
            showText("**********GAME OVER**********", STRINGS_X , STRINGS_Y);
        }
        showText("Character:  "+ player.getEnum(), STRINGS_X , STRINGS_Y + SPACING);
        showText("Final health: "+ player.getMaxHealth(),STRINGS_X,STRINGS_Y + 2*SPACING);
        showText("Final defense: "+ player.getDefense(),STRINGS_X,STRINGS_Y + 3*SPACING);
        showText("Final speed: "+ player.getSpeed(),STRINGS_X,STRINGS_Y + 4*SPACING);
        showText("Final attack: "+ player.getAttack(),STRINGS_X,STRINGS_Y + 5*SPACING);
        showText("Final Cooldown: "+ player.getCooldown(),STRINGS_X,STRINGS_Y + 6*SPACING);
        showText("Final Score: "+ player.getCooldown(),STRINGS_X,STRINGS_Y + 7*SPACING);
        
        if(newHighscore){
            showText("**********NEW HIGHSCORE**********",STRINGS_X,STRINGS_Y + 8*SPACING);
        }
        
    }
}
