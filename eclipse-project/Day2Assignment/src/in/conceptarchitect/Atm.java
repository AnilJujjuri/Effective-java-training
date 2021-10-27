package in.conceptarchitect.finance;


  
import java.util.Scanner;  

//create ATMExample class to implement the ATM functionality  
public class Atm
{  
  //main method starts   
  public static void main(String args[] )  
  {  
      //declare and initialize balance, withdraw, and deposit  
      int balance = 100000, withdraw, deposit; 
      String miniStatement=null,minitransaction1=null,minitransaction2=null,minitransaction3=null,minitransaction4=null,minitransaction5=null,minitransaction6=null,minitransaction7=null,minitransaction8=null,minitransaction9=null,minitransaction10=null,minitransaction11=null;
      //create scanner class object to get choice of user  
      Scanner atm = new Scanner(System.in);  
      
        
      while(true)  
      {  
          System.out.println("Automated Teller Machine");  
          System.out.println("Choose 1 for Withdraw");  
          System.out.println("Choose 2 for Deposit");  
          System.out.println("Choose 3 for Check Balance");  
          System.out.println("Choose 4 for Recent Transactions");
          System.out.println("Choose 5 for FastCash");
          System.out.println("Choose 6 for EXIT");  
          System.out.print("Choose the operation you want to perform:");  
            
          //get choice from user  
          int choice = atm.nextInt();  
          switch(choice)  
          {  
              case 1:  
      System.out.print("Enter money to be withdrawn:");  
                    
      //get the withdrawl money from user  
      withdraw = atm.nextInt();  
                    
      //check whether the balance is greater than or equal to the withdrawal amount  
      if(balance >= withdraw)  
      {  
          //remove the withdrawl amount from the total balance  
          balance = balance - withdraw;  
          System.out.println("Please collect your money");
         minitransaction1=withdraw+"amount deducted from your account";
      }  
      else  
      {  
          //show custom error message   
          System.out.println("Insufficient Balance");  
      }  
      System.out.println("");
       minitransaction2=withdraw+"unable to deduct from your account Due to low funds";
      break;  
 
              case 2:  
                    
      System.out.print("Enter money to be deposited:");
      
                    
      //get deposite amount from te user  
      deposit = atm.nextInt();  
                    
      //add the deposit amount to the total balanace  
      balance = balance + deposit;  
      System.out.println("Your Money has been successfully depsited");  
      System.out.println("");  
       minitransaction3=deposit+" Successfully deposited to your Account ";
      break;  
 
              case 3:  
      //displaying the total balance of the user  
      System.out.println("Balance : "+balance);  
      System.out.println("");  
      break;  
              case 4:  
				 miniStatement=minitransaction1+"\n"+minitransaction3;
				//displaying the total balance of the user  
                  System.out.println("miniStatement : "+miniStatement);  
                  System.out.println("");  
                  break;  
 
              case 5:  
              	
              	System.out.println("1000");
              	System.out.println("2000");
              	System.out.println("3000");
              	System.out.println("4000");
              	System.out.println("5000");
              	System.out.println("6000");
              	System.out.println("8000");
              	System.out.println("10000");
              	System.out.print("Choose the operation you want to perform:");
              	
  				   int n=atm.nextInt();
  				   switch(n) {
  				   case 1:
  				   
  				   if(balance>=1000)
  				   balance=balance-1000;
  				   minitransaction4=1000+"amount deducted from your account";
  				   break;
  				   case 2:
      				   
      				   if(balance>=2000)
      				   balance=balance-2000;
      				   minitransaction5=2000+"amount deducted from your account";
      				   break;   
  				   case 3:
      				   
      				   if(balance>=3000)
      				   balance=balance-3000;
      				   minitransaction6=3000+"amount deducted from your account";
      				   break;   
  				   case 4:
      				   
      				   if(balance>4000)
      				   balance=balance-4000;
      				   minitransaction7=4000+"amount deducted from your account";
      				   break;
  				   case 5:
  					   if(balance>=5000)
      				   
      				   balance=balance-5000;
  					   minitransaction8=5000+"amount deducted from your account";
  					   break;
  				   case 6:
      				   
      				   if(balance>=6000)
      				   balance=balance-6000;
      				   minitransaction9=6000+"amount deducted from your account";
      				   break;
  				   case 7:
      				   
      				   if(balance>=8000)
      				   balance=balance-8000;
      				   minitransaction10=8000+"amount deducted from your account";
      				   break;
  				   case 8:
  					   
      				   if(balance>=10000)
      				   balance=balance-10000;
      				   minitransaction11=10000+"amount deducted from your account";
  				   }   
                   	//displaying the total balance of the user  
  				   System.out.println("Please collect your money"); 
                      System.out.println("");    
              	     break;
              	   
              case 6:  
      //exit from the menu  
      System.exit(0);  
          }  
      }  
  }  
}
