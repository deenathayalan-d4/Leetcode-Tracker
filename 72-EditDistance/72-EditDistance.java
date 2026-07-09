// Last updated: 09/07/2026, 15:09:10
class Solution {
    public int minDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();
        int[][] dp = new int[m + 1][n + 1];
        for (int i = 0; i <= m; i++) {
            Arrays.fill(dp[i], -1);
        }
        return helper(word1, word2, m, n, dp);
    }
    public int helper(String ch1, String ch2, int m, int n, int[][] dp) {
        if (m == 0) return n; 
        if (n == 0) return m; 
        if (dp[m][n] != -1) {
            return dp[m][n];
        }
        if (ch1.charAt(m - 1) == ch2.charAt(n - 1)) {
            return dp[m][n] = helper(ch1, ch2, m - 1, n - 1, dp);
        }
        int insert = helper(ch1, ch2, m, n - 1, dp);
        int delete = helper(ch1, ch2, m - 1, n, dp);
        int replace = helper(ch1, ch2, m - 1, n - 1, dp);
        return dp[m][n] = 1 + Math.min(insert, Math.min(delete, replace));
    }
}