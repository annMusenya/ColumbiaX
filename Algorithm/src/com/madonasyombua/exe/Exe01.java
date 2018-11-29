package com.madonasyombua.exe;

public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		getValue();
		
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

}
