/**
 * 跳跃游戏
 */
public class Q55 {
    public boolean canJump(int[] nums) {
        if (nums == null || nums.length == 0) return false;
        boolean[] res = new boolean[nums.length];
        res[0] = true;
        for (int i = 0; i < nums.length; i++) {
            if (res[i]) {
                int L = Math.min(i + nums[i], nums.length - 1);
                for (int j = 0; j <= L - i; j++) {
                    res[i + j] = true;
                }
            }
        }
        return res[res.length - 1];
    }
    // 2022.2.11第二次做，打算用贪心,我真是垃圾！！！算法是错的
    public boolean canJump2(int[] nums) {
        int i = 0;
        if (i == nums.length - 1) return true;
        int mx = 0;
        while (nums[i] != 0) {
            for (int j = 0; j < nums[i] + 1; j++) {
                mx = Math.max(i + j + nums[i + j], mx);
                if (mx >= nums.length - 1) return true;
            }
            i = mx;
        }
        return false;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{5,9,3,2,1,0,2,3,3,1,0,0};
        Q55 q55 = new Q55();
        boolean b = q55.canJump2(nums);
        System.out.println(b);
    }
}
