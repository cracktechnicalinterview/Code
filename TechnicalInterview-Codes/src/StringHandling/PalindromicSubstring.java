package StringHandling;

import java.util.HashSet;

public class PalindromicSubstring {

	// BRUTE FORCE ////////
	public static boolean isPalindrome(String str) {
		return str.equalsIgnoreCase(new StringBuilder(str).reverse().toString());
	}

	public static void generateAllSubstringBruteForce(String str) {
		HashSet<String> set = new HashSet<String>();
		int maxLength = 0;
		for (int i = 0; i < str.length(); i++) {
			for (int j = i; j < str.length(); j++) {
				if (isPalindrome(str.substring(i, j+1))) {
					set.add(str.substring(i, j+1));
					maxLength = Math.max(maxLength, str.substring(i, j+1).length());
				}
			}
		}

		System.out.println("Brute Force (Max Length)==> " + maxLength);
		System.out.println("Brute Force (Palindromic Substring) ==>"+set);
		
	}

	/// OPTIMIZED` /////
	static int maxLength = 0;

	public static void isPalindrome(String str, int left, int right, HashSet<String> set) {

		while ((left >= 0 && right < str.length()) && (str.charAt(left) == str.charAt(right))) {

			set.add(str.substring(left, right + 1));

			if (str.substring(left, right + 1).length() > maxLength)
				maxLength = str.substring(left, right + 1).length();

			left--;
			right++;
		}

	}

	public static void generateAllSubstring(String str) {

		HashSet<String> set = new HashSet<String>();
		for (int i = 0; i < str.length(); i++) {

			isPalindrome(str, i, i, set); // odd length palindrome
			isPalindrome(str, i, i + 1, set); // even length palindrome

		}
		System.out.println(set);
		System.out.println("Longest Palindromic Substring = " + maxLength);
	}

	public static void main(String[] args) {
		String s = "google";
		generateAllSubstring(s);
		
		System.out.println();
		generateAllSubstringBruteForce(s);

	}

}
