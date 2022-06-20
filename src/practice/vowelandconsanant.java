package practice;

public class vowelandconsanant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a='d';
		if(a=='a'||a=='e'||a=='i'||a=='o'||a=='u')
		{
			System.out.println("vowel");
		}
		else
			System.out.println("consonant");

		char e='a';
		switch(e)
		{
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("vowel");
break;
default:
System.out.println("consonant");
break;
			
		
		}
	}

}
