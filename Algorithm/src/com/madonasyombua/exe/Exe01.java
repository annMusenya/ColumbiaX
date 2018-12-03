package com.madonasyombua.exe;

/**
 * 
 * @author madona
 * Chapter 1, my answers.
 * Algorithms Robert Sedgewick and Kevin Wayne Princeton University
 * The ones that I have skipped have answers.
 */
public class Exe01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean [][] array = {{true,true,false},{true,true,false}};
		getValue();
		getValueAndType();
		getBooleanValue(array);
		
		
		
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

	/**
	 * 1.1.11 Write a code fragment that prints the contents of a two-dimensional boolean
array, using * to represent true and a space to represent false. Include row and column
numbers.
	 */
	
	static void getBooleanValue(boolean array[][]) {
		
		int n = array.length;
		int k = array[0].length;
		
		for(int i = 0; i< n; i++) {
			
			for(int j = 0; j< k;j++) {
				if(array[i][j]) {
					System.out.println("*");
				}
			}
			System.out.println(" ");
		}
		
	}
	
	/**
	 * 1.1.13 Write a code fragment to print the transposition (rows and columns changed)
of a two-dimensional array with M rows and N columns.
	 */
	
	
}
