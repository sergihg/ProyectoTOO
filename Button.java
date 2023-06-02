import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Guide here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Button extends Actor
{
    private World world;
    public Button(ButtonEnum button){
        switch(button){
            case GUIDE:
                setImage("images/buttons/guide.png");
                world = GuidePage.getGuidePage();
                break;
            case MENU:
                setImage("images/buttons/menu.png");
                world = MainPage.getMainPage();
                break;
            case RECORD:
                setImage("images/buttons/record.png");
                world = RecordPage.getRecordPage();
                break;
        }
    }
    public void act(){
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("sounds/beep.mp3");
            Greenfoot.setWorld(world);
        }
    }
}
