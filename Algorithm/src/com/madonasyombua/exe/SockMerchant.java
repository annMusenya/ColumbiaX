package com.madonasyombua.exe;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class SockMerchant {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = {10 ,20, 20, 10 ,10, 30, 50, 10, 20,60,60};
		System.out.printf("%d\n",sockMerchant1(arr,11));
		System.out.printf("%d",sockMerchant(arr,11));
		
	}

	static int sockMerchant1(int arr[],int n) {
	
		Arrays.sort(arr); //you have to sort the array
		int pairs = 0;
		
		for(int i = 0; i < n-1; i++) {
			
			if(arr[i] == arr[i + 1]) {
				pairs++;
				i++;
			}
			
		}
		
		return pairs;
	
	}
	static int sockMerchant(int arr[],int n) {
	
		Set<Integer> colors = new HashSet<>();
		int pairs = 0;
		
		for(int i = 0; i < n; i++) {
			
			if(!colors.contains(arr[i])) {
				colors.add(arr[i]);
			}else {
				pairs++;
				colors.remove(arr[i]);
			}
		}
			
		return pairs;
		
		
	}
	
}
