public class Student{

String studentMajor;
int studentCredits;
int studentPoints;
String firstName;
String lastName;

	public Student (String fName, String lName)
	{
		firstName=fName;
		lastName=lName;
		this.studentMajor = "General Studies";
		this.studentPoints = 0;
		this.studentCredits = 0;
	}
	public Student (String major, int credits, int points, String fName, String lName)
	{
		firstName=fName;
		lastName=lName;
		studentMajor=major;
		studentCredits=credits;
		studentPoints=points;
	}
	public String getMajor()
	{
		return studentMajor;
	}
	public int getGradePoints ()
	{
		return studentPoints;
	}
	public int getCredits()
	{
		return studentCredits;
	}
	public String getFullName()
	{
		return (firstName + " " + lastName);
	}
	public void changeMajor( String newMajor) {
		studentMajor=newMajor;
	}


	//you should have a loopHelper method. Given a start integer, end integer and incBy integer, it will print
	//sequence starting from start till end, incremented by given incBy integer

	public void loopHelper(int start, int end, int incBy){
		int sum = 0;
		int i;
		for(i=start;i<=end;i=i+incBy) {
			sum=sum+i;
			System.out.print(i+" ");
		}
		System.out.println("\n"+"Sum is: "+sum);
		// write a line of code
		// Using given inputs use for loop that
		// Prints sequence of numbers and summation.
		// Example
		// -> Calling student1.loopHelper(1, 10, 3); where start is 1, end is 10 and increment by 3,
		// We print following results using System.out.print
		// 1 4 7 10
}}