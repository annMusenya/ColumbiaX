package com.madonasyombua.exe;
/**
 * 
 * @author madona
 *
 */
public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getValue();
		getValueAndType();
		
	}
	/**
	 * 1.1.1 Give the value of each of the following expressions:
	 */
	static void getValue() {
	
		int a = (0 + 15)/2;
		double b = 2.0e-6 * 100000000.1;
		boolean c = true && false || true && true;
		
		System.out.printf("The answer is: %d\n", a);
		System.out.printf("The answer is: %.2f\n", b);
		System.out.printf("The answer is: %s\n", c);
	}
    /**
      * 1.1.2 Give the type and value of each of the following expressions:
      */
	static void getValueAndType() {
	
		double a = (1 + 2.236)/2;
		double b =  1 + 2 + 3 + 4.0;
		String d =  1 + 2 + "3";
		
		System.out.printf("The answer is: %.2f\n", a);
		System.out.printf("The answer is: %.2f\n", b);
		System.out.printf("The answer is: %s\n", d);
		
		
	}
}
