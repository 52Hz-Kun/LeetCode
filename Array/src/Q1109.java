/**
 * 1109. 航班预订统计
 * 这里有 n 个航班，它们分别从 1 到 n 进行编号。
 *
 * 有一份航班预订表 bookings ，表中第 i 条预订记录 bookings[i] = [firsti, lasti, seatsi] 意味着在从 firsti 到 lasti （包含 firsti 和 lasti ）的 每个航班 上预订了 seatsi 个座位。
 *
 * 请你返回一个长度为 n 的数组 answer，里面的元素是每个航班预定的座位总数。
 */
public class Q1109 {
    // 暴力遍历
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            for (int j = bookings[i][0] - 1; j <= bookings[i][1] - 1; j++) {
                res[j] += bookings[i][2];
            }
        }
        return res;
    }
}
// 用差分数组
class Q1109_second {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] diff = new int[n];
        int[] res = new int[n];
        for (int i = 0; i < bookings.length; i++) {
            diff[bookings[i][0] - 1] += bookings[i][2];
            if (bookings[i][1] < n) diff[bookings[i][1]] -= bookings[i][2];
        }
        res[0] = diff[0];
        for (int i = 1; i < diff.length; i++) {
            res[i] = res[i - 1] + diff[i];
        }
        return res;
    }
}
