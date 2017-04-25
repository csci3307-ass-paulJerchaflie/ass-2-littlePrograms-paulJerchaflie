/**
 * 5.13
 */
package com.mycompany.ass.chapter5;

/**
 * @author Paul Jerchaflie
 *
 */
public class BreakTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int count;
		for(count=1;count<=10;count++){
			if (count==5)
				break;
			
			System.out.println(count);
		}
		System.out.println("Broke out of loop at count = "+count);

	}

}
