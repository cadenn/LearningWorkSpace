package elementary.v1;
import java.util.*;

public class Exercise6SumOrProductOfNumbers {
//	Write a program that asks the user for a number n and gives him the possibility to 
//	choose between computing the sum and computing the product of 1,�,n.
	
	int userNumber;
	int totalSum;
	int totalProduct;
	
	public Exercise6SumOrProductOfNumbers(){
		userNumber = 0;
	}
	
	public void setUserNumber(int userNumber){
		this.userNumber = userNumber;
	}
	
	public int getTotalProduct(){
		return totalProduct;
	}

	public int getTotalSum(){
		return totalSum;
	}
	
	public void calculateTotalSum(){
		totalSum = 0;
		for(int x = 1; x <= userNumber ; x++){
			totalSum += x;
		}
	}
	
	public void calculateTotalProduct(){
		totalProduct = 1;
		for(int x = 1 ; x <= userNumber ; x++){
			totalProduct *= x;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userNumber = 0;
		String userMethod = "";
		Exercise6SumOrProductOfNumbers object = new Exercise6SumOrProductOfNumbers();
		Scanner user_input = new Scanner(System.in);
		
		
		System.out.println("Please enter a number");
		userNumber = user_input.nextInt();
		object.setUserNumber(userNumber);
		
		System.out.println("Would you like to print the 'product' or 'sum'?");
		userMethod = user_input.next();
				
		
		if ("product".equals(userMethod)){
			object.calculateTotalProduct();
			System.out.println("The product from numbers 1 to " + userNumber + " is : " + object.getTotalProduct());
		}else if ("sum".equals(userMethod)){
//			Calculate sum
			object.calculateTotalSum();
			System.out.println("The sum from numbers 1 to " + userNumber + " is : " + object.getTotalSum());
		}else{
			System.out.println("Could not compute, proceeding to shut down program now. Have a nice day!" );
		}
		

}
}