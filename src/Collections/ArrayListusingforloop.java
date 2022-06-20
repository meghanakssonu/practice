package Collections;

import java.util.ArrayList;

public class ArrayListusingforloop {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=10;
ArrayList<String> al=new ArrayList<String>();

al.add(0,"apple");
al.add(1,"mango");
al.add(2,"garpe");
al.add(0,"apple");
al.add(4,"gauva");
al.add(null);
al.add(3,"jackfruit");

for(int i=0;i<al.size();i++)
{
	String result=al.get(i);
	
	System.out.println(result);
}

System.out.println(a);
	}

}
