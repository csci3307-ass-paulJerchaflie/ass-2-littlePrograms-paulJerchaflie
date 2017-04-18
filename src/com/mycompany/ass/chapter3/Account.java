/**
 * 
 */
package com.mycompany.ass.chapter3;

/**
 * @author Paul Jerchaflie
 *
 */
public class Account {
	private String name;
	private double balance;
	
	public Account(String name,double balance){
		this.setName(name);
		if (balance>0)
			this.balance=balance;
	}
	
	public void deposit(double depositAmount){
		if (depositAmount>0)
			balance+=depositAmount;
	}
	
	public void withdraw(double withdrawlAmount){
		if (balance<withdrawlAmount){
			System.out.println("Withdrawl amount exceeded account balance.");
		}
		else{
			balance-=withdrawlAmount;
		}
	}
	
	public double getBalance(){
		return balance;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}
}
