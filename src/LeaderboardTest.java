import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import org.junit.Before;
import org.junit.Test;

public class LeaderboardTest {
	ArrayList<Person> people;

	@Before
	public void setUp() throws Exception {
		
		people = new ArrayList<Person>();
				
		Person A = new Person("George",20);
		Person B = new Person("Stan",200);
		Person C = new Person("Larry",200);
		Person D = new Person("Mike",14);
		Person E = new Person("Adam",235235);
		Person F = new Person("Steven",0);
		
		people.add(A);
		people.add(B);
		people.add(C);
		people.add(D);
		people.add(E);
		people.add(F);

		
        // sort scores

        ArrayList sorted = new ArrayList<Person>();

        Person highest;
        Person current;

        while (people.size() > 0) {
            int lowidx = 0;
            highest = people.get(0);

            for (int i = 1; i < people.size(); i++) {
                current = people.get(i);

                if (current.getScore() > highest.getScore()) {
                    highest = current;
                    lowidx = i;
                }
            }

            sorted.add(highest);
            people.remove(lowidx);
        }

        people = sorted;
    }

	@Test
	public void test() throws Exception {
		setUp();

		for(int i = 0; i < people.size() - 1 ; i++){
			
			assert people.get(i).getScore() >= people.get(i + 1).getScore() ;
			
		}

		
	}

}
