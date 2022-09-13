import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * @program: MiddleOrderTraversalOfBinaryTree
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-07 15:50
 **/


public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode();
        TreeNode root = new TreeNode();
        root.val=1;
        root.left=null;
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        treeNode.inorderTraversal(root);
    }

    public List<Integer> inorderTraversal(TreeNode root) {
//        存储结果
        List<Integer> list = new ArrayList<>();
//        存储需要回退的节点
        Stack<TreeNode> stack = new Stack<>();
        TreeNode cur = root;
//        如果不等于null
        while (cur != null || !stack.isEmpty()) {
            if (cur != null) {
//                就把栈中放一个值
                stack.push(cur);
//                并且指向它的left
                cur = cur.left;
            } else {
                cur = stack.pop();
                list.add(cur.val);
                cur = cur.right;
            }
        }
        return list;
    }
}
