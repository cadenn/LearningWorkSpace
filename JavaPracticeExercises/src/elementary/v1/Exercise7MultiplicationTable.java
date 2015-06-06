package elementary.v1;

public class Exercise7MultiplicationTable {
//	Write a program that prints a multiplication table for numbers up to 12.

	public static void main(String args[]){
		int total = 0;
		String[][] arrayString = new String[13][13];
		
//		THIS IS CONFUSING 
		for(int y = 1; y <= 12; y++){
			for(int x = 1; x <= 12; x++){
				total = x * y;
				arrayString[x][y] = x + " + " + y + " = " + total;
				System.out.print(arrayString[x][y] + "\t");
			}
			System.out.println("");
		}	
		
	}
	
}
