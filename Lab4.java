/* AUTHOR: Will Schuhmann
 * FILENAME: Lab4.java
 * SPECIFICATION: Uses a switch to branch off program.
 * FOR: CSE 110 - Lab #4
 * TIME SPENT: 2 hours
 */
import java.util.Scanner;
public class Lab4 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int choice;
	do {
		System.out.println("Please choose your choice from the following menu:\r\n" + 
				"1) Calculate the sum of integers 1 to m.\r\n" + 
				"2) Calculate the factorial of given number.\r\n" + 
				"3) Display the 1st integer from left for a given number.\r\n" + 
				"4) Quit.");
		choice = scan.nextInt();
		int i = 1;
		switch(choice) {
		case 1:
			int m, sum = 0; //Initial value of sum is 0.
			System.out.println("Enter a number: ");
				m = scan.nextInt();
			while(i<=m) {
				sum = sum + i;
				i++;
			}
				System.out.println("The sum of the first " + m + " numbers is " + sum);
			break;
		case 2:
			int n, fact = 1; //Initial value of fact is 1.
			System.out.println("Enter a number: ");
				n = scan.nextInt();
			while (i <= n) {
				fact = fact*i;
				i++;
			}
			System.out.println("The factorial of " + n + " is " + fact);
			break;
		case 3:
			System.out.println("Enter a number: ");
			int num = scan.nextInt();
			int rem = 0;
			while (num !=0) {
				rem = num%10;
				num = num/10;
			}
			System.out.println("The first integer of given number from the left is " + rem);
			break;
		default:
			break;
		}
	}while(choice != 4);
		}
	
	}
	
	


