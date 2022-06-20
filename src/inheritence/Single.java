package inheritence;

class Employee{
	double e =10000;
}
class Bonus extends Employee{
	double d =1000;
}

public class Single {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bonus b=new Bonus();
		System.out.println(b.e);  

		   System.out.println(b.d);  

	}

}
