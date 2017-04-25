/**
 * 5.7
 */
package com.mycompany.ass.chapter5;

/**
 * @author Paul Jerchaflie
 *
 */
public class DoWhileTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int counter=1;
		
		do{
			System.out.printf("%d  ",counter);
			++counter;
		}while (counter<=10);
		System.out.println();
	}

}
