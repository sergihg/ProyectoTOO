import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Scroller 
{
    private World world; // view window world
    private GreenfootImage scrollImage; // scrolling image
    private boolean limited; // flag to indicate whether scrolling is limited or not
    private int scrolledX, scrolledY; // current scrolled distances
    private int wide, high; // if limited, dimensions of scrolling area else of image to wrap
    
    public Scroller(World viewWorld, GreenfootImage image)
    {
        world = viewWorld;
        scrollImage = image;
        limited =false;
        if (image != null)
        {
            wide = image.getWidth();
            high = image.getHeight();
        }
        scroll(0, 0); // sets initial background image
    }
    public void scroll(int dsx, int dsy)
    {
        
        // update scroll positions
        scrolledX += dsx;
        scrolledY += dsy;
        // scroll background image
        if (scrollImage != null)
        {
            // create working variables of scroll positions
            int imageX = scrolledX*world.getCellSize();
            int imageY = scrolledY*world.getCellSize();
            // get near-zero starting positions for drawing 'scrollImage'
            imageX = imageX%wide;
            imageY = imageY%high;
            // adjust negative values as needed
            if (imageX < 0) imageX += wide;
            if (imageY < 0) imageY += high;
            // create image of appropriate size and tile fill 'scrollImage' onto it
            GreenfootImage hold = new GreenfootImage(scrollImage);
            hold.drawImage(scrollImage, -imageX, -imageY);
            if (imageX > 0) hold.drawImage(scrollImage, wide-imageX, -imageY);
            if (imageY > 0) hold.drawImage(scrollImage, -imageX, high-imageY);
            if (imageX > 0 && imageY > 0)
            hold.drawImage(scrollImage, wide-imageX, high-imageY);
            // set image to background of 'world'
            world.setBackground(hold);
        }
        // adjust position of all actors (that can move with 'setLocation')
        for (Object obj : world.getObjects(null))
        {
            Actor actor = (Actor) obj;
            actor.setLocation(actor.getX()-dsx, actor.getY()-dsy);
        }
    }
   
    /**
     * getter method for the current total scrolled distance horizontally
     *
     * @return the current total offset of horizontal scrolling
     */
    public int getScrolledX()
    {
        return scrolledX;
    }
   
    /**
     * getter method for the current total scrolled distance vertically
     *
     * @return the current total offset of vertical scrolling
     */
    public int getScrolledY()
    {
        return scrolledY;
    }
}
