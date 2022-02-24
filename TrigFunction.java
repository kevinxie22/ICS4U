/**
 * S509/ICS4U1-11 ( Assignment 1.1 TrigFunction)
 * 
 * Create a TrigFunctions application that prompts the user 
 * for an angle in degrees and then displays the sine, cosine, 
 * and tangent of the angle.  
 */

/**
 * @author Kevin Xie
 * Teacher  Mr. PC
 */

package Assigment;
import java.util.Scanner;

public class TrigFunction {

	public static void main(String[] args) {

		Scanner myScanner = new Scanner(System.in);
		System.out.print("Please input angle: ");
		
		 while(myScanner.hasNext()) {
			// check if the input is valid
			if(myScanner.hasNextDouble()) {
				double angle = myScanner.nextDouble();
				System.out.println("sin(" + angle + ")=" + Math.sin(Math.toRadians(angle)));
				System.out.println("cos(" + angle + ")=" + Math.cos(Math.toRadians(angle)));
				System.out.println("tangent(" + angle + ")=" +Math.tan(Math.toRadians(angle)) + "\n");
			}
			else {
				System.out.println("\nValid input, Angle must be an number!\n");
				myScanner.next();
			}
			System.out.println("Please input angle: " );
			
		} 
		
	    myScanner.close();
	}

}
