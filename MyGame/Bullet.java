import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Rock here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Obstacles
{
    /**
     * Act - do whatever the Rock wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        moveDown();
        endGame();
    }    

    public void moveDown()
    {
        setRotation(90);
        move(3);
    }
    
        public void endGame()
    {
        if (isAtEdge())
        {
            Battleground battleground = (Battleground)getWorld();
            battleground.gameOn = false;
            getWorld().showText("Game Over",300,200);           
            getWorld().showText("",50,50);
            getWorld().showText("",450,50);
        }
    }
}
