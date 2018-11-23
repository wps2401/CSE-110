/*-------------------------------------------------------------------------
// AUTHOR: Will Schuhmann
// FILENAME: Lab10.java
// SPECIFICATION:
// FOR: CSE 110- Lab #10
// TIME SPENT: how long it took you to complete the assignment
//----------------------------------------------------------------------*/

import java.util.Scanner;
import java.util.Arrays;


public class Lab10 {
	public static void main(String[] args) {
		
		// An integer for the array size.
		// -->
		int arraySize;
		// A double for the exchange element.
		// -->
		double exchangeElement;
		// A scanner object for requesting input from System.in.
		// -->
		Scanner scan = new Scanner(System.in);
		
		// Request Array Size from the User
		
		// Print this message "How many elements in the array?"
		// -->
		System.out.println("How many elements in the array?");
		// Request an integer from the user using the Scanner object
		// and store the inputted value in the integer declared above.
		// -->
		arraySize=scan.nextInt();
		
		// Declare the Array
		
		// Declare a new array of size equal to the size requested in
		// Step 3.
		// -->
		
		// integer array of a fixed size.
		int [] array = new int [arraySize];
		
		//Fill in the Array
		
		for(int i = 0; i < arraySize; i++) {
			
		
			// Display the message: "Please enter the next value."
			// -->
			System.out.println("Please enter the next value");
			// Request the next element (double) from the user using
			// the Scanner object declared in Step 2.
			// -->
			exchangeElement=scan.nextDouble();
			// Store this element at the ith position of the array
			// created in Step 4.
			// -->
			exchangeElement=i;
			}
		
		
		// Sort the Array's Elements
		
		
		
		//The first loop for choosing each element of the array
		int i2;
		For (i2=0, i2<arraySize, i2++){
			
			// The second loop to compare elements
			// this loop start from i+1
			int j2;
			For (j2 = i2+1, j2<arraySize, j2++){
				
				//comparing
				
				If ( array[i2]> array[j2]){
				
					//exchange
					exchangeElement= array[i2];
					array[i2]=array[j2];
					array[j2]=(int) exchangeElement;
					
				}//end of if
			}//end of the second loop
			//we find the correct place of one element in the array
		}//end of the first loop
		//we find the correct place of all elements after finishing the first loop
		
		
		// Display the Array
		
		
		
		// Print the following message to the user, preceded by a
		// newline character.
		
		// "The array's elements after sorting :"
		// -->
		// use a for loop
		For (int k=0; K<number of elements;k++)
			//print the elements
			System.out.print(array[k]+ ", ")
		//end of for
		// newline character.
	    
	    
		
		
		
		// Remove the minimum
		
		
		int i;
		For (i=0,i<array.length-1,i++){
			array[i]=array[i+1];
			}
			
		//put zero in the last element
		array [array.length-1] =0;
		
		
		
		
		// Display the Array after removing the first element
		
		
		// Print the following message to the user, preceded by a
		// newline character.
		
		// "The array's elements after left shift :"
		
		// -->
		System.out.print("\nThe array's elements after left shift");
		// use a for loop
		For (int k = 0; k < arraySize;k++;){
			System.out.print(array[k]+ ", ");
		}
			//print the elements
		//end of for
		// newline character. 
		
		
		
		
		// Search for an element and remove it
		
		
		System.out.println("Enter The Element to Search in the Array");
		double search_element = scan.nextDouble();
		int element_found_flag = 0.
		
		For (i=0;i<array.length-1;i++){
		
			If (array[i]==search_element){
			element_found_flag=1;
			}
			If (element_found_flag==1){
			array[i]=array[i+1]
			}	
		}
		array [array.length-1] =0;
		
		 
		
		//Display the Final Array
		
		
		
		// use a for loop
		
		For (int k=0; k<arraySize;k++)
			//print the elements
			System.out.print(array[k]+ ", ")
		//end of for
		
		// newline character.
		
		
	}

	private static void If(boolean b) {
		// TODO Auto-generated method stub
		
	}

	private static void For(int i, boolean b, int j) {
		// TODO Auto-generated method stub
		
	}

	private static void For(Class<Integer> class1) {
		// TODO Auto-generated method stub
		
	}
}