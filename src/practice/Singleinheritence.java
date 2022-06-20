package practice;

class Animal{
	int a;
	void color(int a)
	{
		System.out.println(a+"  "+"blue");
	}
	
}

class Dog extends Animal{
	int b;
	void sound(int b)
	{
		
		System.out.println(b+" "+"bark");
	}
	
}

public class Singleinheritence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dog d=new Dog();
		
		d.sound(5);
		d.color(10);
		
		

	}

}
