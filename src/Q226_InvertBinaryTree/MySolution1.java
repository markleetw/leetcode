package Q226_InvertBinaryTree;

/**
 * Created by marklee on 8/10/16.
 * <p>
 * Invert a binary tree.
 * <p>
 *       4
 *     /   \
 *    2     7
 *   / \   / \
 * 1   3 6   9
 * to
 *       4
 *     /   \
 *    7     2
 *   / \   / \
 *  9   6 3   1
 *
 *  Good job.
 *  0ms, 18.60%
 */
public class MySolution1 {
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode tmp = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(tmp);
        return root;
    }
}
