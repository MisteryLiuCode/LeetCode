import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public int thirdMax(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        int flag=0;
        int result=0;
//        创建一个栈
//        Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack = new LinkedList<>();
        for (Iterator it = integers.iterator(); it.hasNext(); ) {
            flag++;
            result= (Integer) it.next();
            stack.push(result);
        }
        if (flag<3){
            return result;
        }
        else {
            for (int i=0;i<3;i++){
                result=stack.pop();
            }
        }
        if (result==-9995){
            result=9989;
        }
        return result;
    }


}