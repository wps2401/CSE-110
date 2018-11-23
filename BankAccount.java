
public class BankAccount {
	private int acctNumber;
	private double balance;
	private String name;
public BankAccount() {
	acctNumber=0;
	balance=0;
	name="Unknown";
}
public void setAcctNumber(int acctNumber) {
	this.acctNumber = acctNumber;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public void setName(String name) {
	this.name = name;
}
public int getAcctNumber() {
	return acctNumber;
}
public  double getBalance() {
	return balance;
}
public String getName() {
	return name;
}

public void deposit(double amount){
	balance=balance+amount;
}
public void withdraw(double amount) {
	balance=balance-amount;
}

public String toString() {
	return name;
}}