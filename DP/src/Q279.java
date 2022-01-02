import java.awt.print.PrinterGraphics;

/**
 * 完全平方数
 *
 * 给定正整数 n，找到若干个完全平方数（比如 1, 4, 9, 16, ...）使得它们的和等于 n。你需要让组成和的完全平方数的个数最少。
 *
 * 给你一个整数 n ，返回和为 n 的完全平方数的 最少数量 。
 *
 * 完全平方数 是一个整数，其值等于另一个整数的平方；换句话说，其值等于一个整数自乘的积。例如，1、4、9 和 16 都是完全平方数，而 3 和 11 不是。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/perfect-squares
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

public class Q279 {
    public int numSquares(int n) {
        int len = (int) Math.sqrt(n);
        int[] mul = new int[len];
        int[] res = new int[n + 1];
        res[0] = 0;
        for (int i = 1; i < mul.length + 1; i++) {
            mul[i - 1] = i * i;
        }
        for (int i = 1; i < n + 1; i++) {
            int minCount = Integer.MAX_VALUE;
            for (int j = 0; j < mul.length; j++) {
                // res数组在中间过程中的数值不能变
                if (i - mul[j] >= 0) minCount = Math.min(res[i - mul[j]] + 1, minCount);
            }
            res[i] = minCount;
        }
        return res[n];
    }

    public static void main(String[] args) {
        Q279 q279 = new Q279();
        int i = q279.numSquares(12);
        System.out.println(i);
    }
}
