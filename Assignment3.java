 /*AUTHOR: William Schuhmann
 * Title: Assignment 3
 * Description: Calculates discount price given age
 * Lab Date & Time: Mondays 3:05 PM - 3:55 PM
 * Date: 10/2/2018
 */

import java.util.Scanner;
import java.text.NumberFormat;
public class Assignment3 {
	public static void main(String[] args) {
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	Scanner scan = new Scanner(System.in);
	System.out.println("Please enter the cinema ticket price: ");
		double fullprice = scan.nextDouble();
		int age = (int) (Math.random()*((100-1)+1))+1;
	System.out.println("Your age: "+age);
	double newprice = 0;
		if (age < 5) {
			newprice = fullprice*0;
			System.out.println("Your ticket price is " + defaultFormat.format(newprice) + " which is free.");
		}else if (age >= 5 && age <= 12) {
			newprice = fullprice/2.0;
			System.out.println("Your ticket price is " + defaultFormat.format(newprice) + " which is half price.");
		}else if (age >= 13 && age <=54) {
			System.out.println("Your ticket price is " + defaultFormat.format(fullprice) + " which is full price.");
		}else if (age >= 55) {
			newprice = fullprice*0;
			System.out.println("Your ticket price is " + defaultFormat.format(newprice) + " which is free.");
			
/* Output Test
 * 
 * Please enter the cinema ticket price: 
 * 10
 * Your age: 57
 * Your ticket price is $0.00 which is free.

 * 			
 */
			
			
			
			

}
}
}