package StringHandling;

import java.util.HashSet;

public class PalindromicSubstring {

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
		System.out.println("Longest Palindromic Substring = " +maxLength);
	}

	public static void main(String[] args) {
		String s = "google";
		generateAllSubstring(s);

	}

}
