package practice;

import java.util.Scanner;

public class quotientandreminder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int divident;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the a number");
		divident=sc.nextInt();
	   int divisor;
	   System.out.println("enter the b number");
	   divisor=sc.nextInt();
	   
	   int quotient=divident/divisor;
	   int reminder=divident%divisor;
	   
	   System.out.println(quotient);
	   System.out.println(reminder);


	   

	}

}
