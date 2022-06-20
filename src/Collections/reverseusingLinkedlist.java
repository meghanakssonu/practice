package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class reverseusingLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>  al= new LinkedList<String>();
		al.add("apple");
		al.add(0,"oooo");
		al.add("mango");
		Iterator itr=al.descendingIterator();
		while(itr.hasNext())
		{
			Object result=itr.next();
			System.out.println(result);
		}

	}

}
