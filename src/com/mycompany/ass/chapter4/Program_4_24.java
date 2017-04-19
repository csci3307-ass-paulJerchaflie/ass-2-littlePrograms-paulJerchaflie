/**
 * 
 */
package com.mycompany.ass.chapter4;
import java.util.Scanner;
/**
 * @author Paul Jerchaflie
 *
 */
public class Program_4_24 {

	
	/*
	 * Modify the program in Fig. 4.12 to validate its inputs. For any input,
if the value entered is other than 1 or 2, keep looping until the user enters a correct value.
	 */
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int passes = 0;
		int failures = 0;
		int studentCounter = 1;

		while (studentCounter<=10){
			System.out.print("Enter result (1 = pass, 2 = fail): ");
			int result=input.nextInt();
			boolean valid=false;
			
			do {
			if (result == 1){
				passes = passes + 1;
				valid=true;
			}
			else if(result==2){
				failures = failures + 1;
				valid=true;
			}
			else{
				System.out.println("Enter only 1 or 2");
				System.out.print("Enter result (1 = pass, 2 = fail): ");
				result=input.nextInt();
			}
			} while(!valid);
			
			studentCounter = studentCounter + 1;
		}
		System.out.printf("Passed: %d%nFailed: %d%n", passes, failures);
		
		if (passes > 8)
			System.out.println("Bonus to instructor!");
		
		input.close();
	}
}
