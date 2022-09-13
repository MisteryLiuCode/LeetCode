import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @program: SumOfUniqueElements
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-06 15:33
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,1,1,1,1};
        System.out.println(myTest.sumOfUnique(nums));

    }
    public int sumOfUnique(int[] nums) {
        int result=0;
        HashSet<Integer> integers = new HashSet<>();
        HashSet<Integer> surplus = new HashSet<>();
        for (int i=0;i<nums.length;i++){
            if (integers.add(nums[i])){
                result+=nums[i];
            }
            else {
                surplus.add(nums[i]);
            }
        }
        Iterator iterator =surplus.iterator();
        while (iterator.hasNext()) {
            result-=(Integer)iterator.next();
        }
        return result;
    }
}
