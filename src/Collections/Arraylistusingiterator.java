package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Arraylistusingiterator {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
ArrayList<String> al=new ArrayList<String>();

al.add(0,"apple");
al.add(1,"mango");
al.add(2,"garpe");
al.add(0,"apple");
al.add(4,"gauva");
al.add(null);
al.add(3,"jackfruit");

Iterator itr=al.iterator();

while(itr.hasNext())
{
	Object result=itr.next();
	System.out.println(result);
}
	}

}
