import java.awt.*;
import java.applet.*;
/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * The Bullet class implements the Bullet object within the game which is used when the user decides to fire their weapon. The Bullet class 
 * extends from the Character class. 
 */
public class Bullet extends Character
{
   private int stepy;
   private int id;
   private int legStep,heightStep;
	   
   /**
    * The Bullet method is the default constructor of the Bullet, all the values are set to zero to initialize the Bullet.
    *  
    * @param id - The id parameter represents the identification of the Bullet.
    * @param x - The x parameter represents the x-coordinate of the Bullet.
    * @param y - The y parameter represents the y-coordinate of the Bullet.
    * @param w - The w parameter represents the width of the Bullet.
    * @param h - The h parameter represents the height of the Bullet.
    */
	public Bullet(int id, int x, int y, int w, int h)
	{
		super(id,x,y,w,h);
		stepy=5;
	}
	
	/**
	 * The move method is used to move the Bullet's x and y positions according to the legStep and the heightStep which represents how much the 
	 * co-ordinates are being changed. 
	 */
	public void move()
	{
		changeX(legStep);
		changeY(heightStep);
	}
	
	/**
	 * The changeStepY method is used to change the stepy values.
	 * 
	 * @param y - The y parameter represents the change in the y direction to the stepy value.
	 */
	public void changeStepY(int y)
	{
		stepy += y;
	}
	
	/**
	 * The setLegStep method is used as a setter, setting the legStep value, which is the amount of change in the x direction of the Bullet.
	 * 
	 * @param ls - The ls parameter represents the value being set to the legStep variable, which is how much change there is in the x direction
	 * for the Bullet. 
	 */
	public void setLegStep(int ls)
	{
		legStep=ls;
	}
	
	/**
	 * The setHeightStep method is used as a setter, setting the heightStep value, which is the amount of change in the y direction of the Bullet.
	 * 
	 * @param hs - The hs parameter represents the value being set to the heightStep variable, which is how much change there is in the y direction
	 * for the Bullet.
	 */
	public void setHeightStep(int hs)
	{
		heightStep=hs;
	}
	
	/**
	 * The getHeightStep method is used as a getter, retrieving the heightStep value, which is the amount of change in the y direction of the Bullet.
	 * 
	 * @return The heightStep value is returned.
	 */
	public int getHeightStep()
	{
		return heightStep;
	}
	
	/**
	 * The getLegStep method is used as a getter, retrieving the legStep value, which is the amount of change in the x direction of the Bullet.
	 * 
	 * @return The legStep value is returned.
	 */
	public int getLegStep()
	{
		return legStep;
	}

	/**
	 * The show method is used to retrieve the id value, which represents the identity of the Bullet object.
	 * 
	 * @return The id is returned.
	 */
	public int show()
	{
		return id;
	}
	
	/**
	 * The toString method is used to return a string which indicates the x and y position of the Bullet, with a space inbetween.
	 * 
	 * @return A string with the x and y positions of the Bullet with a space inbetween is returned. 
	 */
	public String toString()
	{
		return x + " " + y;
	}
}