/**
 * 最长回文子串
 */
public class Q5 {
    public String longestPalindrome(String s) {
        int len = s.length();
        if (len < 2) return s;
        int max = 1;
        int start = 0;
        boolean[][] dp = new boolean[len][len];
        for (int i = 0; i < len; i++) {
            dp[i][i] = true;
        }
        // 子串的长度选择，从2开始
        for (int L = 2; L <= len; L++) {
            for (int i = 0; i < len; i++) {
                int j = i + L - 1;
                if (j >= len) break;

                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i < 3) dp[i][j] = true;
                    else dp[i][j] = dp[i + 1][j - 1];
                }

                if (dp[i][j] && j - i + 1 > max){
                    max = j - i + 1;
                    start = i;
                }
            }
        }
        return s.substring(start, start + max);
    }
}
