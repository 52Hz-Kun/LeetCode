/**
 * 1011. 在 D 天内送达包裹的能力
 * 传送带上的包裹必须在 days 天内从一个港口运送到另一个港口。
 *
 * 传送带上的第 i 个包裹的重量为 weights[i]。每一天，我们都会按给出重量（weights）的顺序往传送带上装载包裹。我们装载的重量不会超过船的最大运载重量。
 *
 * 返回能在 days 天内将传送带上的所有包裹送达的船的最低运载能力。
 */
public class Q1011 {
    public int shipWithinDays(int[] weights, int days) {
        int[] sum = new int[weights.length + 1];
        for (int i = 1; i < sum.length; i++) {
            sum[i] = sum[i - 1] + weights[i - 1];
        }
        int left = Integer.MIN_VALUE;
        int right = 0;
        for (int weight : weights) {
            left = Math.max(left, weight);
            right += weight;
        }
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (countDay(mid, days, sum)) right = mid;
            else left = mid + 1;
        }
        return right;

    }
    public boolean countDay(int mid, int days, int[] sum) {
        int left = 0;
        int right = 1;
        int count = 0;
        while (right < sum.length) {
            if (sum[right] - sum[left] > mid) {
                left = right - 1;
                count++;
            } else {
                right++;
            }
        }
        return count + 1 <= days;
    }

    public static void main(String[] args) {
        int i = new Q1011().shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        System.out.println(i);
    }
}
