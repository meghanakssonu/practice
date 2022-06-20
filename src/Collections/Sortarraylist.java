package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Sortarraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();

		al.add("apple");
		al.add("oooo");
		al.add("mango");
		al.add("garpe");
		al.add("apple");
		al.add("gauva");
		al.add("jackfruit");
		
		Collections.sort(al);
		
		for(String fruit:al)
		{
			System.out.println(fruit);
		}

	}

}
