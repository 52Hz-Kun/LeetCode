package 整数翻转;

import org.junit.Test;

// 此答案不能跑！！！

public class Solution1 {
    @Test
    public void test(){
        System.out.println(reverse(120));
    }
    public int reverse(int x) {
        int flag;
        int temp;
        int result = 0;
        if(x >= 0)
            flag = 1;
        else
            flag = -1;
        x = Math.abs(x);
        while (x % 10 > 0){
            temp = x % 10;
            x /= 10;
            try {
                result = result * 10 + temp;
            }catch(Exception e){
                return 0;
            }
        }
        return flag * result;
    }
}
