import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{5,6};
        System.out.println(myTest.minimalKSum(nums, 6));
    }

    public long minimalKSum(int[] nums, int k) {
        int a = 1;
//        使用TreeSet去重并且排序
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0;i<nums.length;i++){
            set.add(nums[i]);
        }
        long result = 0;
        int temp=0;

        while (!set.isEmpty() && k>0 ){
            int j=set.pollFirst();
            for (int i=temp+1;i<j;i++){
                result+=i;
                k--;
            }
            temp=j;
        }
        for (int i = 0; i < k; i++) {
            result += temp + i + 1;
        }
        return result;
    }
}


