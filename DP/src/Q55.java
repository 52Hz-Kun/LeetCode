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

    public static void main(String[] args) {
        int[] nums = new int[]{3, 2, 1, 0, 4};
        Q55 q55 = new Q55();
        boolean b = q55.canJump(nums);
        System.out.println(b);
    }
}
