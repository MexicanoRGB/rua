import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class gas here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class gas extends Actor
{
    /**
     * Act - do whatever the gas wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getImage().scale(30,30);
        movement();
        collision();
    }    
    int[] nums = new int[] {75, 250, 325, 500};
    public void movement(){
        setLocation(getX(), getY()+5);
        if(getY() >=600){
            setLocation(nums[Greenfoot.getRandomNumber(3)], -50);
        }

    }
    public void collision() {
     if(getOneIntersectingObject(white.class)!=null){
             setLocation(nums[Greenfoot.getRandomNumber(3)], -50);
        }
    }
        
}
