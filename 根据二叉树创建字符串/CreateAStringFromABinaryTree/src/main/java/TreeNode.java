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
        TreeNode myTest = new TreeNode();
        TreeNode treeNode = new TreeNode(1);

        treeNode.left=new TreeNode(2);
        treeNode.left.right=new TreeNode(4);
        treeNode.left.left=null;
        treeNode.right=new TreeNode(3);
        String s = myTest.tree2str(treeNode);
        System.out.println(s);
    }

    public String tree2str(TreeNode t) {
        StringBuilder sb = new StringBuilder();
        doTree2str(t, sb);
        return sb.toString();
    }

    private void doTree2str(TreeNode t, StringBuilder sb) {
//        做校验，如果t不等于null
        if (t != null) {
//            字符串进行拼接
            sb.append(t.val);
//            判断如果任意一个不为null
            if (t.left != null || t.right != null) {
//                如果节点下面还有节点，就拼接一个左括号
                sb.append('(');
//                一直找左节点，继续拼接
                doTree2str(t.left, sb);
//                找到最后一个左节点，拼接右括号
                sb.append(')');
//                如果这个节点的右节点不为null
                if (t.right != null) {
//                    拼接左括号
                    sb.append('(');
//                    一直找右节点的最后一个节点
                    doTree2str(t.right, sb);
                    sb.append(')');
                }
            }
        }
    }
}
