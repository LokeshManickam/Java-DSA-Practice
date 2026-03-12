package Trees;

public class LowestCommonAncestor {

    static TreeNode LCA(TreeNode root, int p, int q) {
        if (root == null) {
            return null;
        }
        if (root.data == p || root.data == q) {
            return root;
        }
        TreeNode left = LCA(root.left, p, q);
        TreeNode right = LCA(root.right, p, q);
        if (left != null && right != null) {
            return root;
        }
        if (left != null) {
            return left;
        }
        return right;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        root.right = new TreeNode(30);
        root.left.left = new TreeNode(40);
        root.left.right = new TreeNode(50);
        TreeNode result = LCA(root, 40, 50);
        System.out.println("LCA: " + result.data);
    }
}
