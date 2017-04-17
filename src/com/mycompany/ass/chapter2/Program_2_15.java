/**
 * 
 */
package com.mycompany.ass.chapter2;

import java.util.Scanner;

/**
 * @author Paul Jerchaflie
 *
 */
public class Program_2_15 {

	/**
	 * @param args
	 */
	//Write an application that asks the user to enter two integers, obtains them
//	from the user and prints their sum, product, difference and quotient (division). Use the techniques
//	shown in Fig. 2.7.
	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		num2=scan.nextInt();
		System.out.printf("Sum: %d%n",num1+num2);
		System.out.printf("Subtract: %d%n", num1-num2);
		System.out.printf("Multiply: %d%n", num1*num2);
		System.out.printf("Divide: %d%n", num1/num2);
		
	}

}
