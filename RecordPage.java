import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;

/**
 * Write a description of class RecordPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RecordPage extends World
{
    private static final int STRINGS_X=300;
    private static final int STRINGS_Y=70;
    private static final int SPACING =30;

    private static final World world = new RecordPage();
    private List leaderboard;
    private static boolean update;

    public RecordPage()
    {    
        super(600,400,1);
        BackgroundSelector.setBackground(BackgroundEnum.OTHER, this);
        addObject(new Button(ButtonEnum.MENU), 100, getHeight()-50);
        update = true;
    }

    public void act(){
        if(update){
            leaderboard = RecordHandler.getleaderboard();
            showText("**********LEADERBOARD**********", STRINGS_X , STRINGS_Y);
            for(int i=0 ; i<5 ; i++)
            {
                int y = STRINGS_Y+(SPACING*(2+i));
                try{
                    UserInfo user = (UserInfo)leaderboard.get(i);
                    showText(i+1 + "     " + user.getUserName() + "     " + user.getScore(), STRINGS_X , y);
                }catch(Exception ex){
                    showText(i+1 + "-----------------------------", STRINGS_X , y);
                }
            }
        }
    }

    public static World getRecordPage(){
        update = true;
        return world;
    }
}
