import java.util.Scanner;
public class Bank {
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to our Bank");
		BankAccount StudentAccount = new BankAccount();
		System.out.println("Beginning state of myAcct:" + " acctNumber: " + StudentAccount.getAcctNumber() + " Balance: $" + StudentAccount.getBalance() + " Name: " + StudentAccount.getName());
		StudentAccount.deposit(200);
		StudentAccount.withdraw(30);
		StudentAccount.setName("Sue Student");
		StudentAccount.setAcctNumber(1234);
		System.out.println("State of StudentAcct:" + " acctNumber: " + StudentAccount.getAcctNumber() + " Balance: $" + StudentAccount.getBalance() + " Name: " + StudentAccount.getName());
	}
}
