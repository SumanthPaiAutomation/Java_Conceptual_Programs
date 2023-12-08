package Strings;

public class LongestCommonSubsequence {
    public static int LCSLength=0;
    public static String printLCS(String text1, String text2) {
        // Construct dp matrix
        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        // Populate dp matrix
        for (int i = 1; i <= text1.length(); i++)
            for (int j = 1; j <= text2.length(); j++)
                if (text1.charAt(i - 1) == text2.charAt(j - 1))
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                else
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);

        //store the LCS length here
        LongestCommonSubsequence.LCSLength=dp[text1.length()][text2.length()];


        // Traverse dp matrix to construct LCS
        StringBuilder lcsBuilder = new StringBuilder();
        int i = text1.length(), j = text2.length();
        while (i > 0 && j > 0) {
            if (text1.charAt(i - 1) == text2.charAt(j - 1)) {
                lcsBuilder.insert(0, text1.charAt(i - 1));
                i--;
                j--;
            } else if (dp[i - 1][j] > dp[i][j - 1]) {
                i--;
            } else {
                j--;
            }
        }

        // Return the LCS as a string
        return lcsBuilder.toString();
    }

    public static void main(String[] args) {
        String text1 = "abcdaf";
        String text2 = "acbcf";
        System.out.println("LCS: " + printLCS(text1, text2));
        System.out.println("Length of LCS: " + LongestCommonSubsequence.LCSLength);

    }
}
