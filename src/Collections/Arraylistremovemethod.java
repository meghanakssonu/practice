package Collections;

import java.util.ArrayList;

public class Arraylistremovemethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> al=new ArrayList<String>();

		al.add("apple");
		al.add(0,"oooo");
		al.add("mango");
		al.add("garpe");
		al.add("apple");
		al.add("gauva");
		al.add("jackfruit");
		System.out.println(al);
		al.remove("apple");
		al.remove(0);
		for(String result:al)
		{
			System.out.println(result);
		}
	}

}
