import java.util.Scanner;
import account.BankAccount;

class assignment1{
	public static void main(String args[]){
		
		Scanner read = new Scanner(System.in);
		BankAccount ba = new BankAccount("0638108034749","Kottresha","12345678",500,0.2);
		
		while(true){
			System.out.println("1. Deposit\n2. Withdrawn\n3. Credit Interest\n0. Exit\n4. Options\nEnter your choice");
			switch(read.nextInt()){
				case 1:
					ba.depositAmount();
					break;
				case 2:
					ba.withdrawAmount();
					break;
				case 3:
					ba.creditInterest();
					break;
				case 4:
					ba.options();
					break;
				case 0:
					return;
			}
		}
	}
}