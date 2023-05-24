import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectionPage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectionPage extends World
{
    public SelectionPage()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        GreenfootImage background = new GreenfootImage("images/backgrounds/main.png");
        background.scale(background.getWidth(), background.getHeight()+10);
        setBackground(background);
    }
}
