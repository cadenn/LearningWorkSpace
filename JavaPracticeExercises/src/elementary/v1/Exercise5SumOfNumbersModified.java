package elementary.v1;

import java.util.Scanner;


public class Exercise5SumOfNumbersModified extends Exercise4SumOfNumbers{
//	Modify the previous program such that only multiples of three or five are considered in the sum, e.g. 3, 5, 6, 9, 10, 12, 15 for n=17
	public void calculateSum(){
		totalSum = 0;
		for(int x = 0; x <= userNumber; x++){
			if ((x % 3) == 0 || (x % 5) == 0){
				totalSum += x;
			}
		}
	}
	
	public static void main(String args[]){
		
		String userInput = "";
		int userNumber = 0;
		Scanner user_input = new Scanner(System.in);
		Exercise5SumOfNumbersModified object = new Exercise5SumOfNumbersModified();
		
		System.out.println("Please enter a number");
		userNumber = user_input.nextInt();
		
		object.setUserNumber(userNumber);
		object.calculateSum();
		
		System.out.println("The sum of the numbers 1 to " + userNumber + " is: " + object.getTotalSum());
		
		}
		

}
