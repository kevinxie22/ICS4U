/**
 * S509/ICS4U1-11 ( Assignment 1.1 DiceRolls)
 * 
 * Create a DiceRolls application that displays five rolls of two 
 * dice where each die is numbered from 1 to 6. The application 
 * should also show the total of each roll. Your output should 
 * look like: (A/5)
 *
 *              Dice 1      Dice 2    Total
 *                5            6         11
 *                4            3          7
 *                2            1         3
 *                6            6         12
 *                3            6          9
 */

/**
 * @author Kevin Xie
 * Teacher  Mr. PC
 */

package Assigment;

public class DiceRolls {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Dice 1   Dice 2   Total");
		for(int n=1; n<=5; n++) {
			int die_1 = (int)(Math.random()*6) + 1;
			int die_2 = (int)(Math.random()*6) + 1;		
			System.out.format("  %d,       %d,       %d\n", die_1, die_2, die_1+die_2);
		}

	}

}
