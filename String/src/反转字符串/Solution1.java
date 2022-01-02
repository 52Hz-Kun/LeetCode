package 反转字符串;

import org.junit.Test;

import java.util.Arrays;

public class Solution1 {
    @Test
    public void test(){
        char[] s = {'a', 'b', 'c', 'd', 'e'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }
    public void reverseString(char[] s) {
        int n = s.length;
        for (int i = 0; i < n / 2; i++) {
            char temp;
            temp = s[i];
            s[i] = s[n - 1 - i];
            s[n - 1 - i] = temp;
        }
    }
}
