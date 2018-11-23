/*AUTHOR: Will Schuhmann
 * FILENAME:Lab3.java
 * SPECIFICATION: Determines if a student passed a class given several inputs
 * FOR: CSE 110 - Lab #3
 * TIME SPENT: 1 Hour
 */

import java.util.Scanner;
public class Lab3 {
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	double finalGrade =0;
	double homeworkGrade = 0;
	double midtermGrade = 0;
	double finalexamGrade = 0;
	System.out.print("Please enter your homework grade: ");
		homeworkGrade = scan.nextDouble();
		if (0 <= homeworkGrade && 100 >= homeworkGrade) {
			System.out.print("Please enter your midterm grade: ");
		}else System.out.print("Invalid input. Homework grade should be between 0 and 100.");
		midtermGrade = scan.nextDouble();
		if (0 <= midtermGrade && 100 >= midtermGrade) {
			System.out.print("Please enter your final exam grade: ");
		}else System.out.print("Invalid input. Midterm grade should be between 0 and 100.");
		finalexamGrade = scan.nextDouble();
		if (0 <= finalexamGrade && 200 >= finalexamGrade) {
		finalGrade = (((finalexamGrade/200)*50)+(midtermGrade*.25)+(homeworkGrade*.25));
		}else System.out.print("Invalid input. Final exam grade should be bewtween 0 and 200.");
		if (finalGrade >= 50) {
			System.out.print("You Passed!");
		}else System.out.print("You Failed!");
	
}
}
