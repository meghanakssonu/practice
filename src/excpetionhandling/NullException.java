package excpetionhandling;

public class NullException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			String s=null;
			System.out.println(s.length());
		}
		catch(NullPointerException e)
		{
			System.out.println(e);
		}
		System.out.println("remainingcodeexecution");

	}

}
