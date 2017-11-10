import java.awt.*;
import java.applet.*;

/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * This class is used to create the Monster within the game, it extends from Character, using that class in order to aid with creating
 * the Monster within this class.
 */
public class Monster extends Character
{
   private int stepy;
   private int id;
   private int hv,vv;
   private int hcount,vcount;
	
	// default constructor, sets all to zero
   /**
    * This method is used as a constructor for the Monster, it creates the Monster and sets all the values to the default values of 0.
    * 
    * @param id - This parameter represents an identity for the Monster. 
    * @param x - This parameter represents the x position for the Monster. 
    * @param y - This parameter represents the y position for the Monster. 
    * @param w - This parameter represents the width for the Monster. 
    * @param h - This parameter represents the height for the Monster. 
    */
	public Monster(int id, int x, int y, int w, int h)
	{
		super(id,x,y,w,h);
		hv=1;
		vv=1;
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

	//returns the index number of the needed image from the ArrayList
	// at location 1 in ArrayList of images
	/**
	 * The show method is an abstract method used to return the index number of the needed image from the ArrayList.
	 * 
	 * @return The index number of the needed image from the ArrayList is returned.
	 */
	public int show()
	{
		return id;
	}
	
	/**
	 * This method is used to create a string showing the x and y position of the Monster.
	 * 
	 * @return A string representing the x and y position of the Monster is returned. 
	 */
	public String toString()
	{
		return x + " " + y;
	}
	

	/**
	 * The move method is used to move the Monster's x and y positions according to the hv and the vv which represents how much the 
	 * co-ordinates are being changed. 
	 */
	public void move()
	{
	
		changeY(vv);
		changeX(hv);
	}
	
	/**
	 * This method acts as a setter, setting how much the Monster is going to move in the x direction.
	 * 
	 * @param h - This represents the change in the x direction of the monster.
	 */
	public void setHV(int h)
	{
		hv=h;
	}
	
	/**
	 * This method acts as a setter, setting how much the Monster is going to move in the y direction.
	 * 
	 * @param v - This represents the change in the y direction of the monster.
	 */
	public void setVV(int v)
	{
		vv=v;
	}
	
	/**
	 * This method is used to retrieve how much the Monster is moving the y direction.
	 * 
	 * @return The amount of change in the y direction is returned. 
	 */
	public int getHV()
	{
		return hv;
	}
	
	/**
	 * This method is used to retrieve how much the Monster is moving the x direction.
	 * 
	 * @return The amount of change in the x direction is returned. 
	 */
	public int getVV()
	{
		return vv;
	}
	
	/**
	 * This method acts as a setting, setting the vertical count to a value v.
	 * 
	 * @param v - This parameter represents the value which is being set to vcount.
	 */
	public void setVcount(int v)
	{
		vcount=v;
	}	
	
	/**
	 * This method acts as a setting, setting the vertical count to a value h.
	 * 
	 * @param h - This parameter represents the value which is being set to vcount.
	 */
	public void setHcount(int h)
	{
		hcount=h;
	}
	
	/**
	 * This method acts as a getter, retrieving the vcount of the Monster. 
	 * 
	 * @return The vcount is returned. 
	 */
	public int getVcount()
	{
		return vcount;
	}
	
	/**
	 * This method acts as a getter, retrieving the hcount of the Monster. 
	 * 
	 * @return The hcount is returned. 
	 */
	public int getHcount()
	{
		return hcount;
	}
		
}