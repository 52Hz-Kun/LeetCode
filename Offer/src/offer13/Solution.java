package offer13;

import org.junit.Test;

public class Solution {
    public int movingCount(int m, int n, int k) {
        // 用深度优先做

        return 1;
    }

    boolean dfs(int x, int y, int m, int n, int k){
        if (add(x) + add(y) > k || x > m -1 || y > n -1)  return false;
        return dfs(x + 1, y, m, n, k) || dfs(x - 1, y, m, n, k)|| dfs(x, y + 1, m, n, k) || dfs(x, y - 1, m, n, k);
    }
    int add(int x){
        int res = 0;
        while (x != 0){
            res += x % 10;
            x = x / 10;
        }
        return res;
    }

    @Test
    public void test(){
        int x = 1243;
        int add = add(x);
        System.out.println(add);
    }
}
