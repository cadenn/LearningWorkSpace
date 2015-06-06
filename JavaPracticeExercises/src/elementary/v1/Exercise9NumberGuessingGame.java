package elementary.v1;
import java.util.*;

public class Exercise9NumberGuessingGame {

	static int chosenNumber = 0;
	static int min = 1;
	
	public static int randInt(int max) {

	    // Usually this can be a field rather than a method variable
	    Random rand = new Random();

	    // nextInt is normally exclusive of the top value,
	    // so add 1 to make it inclusive
	    int randomNum = rand.nextInt((max - min) + 1) + min;

	    return randomNum;
	}
	
	public boolean checkGuess(int userGuess){
		if(chosenNumber == userGuess){
			return true;
		}else{
			return false;
		}
		
	}
	
	public String hint(int userGuess){
		if(userGuess < chosenNumber){
			return "The number you have chosen is too low. Please try again.";
		}else{
			return "The number you have chosen is too high Please try again.";
		}
	}
	
	//WORK IN PROGRESS
//	public int difficultySelector(String userDifficulty){
//		if(userDifficulty.equals("Easy")){
//			
//		}
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int userGuess =0;
		int userMin = 0;
		int userMax = 0;
		boolean isCorrect = false;
		
//		System.out.println("Let's play a number guessing game! Here are the instructions:");
//		System.out.println("A number will be chosen at random to which you will have to guess this number.");
//		System.out.println("After each wrong guess that you make, you will be informed on how far off you are from the chosen number");
//
//		System.out.println("\nThere are 3 difficulties; 'Easy', 'Intermediate', and 'Hard'.");
//		System.out.println("Depending on which difficulty you choose will determine the max number for the game.");
//		System.out.println("Additionally if you guess the same number consecutively it will not be counted");
		
		Scanner user_input = new Scanner(System.in);
		
		Exercise9NumberGuessingGame object = new Exercise9NumberGuessingGame();
		
		chosenNumber = object.randInt(3);
		
		while(isCorrect == false){
			System.out.println("Please enter your guess: ");
			userGuess = user_input.nextInt();
			if (object.checkGuess(userGuess) == true){
				break;
			}else{
				System.out.println(object.hint(userGuess));
			}
			
		}
		System.out.println("Congratulations! You win!");
//		Runtime.getRuntime().exec("cls");
		
	}

}
