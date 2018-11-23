/*AUTHOR: Will Schuhmann
 * FILENAME: Lab1.java
 * SPECIFICATION: Finds the average of three inputs.
 * FOR: CSE 110-Lab #1
 * TIME SPENT:1 hour
*/
import java.util.Scanner;
public class Lab1 {
	public static void main(String[] args) {	
		final int NUM_TESTS = 3;
		Scanner in = new Scanner (System.in);
		System.out.print("Enter the score of the first test: ");
			int test1 = in.nextInt(); 
			System.out.println("Your first test score:" + test1);
		System.out.print("Enter the score of the second test: ");
			int test2 = in.nextInt();
			System.out.println("Your second test score:" + test2);
		System.out.print("Enter the score of the third test: ");
			int test3 = in.nextInt();
			System.out.println("Your third test score:" + test3);
		double average = (test1 + test2 + test3) / (double)NUM_TESTS;
		System.out.println("Your average test score:" + average);
	}
}
