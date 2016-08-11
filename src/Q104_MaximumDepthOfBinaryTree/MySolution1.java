package Q104_MaximumDepthOfBinaryTree;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Given a binary tree, find its maximum depth.
 * <p>
 * The maximum depth is the number of nodes along the longest path from the
 * root node down to the farthest leaf node.
 */
public class MySolution1 {
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }

}
