package Trees;

public class PostorderTraversal {

    static void postorder(TreeNode root) {
        if (root == null) {
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.println(root.data + " ");
    }

    public static void main(String[] args) {
        TreeNode root = new Treenode(50);
        root.left = new TreeNode(30);
        root.right = new TreeNode(40);
        root.left.left = new TreeNode(10);
        root.left.right = new TreeNode(20);
        System.out.print("Postorder Traversal:");
        postorder(root);
    }
}
