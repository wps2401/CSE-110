/*-------------------------------------------------------------------------
// AUTHOR: Will Schuhmann
// FILENAME: Lab8.java and Student.java
// SPECIFICATION: Prints out student info
// FOR: CSE 110- Lab #8
// TIME SPENT: 2 hours
//-----------------------------------------------------------*/

import java.util.Scanner;

public class Lab8
{
	public static void main(String[] args)
	{
		String firstName;
		String lastName;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Name: ");
		firstName=scan.next();
		System.out.println("Enter Last Name: ");
		lastName=scan.next();
		Student Student1 = new Student(firstName,lastName);
		System.out.println("\n"+"FIRST STUDENT INFORMATION \n");
		System.out.println("The name of student is: " + Student1.getFullName() + "\n" + "Major is: " + Student1.getMajor() + "\n" + "The student’s number of points is " + Student1.getGradePoints() + "\n" + "Number of earned credits is " + Student1.getCredits());
		
		//prompt the user for second student inputs
		String studentMajor;
		int studentCredits;
		int studentGradePoints;
		System.out.println("\n"+"Enter First Name: ");
		firstName=scan.next();
		System.out.println("Enter Last Name: ");
		lastName=scan.next();
		System.out.println("Enter Major: ");
		studentMajor=scan.next();
		System.out.println("Enter Grade Points: ");
		studentGradePoints=scan.nextInt();
		System.out.println("Enter Total Credits: ");
		studentCredits=scan.nextInt();
		Student Student2 = new Student(studentMajor,studentCredits,studentGradePoints,firstName,lastName);
		
		// studentCredits, studentGradePoints, firstName and lastName.
		//-->
		// store the input in the declared variables
		//-->
		//use the constructor with arguments
		//to create a brand-new object Student
		//called Student2 using the variable
		//values provided by the user
		//-->
	


		//to display Student2
		//major, grade points, and number of credits.
		// call the getFullName method to get the full name of the student.
		//-->
		System.out.println("\n"+"SECOND STUDENT INFORMATION \n");
		System.out.println("The name of student is: " + Student2.getFullName() + "\n" + "Major is: " + Student2.getMajor() +"\n" + "The student’s number of points is " + Student2.getGradePoints()+ "\n" + "Number of earned credits is " + Student2.getCredits());
		//to display Student2
		//major, grade points, and number of credits .
		// call the getFullName method to get the full name of the student.
		//-->


		
		// Change just the student’s major to
		// “International Affairs” by calling changeMajor(String newMajor)
		// Print out the following:
		// <Student full name> has changed majors to <Student Major>
		Student2.changeMajor("International Affairs");
		System.out.println(Student2.getFullName()+" has changed majors to " + Student2.getMajor());

		System.out.println("\n"+"STUDENT HELPER FUNCTIONS");
		System.out.println("Iterate from 1 till 30 with 3 steps and find sum");
		Student1.loopHelper(1, 30, 3);
		System.out.println("\n"+"Iterate from 5 till 28 with 2 steps and find sum");
		Student1.loopHelper(5, 28, 2);

	}
}
