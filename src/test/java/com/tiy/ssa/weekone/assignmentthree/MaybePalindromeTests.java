package com.tiy.ssa.weekone.assignmentthree;

import static org.junit.Assert.*;

import org.junit.Test;

public class MaybePalindromeTests {

	@Test
	public void isPalindromeTests() {
		assertEquals(true, new MaybePalindrome("racecar").isPalindrome());
		assertEquals(false, new MaybePalindrome("kitty").isPalindrome());
		assertEquals(false, new MaybePalindrome("antidisestablishmentarianism").isPalindrome());
		assertEquals(true, new MaybePalindrome("tattarrattat").isPalindrome());
		assertEquals(true, new MaybePalindrome("1234567890987654321").isPalindrome());
		assertEquals(false, new MaybePalindrome("1234567890").isPalindrome());
		// I'm assuming that a single character word is also considered a palindrome
		assertEquals(true, new MaybePalindrome("a").isPalindrome());
		assertEquals(false, new MaybePalindrome("ab").isPalindrome());
		assertEquals(false, new MaybePalindrome("abc").isPalindrome());
	}
	
	@Test
	public void reportResultTests() {
		assertEquals("racecar is a palindrome.", new MaybePalindrome("racecar").reportResult());
		assertEquals("kitty is not a palindrome.", new MaybePalindrome("kitty").reportResult());
	}
}
