package offer10_;

public class Solution {
    public int numWays(int n) {
        if (n == 0) return 1;
        int p = 0;
        int q = 0;
        int r = 1;
        for (int i = 0; i < n; i++) {
            p = q;
            q = r;
            r = (p + q)%1000000007;
        }
        return r;
    }
}
