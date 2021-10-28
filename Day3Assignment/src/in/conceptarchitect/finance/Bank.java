package in.conceptarchitect.finance;

import java.util.Random;
import java.util.Scanner;
public class Bank{ 

	 
	int accountNumber;
	String name;
	String password;
	double balance;
	static double interestRate = 10;
	
	

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {this.accountNumber = accountNumber;}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	public double getBalance() {
		return balance;
	}

	
	public static double getInterestRate() {
		return interestRate;
	}

public void BankAccount(int accountNumber, String name, String password, double amount) {
		
		balance=amount; //this is optional here as there is a single balance in the context	
		this.name=name;
		
		
		this.accountNumber=accountNumber;
		
	}



public int Bank(String name, String password,int balance){ 
int accountNumber=generateAccountNumber(); 
BankAccount account=new BankAccount(accountNumber, name,password,balance); 
saveAccount(account); 
return accountNumber;


} 

 

private void saveAccount(BankAccount account) {

int[] accounts= new int[50];	
	
}


static Random generator = new Random(System.currentTimeMillis());  
private int generateAccountNumber() {
	int accountNumber = generator.nextInt(1000) + 9999;
	
	return accountNumber;
}



boolean deposit( int accountNumber, double amount){ 

 

BankAccount account= GetAccountById(accountNumber); 

 

return account.deposit(amount); 

 

}



public BankAccount GetAccountById(int accountNumber) {
	// TODO Auto-generated method stub
	return null;
} 

 

} 