/**
 * 134. 加油站
 * 在一条环路上有 n 个加油站，其中第 i 个加油站有汽油 gas[i] 升。
 *
 * 你有一辆油箱容量无限的的汽车，从第 i 个加油站开往第 i+1 个加油站需要消耗汽油 cost[i] 升。你从其中的一个加油站出发，开始时油箱为空。
 *
 * 给定两个整数数组 gas 和 cost ，如果你可以绕环路行驶一周，则返回出发时加油站的编号，否则返回 -1 。如果存在解，则 保证 它是 唯一 的。
 */
public class Q134 {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int sum = 0;
        int minSum = 0; // 最小的sum
        int start = 0; // 起始点的编号
        for (int i = 0; i < gas.length; i++) {
            sum += gas[i] - cost[i];
            if (sum < minSum) {
                minSum = sum;
                start = i + 1;
            }
        }
        if (sum < 0) return -1;
        // start 不可能为 gas.length， 除非sum < 0;
        return start;
    }
}
