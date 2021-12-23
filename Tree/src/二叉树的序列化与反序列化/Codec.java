package 二叉树的序列化与反序列化;

import java.util.*;

public class Codec {

    // Encodes a tree to a single string.
    public String serialize(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<String> list = new ArrayList<>();
        if (root == null) return null;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = size; i > 0; i--) {
                TreeNode node = queue.poll();
                list.add(node == null ? "null" : String.valueOf(node.val));
                if (node != null){
                    queue.offer(node.left);
                    queue.offer(node.right);
                }
            }
        }
        return Arrays.toString(list.toArray());
    }

    // Decodes your encoded data to tree.
    public TreeNode deserialize(String data) {
        if(data.equals("[]")) return null;
        String[] split = data.split(",");
        System.out.println(Arrays.toString(split));
        TreeNode root = new TreeNode(Integer.parseInt(split[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if(!split[i].equals("null")) {
                node.left = new TreeNode(Integer.parseInt(split[i]));
                queue.add(node.left);
            }
            i++;
            if(!split[i].equals("null")) {
                node.right = new TreeNode(Integer.parseInt(split[i]));
                queue.add(node.right);
            }
            i++;
        }
        return root;
    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
