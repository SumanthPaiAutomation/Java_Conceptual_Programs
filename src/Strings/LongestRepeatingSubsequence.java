package Strings;
public class LongestRepeatingSubsequence {

    public static String longestRepeatingSubsequence(String str) {
        int n = str.length();

        // Construct dp matrix
        int[][] dp = new int[n + 1][n + 1];

        // Populate dp matrix
        for (int i = 1; i <= n; i++)
            for (int j = 1; j <= n; j++)
                if (str.charAt(i - 1) == str.charAt(j - 1) && i != j)
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

        // Traverse dp matrix to construct the longest repeating subsequence
        StringBuilder lrsBuilder = new StringBuilder();
        int i = n, j = n;
        while (i > 0 && j > 0) {
            if (str.charAt(i - 1) == str.charAt(j - 1) && i != j) {
                lrsBuilder.insert(0, str.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Return the longest repeating subsequence as a string
        return lrsBuilder.toString();
    }

    public static void main(String[] args) {
        String str = "aabcb";
        String longestRepeatingSubsequence = longestRepeatingSubsequence(str);

        System.out.println("Longest Repeating Subsequence: " + longestRepeatingSubsequence);
    }
}