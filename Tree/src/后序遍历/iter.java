package 后序遍历;

import java.util.*;


public class iter {
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        while (root != null || !stack.isEmpty()) {
            // 插入到list的最前方，然后先遍历右子树
            if (root != null) {
                list.add(0, root.val);
                stack.push(root);
                root = root.right;
            } else {
                // 再用栈进行回溯，遍历左子树
                TreeNode temp = stack.pop();
                root = temp.left;
            }
        }
        return list;
    }
}