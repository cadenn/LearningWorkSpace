package elementary.v1;
import java.util.*;

public class Exercise8PrimeNumbers {
//	Write a program that prints all prime numbers. 
//	(Note: if your programming language does not support arbitrary size numbers, 
//	printing all primes up to the largest number you can represent is fine too.)
//	http://www.factmonster.com/math/numbers/prime.html
	public static final int LARGENUMBER = 1000;

	public static boolean isPrime(int userNumber){
		int numDivisible = 0;
		for(int x = 2; x < userNumber; x++){
			if((userNumber % x) == 0){
				numDivisible++;
			}
		}
		if(numDivisible < 2){
			return true;
		}else{
			return false;
		}
	}
	
	public static void main(String args[]){
		int printCounter = 1;
		
		for(int y = 2; y <= LARGENUMBER; y++){
//			for(int x = 1; x <= LARGENUMBER; x++){
//			}
			if (isPrime(y) == true){
//				if((y % 5) == 0){
//					System.out.println("");
//				}
				if(printCounter == 5){
					System.out.println(y + "\t");
					printCounter = 0;
				}else
				System.out.print(y + "\t");
				printCounter++;
			};
		}
		
		
		
	}
}
