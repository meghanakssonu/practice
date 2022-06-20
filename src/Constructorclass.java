
public class Constructorclass {
	Constructorclass()
	{
		System.out.println("print a");
	}
	Constructorclass(int x)
	{
		this();
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Constructorclass cc=new Constructorclass(10);
	}

}
