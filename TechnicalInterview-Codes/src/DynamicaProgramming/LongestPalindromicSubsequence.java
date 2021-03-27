package DynamicaProgramming;

public class LongestPalindromicSubsequence {

	public static int longestPalindromicSubsequence(String s1) {

		int dp[][] = new int[s1.length()][s1.length()];
		int maxLength = 0;
		for (int i = 0; i < dp.length; i++)
			dp[i][i] = 1;

		for (int i = s1.length() - 1; i >= 0; i--) {
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) == s1.charAt(j)) {
					dp[i][j] = 2 + dp[i + 1][j - 1];
					maxLength = Math.max(maxLength, dp[i][j]);
				} else {
					dp[i][j] = Math.max(dp[i + 1][j], dp[i][j - 1]);
				}
			}
		}

		return maxLength;
	}

	public static void main(String[] args) {
		System.out.println(longestPalindromicSubsequence("abdbca"));

	}

}
