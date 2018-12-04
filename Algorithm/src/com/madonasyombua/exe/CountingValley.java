package com.madonasyombua.exe;

public class CountingValley {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c = "UDDDUDUU";
		System.out.println(countingVallies(c,8));
	}

	static int countingVallies(String s, int n) {
		
		int valley = 0;
		int level = 0;
		
		for(char c : s.toCharArray()) {
			if(c =='U')
				++level;
			if(c == 'D')
				--level;
			
			if(level == 0 && c == 'U') {
				++valley;
			}
		}
		
		return valley;
		
	}
}
