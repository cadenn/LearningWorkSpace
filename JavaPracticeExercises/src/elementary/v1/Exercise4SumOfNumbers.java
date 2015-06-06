package elementary.v1;
import java.util.*;

public class Exercise4SumOfNumbers {
//	Write a program that asks the user for a number n and prints the sum of the numbers 1 to n
	int userNumber;
	int totalSum;
	
	public Exercise4SumOfNumbers(){
		userNumber = 0;
		totalSum = 0;
	}
	
	public void setUserNumber(int userNumber){
		this.userNumber = userNumber;
	}
	
	public void calculateSum(){
		totalSum = 0;
		for(int x = 0 ; x <= userNumber ; x++){
			totalSum += x;
		}
		
	}
	public int getTotalSum(){
		return totalSum;
	}
	
	public static void main(String args[]){
	
	String userInput = "";
	int userNumber = 0;
	Scanner user_input = new Scanner(System.in);
	Exercise4SumOfNumbers object = new Exercise4SumOfNumbers();
	
	System.out.println("Please enter a number");
	userNumber = user_input.nextInt();
	
	object.setUserNumber(userNumber);
	object.calculateSum();
	
	System.out.println("The sum of the numbers 1 to " + userNumber + " is: " + object.getTotalSum());
	
	}
	
}
