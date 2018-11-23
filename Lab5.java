/* AUTHOR: Will Schuhmann
 * FILENAME: Lab5.java
 * SPECIFICATION: Displays numbers between two number and prints a pyramid 
 * FOR: CSE 110 - Lab #5
 * TIME SPENT:2 hours
 */
import java.util.Scanner;
public class Lab5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	int choice;
	do {
		System.out.printf("%nPlease choose your choice from following menu:"
				+ "%n1) Print through all integer numbers between two given integers.  "
				+ "%n2) Display a pattern – right triangle of stars."
				+ "%n3) Quit." );
		choice = scan.nextInt();
		switch(choice) {
			case 1: 
				int i;
				int start=0, end=0;
				System.out.println("Enter the first number: ");
					start = scan.nextInt();
				System.out.println("Enter the second number: ");
					end = scan.nextInt();
				for(i = start; i <= end; i++) {
				System.out.print(i+" ");
				};
				break;
			case 2:
				int j;
				System.out.println("Enter the triangle height: ");
				int height = scan.nextInt();
				for(i = 1; i <=	height; i++){
					for(j = 1; j <=	i; j++){	
						System.out.print("*");
					}
					System.out.print('\n');
				}
				break;
			default:
				break;
		}
	}while (choice != 3);	
}}
