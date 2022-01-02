package offer46;

import org.junit.Test;
import sun.font.ExtendedTextLabel;

public class Solution {
    public int translateNum(int num) {
        String s = String.valueOf(num);
        int[] arr = new int[s.length()];
        for (int i = 0, len = arr.length; i < len; ++i) {
            arr[i] = s.charAt(i) - '0';
        }
        int len = arr.length;
        if (len == 1) return 1;
        int flag;
        int p = 1, q = 1, res = 1;
        for (int i = 1; i < len; i++) {
            int temp = arr[i - 1];
            if (temp * 10 + arr[i] < 26 && temp != 0) flag = 1; else flag =0;
            res = (flag == 1) ? p * flag + q : res;
            p = q;
            q = res;
        }
        return res;
    }

    @Test
    public void test(){
        int i = translateNum(506);
        System.out.println(i);
    }
}
