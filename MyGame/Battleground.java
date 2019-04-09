import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author Selena Yang 
 * @version 2019. 4. 5
 */
public class Battleground extends World
{
    //Showing introduction
    private boolean shouldBeShowingIntroduction;
    private boolean gameOn;
    private int frames;
    private int time;
    public int score;

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public Battleground()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 500, 1); 

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
        this.showText("Press the tank to control", 250, 235);
        this.showText("Don't get hit by the bullets and rocks", 250, 275);
        this.showText("Press SPACE to start the game", 250, 385);
    }   

    /**
     * Hide introduction
     */
    private void hideIntroduction()
    {
        this.showText("", 250, 75);
        this.showText("", 250,235);
        this.showText("", 250,275);
        this.showText("", 250,385);
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
            startGame();

        }
    }

    private void startGame()
    {
        gameOn = true;
        frames = 0;
        time = 0;
        showTime();
        showScore();
        lookToAddObstacles();

    }

    private void showTime()
    {
        showText("Time:" + time, 50, 50);
    }

    private void showScore()
    {
        showText("Score:" + score, 450, 50);
    }

    /**
     * Set Timer
     */
    private void trackTime()
    {
        // Track frames (fps is about 60)
        frames += 1;

        //Reducing time
        if(frames % 60 == 0)
        {
            time += 1;
            showTime();
        }

    }

    private void lookToAddObstacles()
    {
        if (frames % 120 == 0)
        {
            addObstacles();
        }
    }

    private void addObstacles()
    {
        int x = Greenfoot.getRandomNumber(this.getWidth());
        int y = 0;

        if (Greenfoot.getRandomNumber(10) + 1 <= 6)
        {
            Bullet bullet = new Bullet();
            addObject(bullet, x, y);
        }
        else
        {
            Rock rock = new Rock();
            addObject(rock, x, y);
        }
    }
}

