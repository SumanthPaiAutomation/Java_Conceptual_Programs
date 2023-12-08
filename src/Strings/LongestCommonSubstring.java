package Strings;

public class LongestCommonSubstring {

    String longestCommonSubstring(String m, String n) {
        char[] str1 = m.toCharArray();
        char[] str2 = n.toCharArray();

        int[][] dp = new int[str1.length + 1][str2.length + 1];

        int max = 0;
        int endIndex = 0; // Store the ending index of the longest common substring

        // Iterate over each position in the matrix
        for (int i = 1; i <= str1.length; i++) {
            for (int j = 1; j <= str2.length; j++) {

                // If characters are equal
                if (str1[i - 1] == str2[j - 1]) {
                    // Get the number from diagonally opposite and add 1
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > max) {
                        max = dp[i][j];
                        endIndex = i - 1; // Update the ending index of the longest common substring
                    }
                }
            }
        }

        // Extract the longest common substring
        String longestCommonSubstr = m.substring(endIndex - max + 1, endIndex + 1);

        System.out.println("Longest Common Substring: " + longestCommonSubstr);
        System.out.println("Length of Longest Common Substring: " + max);

        return longestCommonSubstr;
    }

    public static void main(String[] args) {
        LongestCommonSubstring lcs = new LongestCommonSubstring();
        String m = "ABABC";
        String n = "BABCAC";
        lcs.longestCommonSubstring(m, n);
    }
}
