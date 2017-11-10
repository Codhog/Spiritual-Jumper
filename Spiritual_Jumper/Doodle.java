import java.awt.*;
import java.applet.*;

/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * The Doodle class is used to create the Doodle object, the object which the user will be playing as, within the game. 
 * The class also extends from the Character class. 
 */
public class Doodle extends Character
{
   private int stepy;
   private int id;
   private int velocity;
   private int hVelocity;
   private int count;
   private int hFacing;

	// default constructor, sets all to zero
   /**
    * This method is used as a constructor for the class, it creates a Doodle object with the default parameter values of 0. 
    * 
    * @param id - This parameter is used to represent the identity of the Doodle object. 
    * @param x - This parameter is used to represent the x position of the Doodle object. 
    * @param y - This parameter is used to represent the y position of the Doodle object. 
    * @param w - This parameter is used to represent the width of the Doodle object. 
    * @param h - This parameter is used to represent the height of the Doodle object. 
    */
	public Doodle(int id, int x, int y, int w, int h)
	{
		super(id,x,y,w,h);
		velocity=0;
		// L and R velocity
		hVelocity=10;
		count=0;
	}
	
	/**
	 * This method is used as a getter to retrieve the velocity of the Doodle object. 
	 * 
	 * @return The velocity of the Doodle object is retrieved. 
	 */
	public int getVelocity()
	{
		return velocity;
	}
	
	/**
	 * This method is used as a setter to set the velocity of the Doodle object to a value v. 
	 * 
	 * @param v - This parameter represents the new velocity of the Doodle object. 
	 */
	public void setVelocity(int v)
	{
		velocity = v;
	}
	
	/**
	 * This method is used as a setter to set which way the Doodle is facing. 
	 * 
	 * @param hf - This paramater is used to set which way the Doodle is facing. 
	 */
	public void setHFacing(int hf)
	{
		hFacing = hf;
	}

	//returns the index number of the needed image from the ArrayList
	// at location 1 in ArrayList of images
	/**
	 * This method returns the id value of the Doodle object.
	 * 
	 * @return The id value is returned. 
	 */
	public int show()
	{
		return id;
	}
	
	/**
	 * This method is used to create a string showing the x and y position of the Doodle.
	 * 
	 * @return A string representing the x and y position of the Doodle is returned. 
	 */
	public String toString()
	{
		return "Doodle x: "+x+"|y: "+y;
	}
	

	/**
	 * The move method is used to maneuver the Doodle object within the game. It includes the movement of the Doodle in the Y and X axis.
	 */
	public void move()
	{
		// ################# Y AXIS #####################
		// negative acceleration (gravity factor)
		int acceleration = 1;
		
		if(velocity!=0){
			if(velocity<=-1)
				acceleration=1;
			if(velocity>=1)
				acceleration=1;
		// gravity, count slows down the gravity so it doesnt reduce velocity every frame update
		if(count>2){
			// set this number for max falling speed
			if(velocity<20){
				/* if velocity = 0 (means game has not started), dont do anything
				     if velocity with velocity ==0, prevent it from being 0 so program is
				     not confused with game start (because it does nothing on game start) */
				if(velocity+acceleration==0){
					velocity=0;
				}
				velocity=velocity+acceleration;
			}

			count=0;
		}		
		count++;	
		changeY(velocity);
		}
		
		
		
		// ################# X AXIS #####################
		// horizontal velocity
			
		switch (hFacing)	{
			case -1: changeX(-hVelocity); break;
			case 0: changeX(0); break;
			case 1: changeX(hVelocity); break;
		}	

	//	System.out.println("Doodle x: "+super.getX()+" | y: "+super.getY()+ " | v: "+velocity + " | a: "+acceleration);
		
		checkLRBounds();
	}
	
	/**
	 * This method is used to check if the Doodle hits the base of a platform in the game.
	 * 
	 * @param obj - This parameter represents a platform object which is being checked if the Doodle hits it or not.
	 * @return Boolean true is returned if the Doodle does hit the platform, false if otherwise.
	 */
	public boolean checkHitPlatform(Object obj)
	{
		Platform other = (Platform) obj;
		
		if(getX()+getWidth()>=other.getX()&&
			getX()<=other.getX()+other.getWidth() &&
			getY()+getHeight() >=other.getY() &&
			getY()+getHeight() <= other.getY()+other.getHeight())
		   return true;
		return false;
	}
	
	/**
	 * This method is used to check if the Doodle is reaching the boundaries of the game display, and modifies the position of the doodle
	 * so it does not disappear when it shouldn't, such as when a user moves the Doodle to the far left and the Doodle re appears on the 
	 * far right side. 
	 */
	public void checkLRBounds()
	{
		if(getX()>445)
			setX(-60);
			
		if(getX()<-60)
			setX(445);
			
		if(getY()<10)
			setY(10);	
	}
		
}