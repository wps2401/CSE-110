import java.util.Scanner;
public class person {
	Scanner scan = new Scanner(System.in);
	static String firstname;
	static String lastname;
	static int birthyear;
	public person () {
		System.out.println("Enter your first name: ");
		firstname = scan.next();
		System.out.println("Enter your last name: ");
		lastname = scan.next();
		System.out.println("Enter your birth year: ");
		birthyear = scan.nextInt();
	}
	public static String getFirstName() {
		return firstname;
	}
	public static String getLastName() {
		return lastname;
	}
	public static int getAge(int currentyear) {
		return currentyear-birthyear;
	}
}
	
