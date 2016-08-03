package com.tiy.ssa.weekone.assignmentthree;

public class MaybePalindrome {
	
	public String str;
	boolean pal = true;
	
	public MaybePalindrome(String str) {
		this.str = str;
	}

	public boolean isPalindrome() {
		str.toLowerCase();
		char[] chars = str.toCharArray();
		
		// Evaluate all characters in char array
		for (int i = 1; i <= (chars.length - 1); i++) {
			
			// If the character at left index is equal to the right index, set pal to false
			if (chars[i - 1] != chars[chars.length - i]) {
				pal = false;
			}
		}
		return pal;
	}
	
	public void reportResult() {
		if (pal == true) {
			System.out.println(str + " is a palindrome.");
		} else {
			System.out.println(str + " is NOT a palindrome.");
		}
	}
}
