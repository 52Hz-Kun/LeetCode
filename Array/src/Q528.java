import java.util.Random;

/**
 * 528. 按权重随机选择
 * 给你一个 下标从 0 开始 的正整数数组 w ，其中 w[i] 代表第 i 个下标的权重。
 *
 * 请你实现一个函数 pickIndex ，它可以 随机地 从范围 [0, w.length - 1] 内（含 0 和 w.length - 1）选出并返回一个下标。选取下标 i 的 概率 为 w[i] / sum(w) 。
 *
 * 例如，对于 w = [1, 3]，挑选下标 0 的概率为 1 / (1 + 3) = 0.25 （即，25%），而选取下标 1 的概率为 3 / (1 + 3) = 0.75（即，75%）
 */

public class Q528 {
    int[] preSum;

    public Q528(int[] w) {
        preSum = new int[w.length + 1];
        preSum[0] = 0;
        for (int i = 1; i <= w.length; i++) {
            preSum[i] = preSum[i - 1] + w[i - 1];
        }
    }

    public int pickIndex() {
        int num = new Random().nextInt(preSum[preSum.length - 1]);
        int left = 1;
        int right = preSum.length;

        while (left < right) {
            int mid = left + (right - left) / 2;
            if (preSum[mid] <= num) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return right - 1;
    }
}
