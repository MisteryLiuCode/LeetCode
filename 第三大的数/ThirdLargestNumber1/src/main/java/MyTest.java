import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @program: ThirdLargestNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-14 18:52
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{1,2,-2147483648};
        System.out.println(myTest.thirdMax(nums));
    }


    public int thirdMax(int[] nums) {
        int count = 0;
        HashSet<Integer> integers = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            integers.add(nums[i]);
        }
        List list = new ArrayList(integers);

        if (integers.size() > 2) {
            return (int) list.get(list.size() - 3);
        }
        else   {
            return (int) list.get(list.size() - 1);
        }
    }


//        int result=0;
////        对数组进行排序
//        Arrays.sort(nums);
//        if (nums.length<3){
//            if (nums.length==1){
//                return nums[0];
//            }
//            else {
//                return nums[1];
//            }
//        }
////        设置两个指针
//        int count=0;
//        int left=0;
//        int right=1;
////        对数组进行遍历
//        for(int i=0;i<nums.length;i++){
//            if (nums[left]==nums[right]){
//                right++;
//            }
//            else {
//                count++;
//                if (count==2){
//                    return nums[right];
//                }
//                left=right;
//                right++;
//            }
//
//        }
//        return result;
//    }

}
