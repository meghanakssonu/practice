
public class Classthiskeyword {
	void m()
	{
		System.out.println("hello m");
	}
	void n()
	{
		System.out.println("hello n");
		this.m();

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Classthiskeyword ct=new Classthiskeyword();
		ct.n();

	}

}
