
import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Obstacles
{
    /**
     * Act - do whatever the Bullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDown();
        disappearAtEdge();
    }    

    public void moveDown()
    {
        setRotation(90);
        move(3);
    }

    public void disappearAtEdge()
    {
        if (isAtEdge())
        {
            getWorld().removeObject(this);
        }
    }

    
}
