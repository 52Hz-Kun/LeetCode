package 打家劫舍3;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * 此代码有误，需要用到后序遍历和动态规划
 */
public class Solution {
    public int rob(TreeNode root) {
        ArrayList<Integer> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) return 0;
        queue.offer(root);
        while (!queue.isEmpty()){
            int sum = 0;
            for (int i = queue.size(); i > 0; i--) {
                TreeNode poll = queue.poll();
                sum += poll.val;
                if (poll.left != null) queue.offer(poll.left);
                if (poll.right != null) queue.offer(poll.right);
            }
            list.add(sum);
        }

        if (list.size() == 1) return list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (i == 1) list.set(1, Math.max(list.get(0), list.get(1)));
            if (i > 1) {
                int yes = list.get(i) + list.get(i - 2);
                int no = list.get(i - 1);
                list.set(i, Math.max(yes, no));
            }
        }
        return list.get(list.size() - 1);
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
