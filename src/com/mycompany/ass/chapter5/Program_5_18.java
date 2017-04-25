/**
 * 
 * 
 */
package com.mycompany.ass.chapter5;

/**
 * @author Paul Jerchaflie
 *
 */

/*
 * Modify the application in Fig. 5.6 to use only integers
to calculate the compound interest.
Hint: Treat all monetary amounts as integral numbers
of pennies. Then break the result into its dollars and cents 
portions by using the division and remainder
operations, respectively. Insert a period between the dollars
 and the cents portions.]
 */
public class Program_5_18 {
	public static void main(String []args){
		int amount;
		double principal=1000; //amount in cents
		int dollars,cents;
		double rate=0.05;
		
		System.out.printf("%s%20s%n","Year","Amount on deposit");
		for (int year=1;year<=10;++year){
			amount=100*(int)(principal*Math.pow(1+rate, year));
			dollars=amount/100;
			cents=amount%100;
			System.out.println(year+"\t"+dollars+"."+cents);
		}
	}
}
