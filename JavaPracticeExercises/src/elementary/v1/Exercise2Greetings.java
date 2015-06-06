package elementary.v1;

import java.util.*;

public class Exercise2Greetings {
//	Write a program that asks the user for his name and greets him with his name.
	
	public static void main(String args[]){
		
		String userName;
		Scanner user_input = new Scanner(System.in);
		
		System.out.println("What is your name?");
		
		userName = user_input.next();
		
		System.out.println("Hello " + userName + "!");
		
	}
}
