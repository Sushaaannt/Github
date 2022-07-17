package Practice;

import java.util.Scanner;

public class example1_Accept_Input_From_User {
	
	public static void main(String[] args) {
		
		System.out.println("Welcome");
		
		Scanner scan=new Scanner(System.in);
		String s1 = scan.next();             //accept string inputs from user
		String a = "sushant";
		System.out.println(s1.length());
		System.out.println(a.length());

	    System.out.print("enter num1: ");   //accept int input from user
	    int num1 = scan.nextInt();
	
		System.out.print("enter num2: ");
		int num2 = scan.nextInt();
	
		System.out.println(num1+num2);

		
	}

}
