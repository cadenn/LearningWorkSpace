package elementary.v1;
import java.util.*;

public class Exercise3GreeingsAliceBob {
//	Modify the previous program such that only the users Annie and Bob are greeted with their names.
	
//  WORK IN PROGRESS
	
	private static final String ANNIE = "Annie";
	private static final String BOB = "Bob";
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userName = "";
		Scanner user_input = new Scanner(System.in);
		boolean checkName = false;

		while(checkName == false){
			System.out.println("What is your name?");
			userName = user_input.next();
			if("Annie".equals(userName) || "Bob".equals(userName)){
				checkName = true;
//				System.out.println("True");
			}
		}
		System.out.println("Hello " + userName + "!");
		
	}

}
