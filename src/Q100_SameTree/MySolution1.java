package Q100_SameTree;
/**
 * Created by marklee on 8/11/16.
 * <p>
 * Given two binary trees, write a function to check if they are equal or not.
 * <p>
 * Two binary trees are considered equal if they are structurally identical
 * and the nodes have the same value.
 */
public class MySolution1 {
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null || q == null) {
            return p == q;
        }
        if (p.val == q.val && isSameTree(p.right, q.right) &&
                isSameTree(p.left, q.left)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        node1.left = node2;
        node1.right = node3;
        node2.left = node3;
        node2.right = node4;
        System.out.println(isSameTree(node1, node2));

    }
}
