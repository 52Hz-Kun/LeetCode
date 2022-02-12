import java.util.Arrays;
import java.util.Comparator;

/**
 * 452. 用最少数量的箭引爆气球
 * 在二维空间中有许多球形的气球。对于每个气球，提供的输入是水平方向上，气球直径的开始和结束坐标。由于它是水平的，所以纵坐标并不重要，因此只要知道开始和结束的横坐标就足够了。开始坐标总是小于结束坐标。
 *
 * 一支弓箭可以沿着 x 轴从不同点完全垂直地射出。在坐标 x 处射出一支箭，若有一个气球的直径的开始和结束坐标为 xstart，xend， 且满足  xstart ≤ x ≤ xend，则该气球会被引爆。可以射出的弓箭的数量没有限制。 弓箭一旦被射出之后，可以无限地前进。我们想找到使得所有气球全部被引爆，所需的弓箭的最小数量。
 *
 * 给你一个数组 points ，其中 points [i] = [xstart,xend] ，返回引爆所有气球所必须射出的最小弓箭数。
 */
public class Q452 {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points, new Comparator<int[]>() {
            @Override
            public int compare(int[] c1, int[] c2) {
                return c1[1] > c2[1] ? 1 : -1;
            }
        });
        int[] temp = points[0];
        int res = 1;
        for (int i = 1; i < points.length; i++) {
            if (points[i][0] > temp[1]) {
                temp = points[i];
                res++;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        new Q452().findMinArrowShots(new int[][]{
                {0,3}, {1,2}, {-1,2},{0,2}});
    }
}
