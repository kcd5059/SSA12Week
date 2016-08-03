package com.tiy.ssa.weekone.assignmentthree;

public class PigLatin {
	public String str;
	
	public PigLatin(String str) {
		this.str = str;
	}
	
	public String translate() {
		
		// Split the string into an array with one word per index
		String[] words = str.split(" ");
		String vowels = "aeiou";
		String translated = "";
		
		// Translate each word in the words array
		for (int i = 0; i < words.length; i++) {
			
			// Change all words to lowercase for uniformity
			words[i] = words[i].toLowerCase();
			
			// Translate one letter words first
			if (words[i].length() == 1) {
				words[i] += "way";
			} 
			// Now translate words beginning with vowels
			else if ( vowels.indexOf(words[i].charAt(0)) != -1 ) {
				words[i] += "way";
			} 
			// Now translate words with consonant+vowel as their first two words
			else if ( (vowels.indexOf(words[i].charAt(1)) != -1)) {
				words[i] = words[i].substring(1) + words[i].substring(0, 1) + "ay";
			}
			else {
			// Now translate words beginning with two consonants
			words[i] = words[i].substring(2) + words[i].substring(0, 2) + "ay";
			}
		}
		
		// Create a sentence string from words in the array
		for (int i = 0; i < words.length; i++) {
			// After the second word in the array, add a space to string before adding translated word
			if (i > 0) {
				translated += " " + words[i];
			} 
			// Concatenate word to string if it is the first/only word
			else {
				translated += words[i];
			}
		}	
		// If there is more than one word in the array, capitalize first letter and add period to translated string
		if (words.length > 1) {
			return translated.substring(0, 1).toUpperCase() + translated.substring(1) + ".";
		}
		// Otherwise just return the word by itself
		return translated;
	}
}
