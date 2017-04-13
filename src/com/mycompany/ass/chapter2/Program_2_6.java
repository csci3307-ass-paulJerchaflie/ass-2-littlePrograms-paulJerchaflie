/**
 * 
 */
package com.mycompany.ass.chapter2;

import java.util.Scanner;

/**
 * @author Paul Jerchaflie
 *
 */
public class Program_2_6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//This program will calculate the product of three integers
		Scanner input=new Scanner(System.in);
		int x,y,z,result;
		System.out.println("Enter an integer");
		x=input.nextInt();
		System.out.println("Enter another integer");
		y=input.nextInt();
		System.out.println("Enter another integer");
		z=input.nextInt();
		result=x*y*z;
		System.out.printf("Product is %d",result);
		input.close();


	}

}
