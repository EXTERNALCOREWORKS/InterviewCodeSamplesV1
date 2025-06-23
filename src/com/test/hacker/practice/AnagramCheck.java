package com.test.hacker.practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public boolean areAnagrams(String word1, String word2) {
		char[] array1=word1.replaceAll("\\s+","").toLowerCase().toCharArray();
		char[] array2=word2.replaceAll("\\s+","").toLowerCase().toCharArray();
		if(array1.length!=array2.length)
			return false;
		Arrays.sort(array1);
		Arrays.sort(array2);
		if(Arrays.equals(array1, array2))
			return true;
		return false;
	}

	// Method to check if two words are anagrams using character counts
	public boolean areAnagramsCountBased(String word1, String word2) {
		char[] array1=word1.replaceAll("\\s+","").toLowerCase().toCharArray();
		char[] array2=word2.replaceAll("\\s+","").toLowerCase().toCharArray();
		if(array1.length!=array2.length)
			return false;
		Map<Character, Integer> word1Map=new HashMap<>();
		Map<Character, Integer> word2Map=new HashMap<>();
		
		for(char c : array1) {
			word1Map.put(c, word1Map.getOrDefault(c, 0)+1);
		}
		
		for(char c : array2) {
			word2Map.put(c, word2Map.getOrDefault(c, 0)+1);
		}
		if(word1Map.equals(word2Map))
			return true;
		return false;
    }

    public static void main(String[] args) {
        AnagramCheck ac = new AnagramCheck();
        String word1 = "Oh Lame Saint";
        String word2 = "The Mona Lisa";
        System.out.println(ac.areAnagrams(word1, word2));  // Output: true
        System.out.println(ac.areAnagramsCountBased(word1, word2));  // Output: true
        
        word1 = "hello";
        word2 = "world";
        System.out.println(ac.areAnagrams(word1, word2));  // Output: false
        System.out.println(ac.areAnagramsCountBased(word1, word2));  // Output: false
    }
}


