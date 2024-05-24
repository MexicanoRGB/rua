import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class blue here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class blue extends Actor
{
    /**
     * Act - do whatever the blue wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        setRotation(180);
    }    
    int velocidade = 10;
    int[] nums = new int[] {75, 250, 325, 500};
    public void movement(){
        setLocation(getX(), getY()+velocidade);
        if(getY() >=600){
            setLocation(nums[Greenfoot.getRandomNumber(3)], -50);
        }

    }
}
