/**
 * 剑指 Offer II 052. 展平二叉搜索树
 * 给你一棵二叉搜索树，请 按中序遍历 将其重新排列为一棵递增顺序搜索树，使树中最左边的节点成为树的根节点，并且每个节点没有左子节点，只有一个右子节点。
 */
public class offer52 {
    // 跑不通啊啊啊啊
    TreeNode result;
    boolean flag = false;
    public TreeNode increasingBST(TreeNode root) {
        increasing(root);
        return result;
    }
    public TreeNode increasing(TreeNode root) {
        if (root == null) return null;
        if (root.left != null) {
            System.out.println(root.val);
            TreeNode treeNode = increasing(root.left);
            if (!flag) {
                result = treeNode;
                flag = true;
            }
            treeNode.right = root;
            treeNode.left = null;
        }
        if (root.right != null) {
            root.right = increasing(root.right);
            root.left = null;
        }
        return root.right != null ? root.right : root;
    }
}
class offer52_second{
    private TreeNode resNode;

    public TreeNode increasingBST(TreeNode root) {
        TreeNode dummyNode = new TreeNode(-1);
        resNode = dummyNode;
        inorder(root);
        return dummyNode.right;
    }

    public void inorder(TreeNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);

        // 在中序遍历的过程中修改节点指向
        resNode.right = node;
        node.left = null;
        resNode = node;

        inorder(node.right);
    }
}




