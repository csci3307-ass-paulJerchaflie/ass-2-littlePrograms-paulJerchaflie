/**
 * 
 */
package com.mycompany.ass.chapter2;

import java.util.Scanner;

/**
 * @author Paul Jerchaflie
 *
 */
public class Program_2_17 {

	/**
	 * @param args
	 */
	
//	Write an application that inputs three integers from the
//	user and displays the sum, average, product, smallest and largest of the 
//	numbers. 
//	Use the techniques	shown in Fig. 2.15. [Note: The calculation of 
//	the average in this exercise should result in an integer
//	representation of the average. So, if the sum of the values is 7, the 
//	average should be 2, not	2.3333….]
	
	public static void main(String[] args) {
		int num1,num2,num3;
		Scanner scan=new Scanner(System.in);
		System.out.print("Enter the first number: ");
		num1=scan.nextInt();
		System.out.print("Enter the second number: ");
		num2=scan.nextInt();
		System.out.print("Enter the third number: ");
		num3=scan.nextInt();
		
		int min,max;
		min=Integer.min(num1, num2); min=Integer.min(min,num3);
		max=Integer.max(num1, num2); max=Integer.max(max,num3);
		System.out.printf("Sum: %d%n",max+min);
		System.out.printf("Average: %d%n",(max+min)/2);
		System.out.printf("Product: %d%n",max*min);		
		
		scan.close();
	}

}
