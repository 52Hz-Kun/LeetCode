import java.util.Arrays;
import java.util.Comparator;

/**
 * 435. 无重叠区间
 * 给定一个区间的集合 intervals ，其中 intervals[i] = [starti, endi] 。返回 需要移除区间的最小数量，使剩余区间互不重叠 。
 */
public class Q435 {
    public int eraseOverlapIntervals(int[][] intervals) {
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        int [] temp = intervals[0];
        int res = intervals.length;
        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] >= temp[1]) {
                temp = intervals[i];
                res--;
            }
        }
        return res;
    }

    public static void main(String[] args) {
    }
}
