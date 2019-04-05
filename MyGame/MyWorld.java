import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Selena Yang 
 * @version 2019. 4. 5
 */
public class MyWorld extends World
{
    //Showing introduction
        private boolean shouldBeShowingIntroduction;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        
        //Game showing inttoduction about how to play
        shouldBeShowingIntroduction = true;
    }
    
    /**
     * Update th action in the world
     */
    public void act()
    {
        if(shouldBeShowingIntroduction)
        {
            showIntroduction();
            lookForGameStart();
        }
    }
    
     /**
     * Show introduction for the game
     */
     private void showIntroduction()
     {
         this.showText("Welcome to Battleground", 250, 75);
         this.showText("Press the tank to control", 250, 175);
         this.showText("Don't get hit by the bullets and rocks", 250, 235);
         this.showText("Press SPACE to start the game", 250, 335);
        }   
        
    /**
     * Hide introduction
     */
    private void hideIntroduction()
    {
        this.showText("", 250, 75);
        this.showText("", 250,175);
        this.showText("", 250,235);
        this.showText("", 250,335);
    }
    
    /**
     * Starting the game 
     */
    private void lookForGameStart()
    {
        if(Greenfoot. isKeyDown("space"))
        {
            this.shouldBeShowingIntroduction = false;
            this.hideIntroduction();
        }
    }
        
}
