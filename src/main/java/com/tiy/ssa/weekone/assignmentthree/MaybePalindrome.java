package com.tiy.ssa.weekone.assignmentthree;

public class MaybePalindrome {
	
	private final String str;
	
	public MaybePalindrome(String str) {
		this.str = str;
	}

	public boolean isPalindrome() {
		String workingString =  str.toLowerCase();
		final char[] chars = workingString.toCharArray();
		
		// Evaluate all characters in char array
		for (int i = 1; i < (chars.length); i++) {
			
			// If the character at left index is equal to the right index, set pal to false
			if (chars[i - 1] != chars[chars.length - i]) {
			return false;
			}
		}
		return true;
	}
	
	public String reportResult() {
		if (isPalindrome()) {
			return str + " is a palindrome.";
		} else {
			return str + " is not a palindrome.";
		}
	}
}
