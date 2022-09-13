import java.util.Arrays;
import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] temperatures=new int[]{73,74,75,71,69,72,76,73};
        System.out.println(Arrays.toString(myTest.dailyTemperatures(temperatures)));
    }

    /**
     * 单调栈，栈内顺序要么从大到小 要么从小到大,本题从大到笑
     * <p>
     * 入站元素要和当前栈内栈首元素进行比较
     * 若大于栈首则 则与元素下标做差
     * 若大于等于则放入
     *
     * @param temperatures
     * @return
     */
    public  int[] dailyTemperatures(int[] temperatures) {
//        creat res
        int[] res=new int[temperatures.length];
//        creat Stack
        Stack<Integer> stack = new Stack<>();

//        for temperatures
        for (int i=0;i< temperatures.length;i++){
            while (!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int index=stack.pop();
                res[index]=i-index;
            }
            stack.push(i);
        }
        return res;
    }


}
