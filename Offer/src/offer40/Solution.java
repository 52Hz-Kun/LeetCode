package offer40;

import java.util.Arrays;

public class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
        int[] res = new int[k];
        Arrays.sort(arr);
        for (int i = 0; i < res.length; i++) {
            res[i] = arr[i];
        }
        return res;
    }
}
