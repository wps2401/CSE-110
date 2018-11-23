/*-------------------------------------------------------------------------
// AUTHOR: Will Schuhmann
// FILENAME: Lab6.java and person.java
// SPECIFICATION: Returns age and future age
// FOR: CSE 110- Lab #6
// TIME SPENT: 4 hours
//-----------------------------------------------------------*/

import java.util.Scanner;
public class Lab6{
	public static void main(String[] args) {
	new Scanner(System.in);
	person person1 = new person();
	System.out.println(person.getFirstName() + " " + person.getLastName()+" is " + person.getAge(2018)+" years old and will be " + person.getAge(2028) + " years old in ten years.");
	}}