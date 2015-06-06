package elementary.v2;

import java.util.*;

public class Exercise2Greetingsv2 {
//	Write a program that asks the user for his name and greets him with his name.

	static String userName = "";
	
	
	public static void setName(String userName){
//		Cannot use "this" with the below because it is static.
//		To specify the variable in the class you need to follow the scheme below.
		Exercise2Greetingsv2.userName = userName;
	}
	
	public static void printName(){
		System.out.println("Hello " + userName + "!");
	}
	
	public static void main(String args[]){
		
		Scanner user_input = new Scanner(System.in);

		System.out.print("Please enter your name: ");

		setName(user_input.next());
		
		printName();
		
	}
}
