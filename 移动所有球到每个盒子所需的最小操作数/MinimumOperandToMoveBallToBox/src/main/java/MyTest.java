import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @program: MinimumOperandToMoveBallToBox
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-22 13:52
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String s="001011";
        int[] ints = myTest.minOperations(s);
        System.out.println(Arrays.toString(ints));

    }
    public int[] minOperations(String boxes) {
//        创建LinkList保存每一个1的位置
        List<Integer> everyOne = new ArrayList<>();
        for (int i=0;i<boxes.length();i++){
            if (boxes.charAt(i)=='1'){
                everyOne.add(i);
            }
        }
        int[] result=new int[boxes.length()];
//        两重循环，相减取绝对值
        int sum=0;
        for (int i=0;i<boxes.length();i++){
            sum=0;
            for (int j = 0; j < everyOne.size(); j++) {
                sum+=Math.abs(everyOne.get(j)-i);
            }
            result[i]=sum;
        }
        return result;
    }
}
