package com.test.hacker;

public class Palindrome {
	public static String getSmallestPalindrome(String s) {
		// Write your code here
		char[] wordArray = s.toCharArray();
		int length = wordArray.length;
		// iterate from both edges and validate whether its a palindrome or not
		// mirroring both edges
		// gradually, if even, below will handle odd case
		for (int i = 0; i < length / 2; i++) {
			char wordArrayLeftLetter = wordArray[i];
			char wordArrayRightLetter = wordArray[length - i - 1];
			if (wordArrayLeftLetter == '?' && wordArrayRightLetter == '?') {
				wordArray[i] = 'a';
				wordArray[length - i - 1] = 'a';
			} else if (wordArrayLeftLetter == '?') {
				wordArray[i] = wordArrayRightLetter; // mirror
			} else if (wordArrayRightLetter == '?') {
				wordArray[length - i - 1] = wordArrayLeftLetter; // mirror
			} else if (wordArrayLeftLetter != wordArrayRightLetter) {
				return "-1"; // no palindrome
			}
		}
		// handle the odd length case
		if (length % 2 == 1 && wordArray[length / 2] == '?')
			wordArray[length / 2] = 'a';
		return new String(wordArray); // YEY !!! :)
	}
	
	public static boolean isItPalindrome(String s) {
		char[] wordArray = s.toCharArray();
		int length = wordArray.length;
		for (int i = 0; i < length / 2; i++) {
			char left = wordArray[i];
			char right = wordArray[length - i - 1];
			if (left != right) {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String args[]) {
		String a="ai?a??a";
		String impar="reconocer";
		String par="madam";
		System.out.println(impar+" isPalindrome? :"+isItPalindrome(impar));
		System.out.println(par+" isPalindrome? :"+isItPalindrome(par));
	}
}
