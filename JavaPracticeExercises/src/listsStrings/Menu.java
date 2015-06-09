package listsStrings;

import java.util.*;

public class Menu {


	ArrayList<Integer> numList = new ArrayList<Integer>();
	
	public static void main(String args[]){
		
		Scanner user_input = new Scanner(System.in);
		boolean runningProgram = true;
		int menuSelection = 0;
		
//		while(runningProgram == true){
			System.out.println("Lists of Exercises: \nExercise 1: Return Largest in List \n\nPlease select which exercise you wish to run: ");
			menuSelection = user_input.nextInt();
			if (menuSelection == 1){
				listsStrings.Exercise1LargestInString.main();
			}
//		}
		
		
	}
	
	
}
