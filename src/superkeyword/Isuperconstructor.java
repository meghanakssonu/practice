package superkeyword;

class Animal{  
Animal(){System.out.println("animal is created");}  
}

class Dog extends Animal{  
Dog(){  
	super();
System.out.println("dog is created");  
}
}  
public class Isuperconstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d=new Dog();
		

	}

}
