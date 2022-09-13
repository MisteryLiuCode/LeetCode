import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public List<Integer> preorderTraversal(TreeNode root) {
//        创建结果集
        ArrayList<Integer> res = new ArrayList<>();
        pre(root,res);
        return res;
    }
    public void pre(TreeNode root,List<Integer> res){
        Stack<ListNode> stack = new Stack<>();
        while (root!=null || !stack.isEmpty()){
            while (root !=null){
//                把这个节点加入结果集和栈中，并且一直往左边遍历
                res.add(root.val);
                stack.add(root);
                root=root.left;
            }
            root=stack.pop().right;
        }


    }

}
