/**
 * 
 */
package com.mycompany.ass.chapter2;

import java.util.Scanner;

/**
 * @author Paul Jerchaflie
 *
 */
public class Program_2_16 {

	/**
	 * @param args
	 */
	
	/*
	 * Write an application that asks the user to enter two integers, obtains
	 * them from the user and displays the larger number followed by the words
	 *  "is larger". If the numbers are equal, print the message "These numbers
	 *   are equal".
	 */
	public static void main(String[] args) {
		int num1,num2;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		num2=scan.nextInt();
		if (num1>num2){
			System.out.printf("%d is larger.%n",num1);
		}
		else if (num2>num1){
			System.out.printf("%d is larger.%n",num2);
		}
		else 
			System.out.println("These numbers are equal.");
		scan.close();

	}

}
