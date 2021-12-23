package 中序遍历;



import java.util.ArrayList;
import java.util.List;

public class recur {
    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        rec(root,res);
        return res;
    }
    public void rec(TreeNode root, ArrayList<Integer> list){
        if (root == null) return;

        rec(root.left, list);
        list.add(root.val);
        rec(root.right, list);
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
