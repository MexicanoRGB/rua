import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class white here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class white extends Actor
{
    /**
     * Act - do whatever the white wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
        collision();
    }    
    
    public void collision(){
        if(getOneIntersectingObject(red.class)!=null){
            Greenfoot.stop();
            getWorld().showText("Você Bateu", 200, 300);
        }
        if(getOneIntersectingObject(green.class)!=null){
            Greenfoot.stop();
            getWorld().showText("Você Bateu", 200, 300);
        }
        if(getOneIntersectingObject(blue.class)!=null){
            Greenfoot.stop();
            getWorld().showText("Você Bateu", 200, 300);
        }
        if(getOneIntersectingObject(Ambu.class)!=null){
            Greenfoot.stop();
            getWorld().showText("Você Bateu", 200, 300);
        }
    }
    int velocidade = 6;
    public void movement(){
        if(Greenfoot.isKeyDown("a")){
            setLocation(getX()-velocidade, getY());
        }
        
        if(Greenfoot.isKeyDown("d")){
            setLocation(getX()+velocidade, getY());
        }
        if(Greenfoot.isKeyDown("w")){
            setLocation(getX(), getY()-velocidade);
        }
        if(Greenfoot.isKeyDown("s")){
            setLocation(getX(), getY()+velocidade);
        }
    }
}
