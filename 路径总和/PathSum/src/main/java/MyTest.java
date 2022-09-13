class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        val=this.val;
    }
    public TreeNode(TreeNode left,TreeNode right,int val){
        val=this.val;
        left=this.left;
        right=this.right;
    }

    public boolean hasPathSum(TreeNode root, int targetSum) {
//        如果等于null，就返回false
        if (root==null){
            return false;
        }
//        如果左右都为null
        if (root.left==null && root.right==null){
            return root.val==targetSum;
        }
//        相减
        targetSum-=root.val;
        return hasPathSum(root.left,targetSum) || hasPathSum(root.right,targetSum);
    }

}
