/**
 * S509/ICS4U1-11 ( Unit 1 - CountVowels)
 * 
 * Create a CountVowels application that prompts the user for a string
 * and then displays a count of the number of vowels in the string. 
 * Application output should look similar to: (T/5)
 * 
 *         Enter text : Java is amazing.
 *         Number of vowels in Java is amazing is 6.
 */


/**
 * @author Kevin Xie
 * Teacher  Mr. PC
 */

package Assigment;

import java.util.Scanner;

public class CountVowels {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter a sentence: ");
		String str = scan.nextLine();
	
		for (int i=0 ; i<str.length(); i++){
			char ch = str.charAt(i);
			if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'){
				count ++;
			}
		}
	   System.out.println("Number of vowels in " + "\"" + str + "\"" + " is " + count);
	   scan.close();

	}

}
