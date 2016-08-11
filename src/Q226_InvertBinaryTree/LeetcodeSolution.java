package Q226_InvertBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by marklee on 8/10/16.
 */
public class LeetcodeSolution {
    /**
     * Approach #1 (Recursive)
     */
    public TreeNode invertTree1(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode right = invertTree1(root.right);
        TreeNode left = invertTree1(root.left);
        root.left = right;
        root.right = left;
        return root;
    }

    /**
     * Approach #2 (Iterative)
     */
    public TreeNode invertTree2(TreeNode root) {
        if (root == null) return null;
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode current = queue.poll();
            TreeNode temp = current.left;
            current.left = current.right;
            current.right = temp;
            if (current.left != null) queue.add(current.left);
            if (current.right != null) queue.add(current.right);
        }
        return root;
    }
}
