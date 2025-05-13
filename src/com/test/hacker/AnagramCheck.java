package com.test.hacker;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnagramCheck {

	public boolean areAnagrams(String word1, String word2) {
		// Step 0 trim and lowercase them
		word1=word1.replaceAll("\\s+","").toLowerCase();
		word2=word2.replaceAll("\\s+","").toLowerCase();
		// Step 1: Check length
		if (word1.length() != word2.length()) {
			return false;
		}

		// Step 2: Sort characters and compare
		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();
		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		return Arrays.equals(charArray1, charArray2);
	}

	// Method to check if two words are anagrams using character counts
	public boolean areAnagramsCountBased(String word1, String word2) {
		// Step 0 trim and lowercase them
		word1=word1.replaceAll("\\s+","").toLowerCase();
		word2=word2.replaceAll("\\s+","").toLowerCase();
		// Step 1: Check length
		if (word1.length() != word2.length()) {
			return false;
		}

        // Step 2: Count characters
        Map<Character, Integer> charCountMap1 = new HashMap<>();
        Map<Character, Integer> charCountMap2 = new HashMap<>();
        
        for (char c : word1.toCharArray()) {
            charCountMap1.put(c, charCountMap1.getOrDefault(c, 0) + 1);
        }
        
        for (char c : word2.toCharArray()) {
            charCountMap2.put(c, charCountMap2.getOrDefault(c, 0) + 1);
        }
        
        return charCountMap1.equals(charCountMap2);
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

