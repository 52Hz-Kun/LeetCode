/**
 * 路径总和3
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 *
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/path-sum-iii
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Q437 {
    int result = 0;
    public int pathSum(TreeNode root, int targetSum) {
        sum(root, new ArrayList<>(), targetSum);
        return result;
    }

    public void sum(TreeNode node, ArrayList<Integer> list, int target){
        if (node == null) return;
        ArrayList<Integer> now = new ArrayList<>();
        now.add(node.val);
        System.out.println(list.size());
        for (int i = 0; i < list.size(); i++) {
            now.add(node.val + list.get(i));

        }
        for (int i = 0; i < now.size(); i++) {
            if (now.get(i) == target) result++;
        }
        if (node.left != null) sum(node.left, now, target);
        if (node.right != null) sum(node.right, now, target);
    }
}

class Q437_second {
    public int pathSum(TreeNode root, int targetSum) {
        HashMap<Long, Integer> prefix = new HashMap<>();
        prefix.put(0L, 1);
        return dfs(root, prefix, 0, targetSum);
    }

    public int dfs(TreeNode root, Map<Long, Integer> prefix, long curr, int targetSum) {
        if (root == null) {
            return 0;
        }

        int ret = 0;
        curr += root.val;

        ret = prefix.getOrDefault(curr - targetSum, 0);
        prefix.put(curr, prefix.getOrDefault(curr, 0) + 1);
        ret += dfs(root.left, prefix, curr, targetSum);
        ret += dfs(root.right, prefix, curr, targetSum);
        prefix.put(curr, prefix.getOrDefault(curr, 0) - 1);

        return ret;
    }
}
