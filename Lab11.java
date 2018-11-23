
/*-------------------------------------------------------------------------
// AUTHOR: Will Schuhmann
// FILENAME: Lab11.java
// SPECIFICATION: Displays 2 dimensional array information
// FOR: CSE 110- Lab #11
// TIME SPENT: 35 mins
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Arrays;
//Lab11 is the name of the class that contains the main function:
public class Lab11 {
	public static void main(String[] args) {

		// Declaring Variables:

		// A scanner object for requesting input from the user
		// -->
		Scanner scan = new Scanner(System.in);
		// An integer for the number of rows.
		// -->
		int numRows;
		// An integer for the number of columns.
		// -->
		int numColumns;
		//an integer for sum of each row's elements
		//-->
		int sum;

		// Request Array Size from the User

		// Print this message "Enter the number of rows in the array"
		// -->
		System.out.println("Enter the number of rows in the array");
		numRows=scan.nextInt();
		// Print this message "Enter the number of columns in the array
		// -->
		System.out.println("Enter the number of columns in the array");
		numColumns=scan.nextInt();
		// Use the scanner to store the values entered by the user
		// in the integers declared above.
		// -->

		// Declare the Array

		// Declare a 2D integer array using the number of rows and columns previously entered by the user
		// -->
		// Remember, we declare a 2D integer array by using
		// the following statement
		int[][] intArray = new int[numRows][numColumns];

		// Fill in the Array

		for (int i = 0; i < numRows; i++){
			for (int j = 0; j < numColumns; j++){

				// Display the message: "Please enter a value."
				// -->
				System.out.println("Please enter a value");
				// Store the value entered by the user at the (ith, jth) position of the 2D array created in Step 4.
				// -->
				intArray[i][j] = scan.nextInt();
			}
		}

		// Display the Array's Elements

		for (int i= 0; i < numRows; i++){
			for (int j= 0; j < numColumns; j++)
			{
				System.out.print(intArray[i][j]+" ");
				// --> printed with a space between each element and a new line for each ith row
				// Remember the outer for loop walks through the rows
				//while the inner for loop walks through the elements of //the rows
			}//end the second for
			System.out.print("\n");
		}

		// finding sum of each row and display
		
		// the first loop
		
		for (int i=0; i<numRows;i++){
			
			sum=0;
			
			//the second for loop
			
			for (int j=0; j<numColumns; j++){
				sum=sum+intArray[i][j];
				}//end of second for

			//print sum : ("sum of row"+i+ " "+ sum);
			System.out.println("Sum of row "+i+" "+sum);

		}//end of first for loop

	} // Close the main function.
} // Close the Lab11 class.