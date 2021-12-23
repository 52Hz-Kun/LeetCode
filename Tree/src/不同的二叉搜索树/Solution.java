package 不同的二叉搜索树;

public class Solution {
    public int numTrees(int n) {
        int res = 0;
        if (n == 0) return 1;
        if (n == 1) return 1;
        for (int i = 0; i < n; i++) {
            int left = i;
            int right = n - i - 1;
            int L = numTrees(left);
            int R = numTrees(right);
            res += L * R;
        }
        return res;
    }

}
