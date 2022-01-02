package offer10;

import org.junit.Test;

public class Solution {
    public int fib(int n) {

        int first = 1;
        int last = 1;
        int last_ = 0;
        while (n > 2){
            last_ = first;
            first = (first + last )% 1000000007;
            last = last_;

            n--;

        }
        if (n == 0) return 0;
        return first ;
    }
    @Test
    public void test(){
        int fib = fib(7);
        System.out.println(fib); //433494437
    }
}
