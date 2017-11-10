import java.awt.*;
import java.applet.*;

/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * The Character class is an abstract class which is used to create objects which are used within the game. It is referenced by several other classes
 * as this class contains the foundations for creating visable objects for the game.
 */
public abstract class Character
{
	protected int x, y, id;
	protected int width, height;
	
	/**
	 * The Character method is used as a constructor to initialize the Character object and set all the values to the default values of 0. 
	 */
	public Character()
	{
		x = 0;
		y = 0;
		width = 0;
		height = 0;
		id=0;
	}
	
	/**
	 * This Character method is also a constructor for Character objects but with the inclusion of paramaters which may be set from the start.
	 * 
	 * @param id1 - This parameter is used to create an identity for a specific Character object. 
	 * @param x1 - This parameter is used to set the initial x position within the game for the Character object.
	 * @param y1 - This parameter is used to set the initial y position within the game for the Character object.
	 * @param w - This parameter is used to set the initial width within the game for the Character object.
	 * @param h - This parameter is used to set the initial height within the game for the Character object.
	 */
	public Character(int id1, int x1, int y1, int w, int h)
	{
		id = id1;
		x = x1;
		y = y1;
		width = w;
		height = h;
	}
	
	/**
	 * The show method is an abstract method used to return the index number of the needed image from the ArrayList.
	 * 
	 * @return The index number of the needed image from the ArrayList is returned.
	 */
	public abstract int show();
		
	/**
	 * The move method is an abstract method used to define how each Character moves.
	 */
	public abstract void move();

	/**
	 * This method is used a getter to fetch the id of a Character object.
	 * 
	 * @return The id of a Character object is returned.
	 */
	public int getId()
	{
		return id;
	}
	
	/**
	 * This method is used as a setter to set the id of a Character object.
	 * 
	 * @param i - This paramated is the value which is to be set as the id of a Character object.
	 */
	public void setId(int i)
	{
		id = i;
	}
	
	/**
	 * This method is used as a getter to retrieve the x position of the Character object.
	 * 
	 * @return The x position of the Character object is returned.
	 */
	public int getX()
	{
		return x;
	}
	
	/**
	 * This method is used as a getter to retrieve the y position of the Character object.
	 * 
	 * @return The y position of the Character object is returned.
	 */
	public int getY()
	{
		return y;
	}
	
	/**
	 * This method is used as a getter to retrieve the width of the Character object.
	 * 
	 * @return The width of the Character object is returned.
	 */
	public int getWidth()
	{
		return width;
	}
	
	/**
	 * This method is used as a getter to retrieve the height of the Character object.
	 * 
	 * @return The height of the Character object is returned. 
	 */
	public int getHeight()
	{
		return height;
	}
	
	/** This method is used to set the x position of the Character object.
	 * 
	 * @param x1 - This parameter represents the x position which is to be set for the Character object.
	 */
	public void setX(int x1)
	{
		x = x1;
	}
	
	/**
	 * This method is used to set the y position of the Character object.
	 * 
	 * @param y1 - This parameter represents the y position which is to be set for the Character object. 
	 */
	public void setY(int y1)
	{
		y = y1;
	}
	
	/**
	 * This method is used to modify the x position of the Character object by a k value. 
	 * 
	 * @param k - This parameter represents the amount of change which is going to be enacted on the x value of the Character object. 
	 */
	public void changeX(int k)
	{
		x += k;
	}
	
	/**
	 * This method is used to modify the y position of the Character object by a k value.
	 * 
	 * @param k - This parameter represents the amount of change which is going to be enacted on the y value of the Character object.
	 */
	public void changeY(int k)
	{
		y += k;
	}
	
	// overridden in Fireball to remove from ArrayList
	/**
	 * This method is used to check if the Character object is within the scene of the game, however it is overwritten in other classes, to explain
	 * why there is nothing within the class.
	 * 
	 * @return The boolean value true is returned. 
	 */
	public boolean inScene()
	{
		return true;
	}
	
	/**
	 * This method is used to check if two characters are in the same place by checking the positions, heights and widths of both objects
	 * determining whether or not they are in the same place. 
	 * 
	 * @param obj - This parameter represents another Character object which is being compared to another Character object to see if they
	 * are located in the same place. 
	 * @return Boolean true is returned if it is found that the two Characters are in the same place, false if otherwise.
	 */
	public boolean equals(Character obj)
	{
		Character other = obj;
		if(getX()+getWidth()>=other.getX()&&
			getX()<=other.getX()+other.getWidth() &&
			getY()+getHeight() >=other.getY() &&
			getY() <= other.getY()+other.getHeight())
		   return true;
		return false;
	}
	
}