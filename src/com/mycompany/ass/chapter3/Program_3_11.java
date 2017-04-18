/**
 * 
 */
package com.mycompany.ass.chapter3;
import java.util.Scanner;
/**
 * @author Paul Jerchaflie
 *
 */

public class Program_3_11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
      Account account1 = new Account("Jane Green", 50.00);
      Account account2 = new Account("John Blue", -7.53);

      // display initial balance of each object
      System.out.printf("%s balance: $%.2f%n",
         account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n%n",
         account2.getName(), account2.getBalance());

      // create a Scanner to obtain input from the command window
      Scanner input = new Scanner(System.in);

      System.out.print("Enter deposit amount for account1: ");//prompt
      double depositAmount = input.nextDouble();
      System.out.printf("%nadding %.2f to account1 balance%n%n",
         depositAmount);
      account1.deposit(depositAmount); //add to account1's balance
      
      //display balances
      System.out.printf("%s balance: $%.2f%n",
    		  account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n",
    	         account2.getName(), account2.getBalance());
      
      System.out.print("Enter deposit amount for account2: ");
      depositAmount = input.nextDouble();
      System.out.printf("%nadding %.2f to account2 balance%n%n",
         depositAmount);
      account2.deposit(depositAmount); //add to account2 balance
      
      //display balances
      System.out.printf("%s balance: $%.2f%n",
    		  account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n",
    	         account2.getName(), account2.getBalance());
      //******************************************************************* new below
      System.out.print("Enter withdrawl amount for account1: ");//prompt
      double withdrawlAmount = input.nextDouble();
      System.out.printf("%nRemoving %.2f from account1 balance%n%n",
    		  withdrawlAmount);
      account1.withdraw(withdrawlAmount); 
      
      //display balances
      System.out.printf("%s balance: $%.2f%n",
    		  account1.getName(), account1.getBalance());
      System.out.printf("%s balance: $%.2f%n",
    	         account2.getName(), account2.getBalance());
   
    System.out.print("Enter withdrawl amount for account2: ");
      withdrawlAmount = input.nextDouble();
      System.out.printf("%nRemoving %.2f from account2 balance%n%n", withdrawlAmount);
      account2.withdraw(withdrawlAmount);

      //display balances
     

	}//end main
}
