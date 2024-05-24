import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ambu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ambu extends Actor
{
    /**
     * Act - do whatever the Ambu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        setRotation(180);
    }    
    int velocidade = 15;
    int[] nums = new int[] {25, 200, 350, 500, 550};
    public void movement(){
        setLocation(getX(), getY()+velocidade);
        if(getY() >=600){
            setLocation(nums[Greenfoot.getRandomNumber(3)], -50);
        }

    }
}
