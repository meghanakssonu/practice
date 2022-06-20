package superkeyword;

class A
{
	void eat()
	{
		System.out.println("eating..");
	}
}

public class iSupermethod extends A {
	
	void sleep()
	{
		System.out.println("sleeping..");

	}
	void display() {
		super.eat();
		sleep();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		iSupermethod a=new iSupermethod();
       a.display();
	}

}
