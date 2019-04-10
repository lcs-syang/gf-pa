import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Tank here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tank extends Actor
{
    /**
     * Act - do whatever the Tank wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        removeObstacles();
        {
            // Get info about the mouse
            MouseInfo mouse = Greenfoot.getMouseInfo();

            if (mouse != null)
            {
                turnTowards(mouse.getX(), mouse.getY());
                move(7);
            }

        }        

    }
    private void removeObstacles()
    {
        if (isTouching(Obstacles.class))
        {
            removeTouching(Obstacles.class);
            Battleground battleground = (Battleground)getWorld();
            battleground.addScore();
        }
    }
}
