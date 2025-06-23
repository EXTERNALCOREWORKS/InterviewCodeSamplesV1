package com.test.hacker.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Palindrome {
	
	public static boolean isItPalindrome(String s) {
		
		char[] word = s.toCharArray();
		int n=word.length;
		for(int i=0;i<n/2;i++) {
			if(word[i]!=word[n-i-1])
				return false;
		}
		return true;
	}
	
	public static void main(String args[]) {
		String a="axxb??";
		String impar="reconocer";
		String par="madar";
		//System.out.println(a+" getSmallestPalindrome? :"+getSmallestPalindrome(a)); // Expected abxxba
		System.out.println(impar+" isPalindrome? :"+isItPalindrome(impar));
		System.out.println(par+" isPalindrome? :"+isItPalindrome(par));
	}
}
