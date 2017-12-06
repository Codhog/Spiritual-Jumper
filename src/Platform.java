import java.awt.*;
import java.applet.*;
import java.util.*;

/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * The Platform class is used to construct the Platform objects displayed within the class, the class Character is extended within this class
 * as the Platform class makes use of it in order to help create the Platform objects.
 */
public class Platform extends Character
{
   private int stepy;
   private int id,hv,vv,vcount;
   private boolean brownAnimation=false;
	
	// default constructor, sets all to zero
   /**
    * The Platform method is the default constructor of the Platform, all the values are set to zero to initialize the Platform.
    *  
    * @param id - The id parameter represents the identification of the Platform.
    * @param x - The x parameter represents the x-coordinate of the Platform.
    * @param y - The y parameter represents the y-coordinate of the Platform.
    * @param w - The w parameter represents the width of the Platform.
    * @param h - The h parameter represents the height of the Platform.
    */
	public Platform(int id, int x, int y, int w, int h)
	{
		super(id,x,y,w,h);
		
		int hv1 = (int) (Math.random()*2)+1;
		if(hv1==1)
			hv=-2;
		if(hv1==2)
			hv=2;
			
		int vv1 = (int) (Math.random()*2)+1;
		if(vv1==1)
			vv=-1;
		if(vv1==2)
			vv=1;
		
		
		vcount=0;
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
	 * This method acts as a getter, retrieving the vcount of the Monster. 
	 * 
	 * @return The vcount is returned. 
	 */
	public int getVcount()
	{
		return vcount;
	}
	
	/**
	 * This method acts as a setting, setting the vertical count to a value v.
	 * 
	 * @param v - This parameter represents the value which is being set to vcount.
	 */
	public void setVcount(int v)
	{
		vcount = v;
	}
	
	/**
	 * This method is used to retrieve the Brown Animation for the Brown Platform.
	 * 
	 * @return The Brown Animation is returned. 
	 */
	public boolean getBrownAnimation()
	{
		return brownAnimation;
	}
	
	/**
	 * This method is used to set the Brown Animation to some boolean value.
	 * 
	 * @param b - The paramater b is used to set the Brown Animation to True or False.
	 */
	public void setBrownAnimation(boolean b)
	{
		brownAnimation=b;
	}
	
	/**
	 * This method is used to set the hv (horizontal vector) to some value.
	 * 
	 * @param h2 - This parameter represents the horizontal value used to set hv.
	 */
	public void setHV(int h2)
	{
		hv = h2;
	}
	
	/**
	 * This method is used to retrieve the hv value.
	 * 
	 * @return The hv value is returned.
	 */
	public int getHV()
	{
		return hv;
	}
	
	/**
	 * This method is used to retrieve the vv value.
	 * 
	 * @return The vv value is returned.
	 */
	public int getVV()
	{
		return vv;
	}

	/**
	 * This method is used to set the vv (vertical vector) to some value.
	 * 
	 * @param v - This parameter represents the horizontal value used to set vv.
	 */
	public void setVV(int v)
	{
		vv =v;
	}
	
	/**
	 * This method is used to create a string representation of the x and y values of the Platform object.
	 * 
	 * @return A string containing the x and y values will be returned.
	 */
	public String toString()
	{
		return x + " " + y;
	}
	

	/**
	 * This method is used to move a platform.
	 */
	public void move()
	{
	
		changeY(stepy);
		
		stepy = 0;
		
	}
	
	/**
	 * This method is used to check if a platform is found to be within the display or not.
	 * 
	 * @return Boolean true is returned if the platform is in the scene, false if otherwise.
	 */
	public boolean inScene()
	{
		boolean scene = true;
		if(getX() > 600)
			scene = false;
		return scene;
	}


	
}