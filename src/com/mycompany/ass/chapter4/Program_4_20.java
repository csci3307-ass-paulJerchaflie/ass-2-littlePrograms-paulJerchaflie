/**
 * 
 */
package com.mycompany.ass.chapter4;

import java.util.Scanner;

/**
 * @author Paul Jerchaflie
 *
 */

public class Program_4_20 {

	/*
	 * Develop a Java application that determines the gross pay for each of
three employees. The company pays straight time for the first 40 hours worked by each employee
and time and a half for all hours worked in excess of 40. You’re given a list of the employees, their
number of hours worked last week and their hourly rates. Your program should input this information
for each employee, then determine and display the employee’s gross pay. Use class Scanner to
input the data.
	 */
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double rate1,rate2,rate3;
		int hour1,hour2,hour3;
		double pay1,pay2,pay3;
		
		System.out.print("Enter the Hourly rate for employee 1: ");
		rate1=scan.nextDouble();
		System.out.print("Enter the number of hours worked: ");
		hour1=scan.nextInt();
		
		System.out.print("Enter the Hourly rate for employee 2: ");
		rate2=scan.nextDouble();
		System.out.print("Enter the number of hours worked: ");
		hour2=scan.nextInt();
		
		System.out.print("Enter the Hourly rate for employee 3: ");
		rate3=scan.nextDouble();
		System.out.print("Enter the number of hours worked: ");
		hour3=scan.nextInt();
		
		if(hour1<=40)
			pay1=hour1*rate1;
		else
			pay1=40*rate1+(hour1-40)*rate1*1.5;
		
		if(hour2<=40)
			pay2=hour2*rate2;
		else
			pay2=40*rate2+(hour2-40)*rate2*1.5;
		
		if(hour3<=40)
			pay3=hour3*rate3;
		else
			pay3=40*rate3+(hour3-40)*rate3*1.5;
		
		
		
		System.out.printf("Employee 1 total pay: $%.2f%n",pay1);
		System.out.printf("Employee 2 total pay: $%.2f%n",pay2);
		System.out.printf("Employee 3 total pay: $%.2f%n",pay3);
		
		
	}

}
