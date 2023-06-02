import greenfoot.*;

/**
 * Write a description of class BackgroundSelector here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BackgroundSelector  
{
    public static void setBackground(BackgroundEnum option, World world){
        GreenfootImage background;
        switch(option)
        {
            case MENU:
                background = new GreenfootImage("images/backgrounds/main.png");
                background.scale(background.getWidth(), background.getHeight()+10);
                world.setBackground(background);
                break;
            case OTHER:
                background = new GreenfootImage("images/backgrounds/main.png");
                background.scale(background.getWidth(), background.getHeight()+10);
                world.setBackground(background);
                
                world.addObject(new Label1(), world.getWidth()/2, (world.getHeight()/2)-30 );
                break;
        }
    }
}
