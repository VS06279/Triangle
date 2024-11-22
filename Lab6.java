//Vikrant Suryadevara
import java.util.Scanner;
public class Lab6 {
 
	public static void main(String[] args) {
		Scanner key = new Scanner(System.in);
		
		System.out.println("Enter the height of the triangle:");
		int height = key.nextInt();
		// The if function checks to make sure that no invalid values are entered
		// In this case, the invalid values are one below 0.
		if(height <=0) {
			System.out.println("Invalid value entered!");
		}
		//Ascending loop
		
		for(int i=1; i<=height; i++) {
			//the reason why there is a println here with no text is so that each * is put on a new line instead of the same line.
			//this will allow the triangle to be increase/decrease properly.
			System.out.println();
			//as long as j is less than i (and as long as i is less than the user input), it will print a *. 
			for(int j=0; j < i; j++) {
				System.out.print("*");
			}
			
		}
		//Descending loop
		//k is equal to height -1 since we have to go down and not up
	
		
		System.out.println();
		System.out.println("End of program!");
	}
	}
