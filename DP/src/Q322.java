import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 零钱兑换
 *
 * 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。
 *
 * 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。
 *
 * 你可以认为每种硬币的数量是无限的
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/coin-change
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Q322 {
    public int coinChange(int[] coins, int amount) {
        if (amount == 0 || coins == null || coins.length == 0) return 0;
        ArrayList<Integer> list = new ArrayList<>(coins.length);
        for (int i : coins) list.add(i);
        int[] count = new int[amount + 1];
        count[0] = 0;
        // i 代表了当前的amount数值
        for (int i = 1; i < count.length; i++) {
            int minCount = Integer.MAX_VALUE;
            for (int j = 0; j < coins.length; j++) {
                if (i - coins[j] >= 0){
                    if (count[i - coins[j]] == -1){
                        continue;
                    } else minCount = Math.min(minCount, count[i - coins[j]] + 1);
                }
            }
            count[i] = minCount == Integer.MAX_VALUE ? -1 : minCount;
        }
        return count[amount];
    }

    public static void main(String[] args) {
        int i = new Q322().coinChange(new int[]{186,419,83,408}, 6249);
        System.out.println(i);

    }
}
