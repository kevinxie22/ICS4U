/**
 * S509/ICS4U1-11 ( Federal Tax 2020)
 * 
 * write code for an 'IncomeTax' application to calculate income tax for the year 2020.  
 * e.g
 * What is your taxable income?
 * 200000
 * Which province do you live in(1 for Alberta, 2 for BC and 3 for Ontario)?
 * 3
 * Your federal tax rate 29%
 * Your Ontario province tax rate is 12.16%.
 * Your federal income falls under tax bracket 150473-214368
 * Your total tax for the year 2020 is: $64732.40
 */

/**
 * @author Kevin Xie
 * Teacher  Mr. PC
 */

package Assigment;

import java.util.Scanner;

public class IncomeTax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("What is your taxable income?");
		double income = scan.nextDouble();
		System.out.println("Which province do you live in(1 for Alberta, 2 for BC and 3 for Ontario)?");
		int provinceID = scan.nextInt();
		String province = "n/a";
		double incomeTax = 0;
		double federalTax = 0;
		double provintialTax = 0;
		
		federalTax = getFederalTax(income);
		System.out.format("Your federal tax rate %.1f %% %n", (federalTax/income)*100);
		
		switch(provinceID) {
			case 1: {
				provintialTax = getAlbertaTax(income);
				province = "Alberta";
				break;
			}
			case 2: {
				provintialTax = getBCTax(income);
				province = "BC";
				break;
			}
			case 3: {
				provintialTax = getOntarioTax(income);
				province = "Ontario";
				break;
			}
			
			
		}
		System.out.format("Your " + province + " provincial tax rate is %.1f %% %n", (provintialTax/income)*100);
		incomeTax = federalTax + provintialTax;
		System.out.format("Your total tax for the year 2020 is: $%.2f", incomeTax);
		
		scan.close();
	}

	private static double getFederalTax(double income) {
		/* 15% on the first $48,535 of taxable income, and
		20.5% on the portion of taxable income over $48,535 up to $97,069 and
		26% on the portion of taxable income over $97,069 up to $150,473 and
		29% on the portion of taxable income over $150,473 up to $214,368 and
		33% of taxable income over $214,368 */
		if (income < 48535) {
			System.out.println("Your federal income falls under tax bracket 48535");
			return 0.15*income;
		}
		else if (income < 97069) {
			System.out.println("Your federal income falls under tax bracket 48535-97069");
			return 0.205*(income-48535)+ 0.15*48535;
		}
		else if (income < 150473) {
			 System.out.println("Your federal income falls under tax bracket 97069-150473");
			 return 0.26*(income-97069)+0.205*(97069-48535)+ 0.15*48535;
		}
		else if (income < 214368) {
			System.out.println("Your federal income falls under tax bracket 150473-214368");
			return 0.29*(income-150473) +  0.26*(150473-97069)+0.205*(97069-48535)+ 0.15*48535;
		}
		else {
			System.out.println("Your federal income falls under tax bracket over 214368");
			return 0.33*(income-214368) + 0.29*(214368-150473) +  0.26*(150473-97069)+0.205*(97069-48535)+ 0.15*48535;
		}
	}

	private static double getOntarioTax(double income) {
		/*	Ontario 
		5.05% on the first $43,906 of taxable income
		9.15% on the next $43,906-$87,813
		11.16% on the next $87,813-$150,000
		12.16% on the next $150,000-$220,000
		13.16 % on the amount over $220,000  */	
		if (income < 43906)
			return 0.0505*income;
		else if (income < 87813)
			return 0.0915*(income-43906)+ 0.0505*43906;
		else if (income < 150000)
			 return 0.1116*(income-87813)+0.0915*(87813-43906)+ 0.0505*43906;
		else if (income < 220000)
			return 0.1216*(income-150000) + 0.1116*(150000-87813)+0.0915*(87813-43906)+ 0.0505*43906;
		else
			return 0.1316*(income-220000) + 0.1216*(220000-150000) + 0.1116*(150000-87813)+0.0915*(87813-43906)+ 0.0505*43906;
	}

	private static double getAlbertaTax(double income) {
		/*Alberta           
		10% on the first $131,200
		12% on the next $131,200-$157,464
		13% on the next $157,464-$209,252
		14% on the next $209,252-$314,928
		15% on the amount over $314,928 */
		if (income < 131200)
			return 0.1*income;
		else if (income < 157464)
			return 0.12*(income-131200)+ 0.1*131200;
		else if (income < 209252)
			 return 0.13*(income-87813)+0.12*(209252-131200)+ 0.1*131200;
		else if (income < 314928)
			return 0.14*(income-150000) + 0.13*(209252-87813)+0.12*(209252-131200)+ 0.1*131200;
		else
			return 0.15*(income-220000) + 0.14*(314928-150000) + 0.13*(209252-87813)+0.12*(209252-131200)+ 0.1*131200;
	}

	private static double getBCTax(double income) {
		/* British Columbia
		5.06% on the first $40,707 of taxable income
		7.7% on the next $40,707-$81,416
		10.5% on the next $81,416-$93,476
		12.29% on the next $93,476-$113,503
		14.7% on the next $113,503-$153,900
		16.8% on the amount over $153,900 */
		
		if (income < 40707)
			return 0.0506*income;
		else if (income < 81416)
			return 0.077*(income-40707)+ 0.0506*40707;
		else if (income < 93476)
			 return 0.105*(income-81416)+0.077*(81416-40707)+ 0.0506*40707;
		else if (income < 113503)
			return 0.1229*(income-93476) + 0.105*(93476-81416)+0.077*(81416-40707)+ 0.0506*40707;
		else if (income < 153900)
			return 0.147*(income-113503) + 0.1229*(113503-93476) + 0.105*(93476-81416)+0.077*(81416-40707)+ 0.0506*40707;
		else
			return 0.168*(income-153900) + 0.147*(153900-113503) + 0.1229*(113503-93476) + 0.105*(93476-81416)+0.077*(81416-40707)+ 0.0506*40707;
	}

}
