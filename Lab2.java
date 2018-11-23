/*AUTHOR: Will Schuhmann
 * FILENAME: Lab2.java
 * SPECIFICATION: Prints capitalized input and counts characters
 * FOR: CSE 110-Lab #2
 * TIME SPENT:1 hour
*/
import java.util.Scanner;
public class Lab2 {
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		System.out.print("Enter your first name:");
			String FirstName = input.next();
		System.out.print("Enter your last name:");
			String LastName = input.next();
		String FullName = FirstName + " " + LastName;
		System.out.println("Full Name (in capitals): " + FullName.toUpperCase());
			int NameLength = (FullName.length() - 1);
		System.out.println("Length of full name: " + NameLength);
//Second Part
		String Title1 = new String ("CSE110");
		String Title2 = "CSE110";
		if (Title1 == Title2) {
			System.out.println("String comparison using "+"=="+" sign works");
		}else {
			System.out.println("String comparison using "+"=="+" sign does NOT work");
		if  (Title1.equals(Title2)){ 
			System.out.println("String comparison using "+"equals"+" method works" );
		}else {
			System.out.println( "String comparison using "+"equals"+" method does NOT work");
		
	}	
			
}
}
}