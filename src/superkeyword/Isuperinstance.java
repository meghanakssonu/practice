package superkeyword;
class B
{
	String n="meghana";
}

public class Isuperinstance extends B {
	
	String f="darshu";
	
	void display()
	{
		System.out.println(super.n);
		System.out.println(f);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Isuperinstance is=new Isuperinstance();
		is.display();
	}

}
