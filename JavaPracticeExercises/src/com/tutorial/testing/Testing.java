package com.tutorial.testing;

import java.util.*;

public class Testing {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String usersName = "";
		
		Scanner user_input = new Scanner (System.in);
		System.out.println("Please enter your name?");
		
		usersName = user_input.next();
		
		System.out.println("Hello + " + usersName + "!");
	}

}
