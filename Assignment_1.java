/* AUTHOR: William Schuhmann
 * Title: Assignment 1
 * Description: Converts height from feet and inches into metric system
 * Lab Date & Time: Mondays 3:05 PM - 3:55 PM
 * Date: 9/3/2018
 * 
 * Written Exercises
 * 1.) 2
 * 2a.) 10
 * 2b.) 1
 * 2c.) 27
 * 2d.) 27.5
 * 2e.) 27
 * 2f.) 28
 * 3.)Scanner input = new Scanner (System.in);
 *    System.out.print("Enter your full name:");
 *    String name = input.nextInt();
 *    System.out.println("Your full name is: " + name);
 */	  
import java.util.Scanner;
public class Assignment_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your Name:");
			String name = input.next();
		System.out.printf("Enter your height below.%nFeet:");
			int hfeet = input.nextInt();
		System.out.print("Inches:");
			int hinch = input.nextInt();
		int htotal = (hfeet*12)+hinch; //Converts height in feet to height in inches and then adds the already given height in inches
		double hmeter = htotal*2.54/100; //Converts height in inches to height in meters
		System.out.printf(name + ", your height in meters is: %.2f", hmeter);
	}
}

