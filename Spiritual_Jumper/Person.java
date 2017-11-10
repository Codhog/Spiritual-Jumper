
/** 
 * @author Members of Group 25 - Gundeep Kanwal, Zihao Chen, Ruoyuan Liu
 * @author Creator of Original Source Code - Albert Haque
 *
 * This class is used to create a Person object which is used to store and display the highscores for the players of the game. 
 */
public class Person
{
	private String name;
	private int score;
	
	/**
	 * This method is used as a constructor to create a person object with a score.
	 */
	public Person()
	{
		name="";
		score=0;
	}
	
	/**
	 * This method is also used as a constructor but it includes parameters which are to be taken in from a user's input.
	 * 
	 * @param n - The parameter n is used to store the name of the person. 
	 * @param s - The parameter s is used to store the score of the person. 
	 */
	public Person(String n, int s)
	{
		name=n;
		score=s;
	}
	
	/**
	 * This method retrieves the name of the person.
	 * 
	 * @return This method returns the name of the person.
	 */
	public String getName()
	{
		return name;
	}
	
	/**
	 * This method retrieves the score of the person.
	 * 
	 * @return This method returns the score of the person.
	 */
	public int getScore()
	{
		return score;
	}
	
	/**
	 * This method is used to set the name of the Person object.
	 * 
	 * @param n - This parameter represents the name of the Person object.
	 */
	public void setName(String n)
	{
		name = n;
	}
	
	/**
	 * This method is used to set the score for the Person object.
	 * 
	 * @param s - This parameter represents the score for the Person object. 
	 */
	public void setScore(int s)
	{
		score=s;
	}
	
	/**
	 * This method is used to show a string representation of the name of the person, along with their score.
	 * 
	 * @return A string showing the name along with the score of a person is shown. 
	 */
	public String toString()
	{
		String te = name+" - "+score;
		return te;
	}
	
}