package 字符串转换整数;

import org.junit.Test;

public class Solution1 {
    @Test
    public void test(){
        int i = myAtoi("-91283472332");
        System.out.println(i);
    }


    public int myAtoi(String s) {
        int len = s.length();
        long res = 0;
        for (int i = 0; i < len; i++){
            if (res > Integer.MAX_VALUE)
                return Integer.MAX_VALUE;
            else if (res < Integer.MIN_VALUE)
                return Integer.MIN_VALUE;

            int c = s.charAt(i);
            if (c == ' ')
                continue;
            if (Character.isLetter(c))
                return (int) res;
            else if (Character.isDigit(c))
                res = res * 10 + Integer.parseInt(String.valueOf(c));
            else if (c == '+')
                continue;
            else if (c == '-')
                res = -res;
        }
        return 0;
    }
}
