/*AUTHOR: William Schuhmann
 * Title: Assignment 2
 * Description: Change Maker
 * Lab Date & Time: Mondays 3:05 PM - 3:55 PM
 * Date: 9/27/2018
 * 
 * TEST CASES
 * 
 *Case 1 
 *88 cents in coins can be given as:
 *3 Quarters
 *1 Dimes
 *0 Nickels
 *3 Pennies
 *
 *Case 2
 *51 cents in coins can be given as:
 *2 Quarters
 *0 Dimes
 *0 Nickels
 *1 Pennies
 *
 *Case 3
 *17 cents in coins can be given as:
 *0 Quarters
 *1 Dimes
 *1 Nickels
 *2 Pennies
 *
 *Case 4
 *4 cents in coins can be given as:
 *0 Quarters
 *0 Dimes
 *0 Nickels
 *4 Pennies
 */

import java.util.Scanner;
public class Assignment2 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Welcome to ChangeMaker.");
	System.out.println("I will find a combination of coins that equals the amount of change you should recieve.");
	System.out.println("Please enter an amount from 1 to 99.");
		int totalCents = scan.nextInt();	//Modulus needed to determine remainder
		int quarters = totalCents/25;
		int remaining1 = totalCents%25;
		int dimes = remaining1/10;
		int remaining2 = remaining1%10;
		int nickels = remaining2/5;
		int remaining3 = remaining2%5;
		int pennies = remaining3;
	System.out.println(totalCents + " cents in coins can be given as:");	//results
		System.out.println(quarters + " Quarters");
		System.out.println(dimes + " Dimes");
		System.out.println(nickels + " Nickels");
		System.out.println(pennies + " Pennies");	
}
}