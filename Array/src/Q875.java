/**
 * 875. 爱吃香蕉的珂珂
 * 珂珂喜欢吃香蕉。这里有 N 堆香蕉，第 i 堆中有 piles[i] 根香蕉。警卫已经离开了，将在 H 小时后回来。
 *
 * 珂珂可以决定她吃香蕉的速度 K （单位：根/小时）。每个小时，她将会选择一堆香蕉，从中吃掉 K 根。如果这堆香蕉少于 K 根，她将吃掉这堆的所有香蕉，然后这一小时内不会再吃更多的香蕉。
 *
 * 珂珂喜欢慢慢吃，但仍然想在警卫回来前吃掉所有的香蕉。
 *
 * 返回她可以在 H 小时内吃掉所有香蕉的最小速度 K（K 为整数）
 */
public class Q875 {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = Integer.MIN_VALUE;
        for (int pile : piles) {
            right = Math.max(right, pile);
        }
        right++;
        while (left < right) {
            int mid = left + (right - left) / 2;
            if (time(mid, h, piles)) right = mid;
            else left = mid + 1;
        }
        return right;
    }
    public boolean time(int k, int h, int[] piles) {
        int sum = 0;
        for (int pile : piles) {
            if (pile % k == 0) sum += pile / k;
            else sum += pile / k + 1;
        }
        return sum <= h;
    }
}
