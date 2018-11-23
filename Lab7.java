/*-------------------------------------------------------------------------
// AUTHOR: William Schuhmann
// FILENAME: Lab7.java and Builder.java
// SPECIFICATION: Makes a pyramid based on user input
// FOR: CSE 110- Lab #7
// TIME SPENT: 5 hrs
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab7
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		Builder myBuilder = new Builder(null);
		System.out.println("The name of builder is: " + Builder.getName());
		System.out.println("Enter a positive integer:");
			int n = scan.nextInt();
			String s = "*";
			String e = "=";
			Builder.makeRow(n, s, e);
			
		System.out.println("\nEnter a positive odd integer, \nrepresenting number of stars in the base of a pyramid :");
			int t = scan.nextInt();
			Builder.makePyramid(t, s);
	}
}