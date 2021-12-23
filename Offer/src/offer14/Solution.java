package offer14;

import com.sun.beans.editors.ByteEditor;

public class Solution {
    /**
     * 动态规划做的，好像还挺好？
     * @param n
     * @return
     */
    public int cuttingRope(int n) {
        int[] res = new int[n];
        res[0] = 1;
        for (int i = 1; i < n; i++) {
            int max = 0;
            for (int j = 0; j < i; j++) {
                int temp = res[j] * res[i - j - 1];
                if (temp > max) max = temp;
            }
            if (i != n - 1)
                res[i] = Math.max(max, i + 1);
            else res[i] = max;
        }
        return res[n - 1];
    }


}
