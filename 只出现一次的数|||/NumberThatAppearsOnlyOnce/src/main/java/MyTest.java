import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{0,1};
        System.out.println(Arrays.toString(myTest.singleNumber(nums)));
    }

    public int[] singleNumber(int[] nums) {
//        排序
        Arrays.sort(nums);
        List integers = new ArrayList<>();
//        步长为2的跳跃
        for (int i = 0; i < nums.length-1; i=i+2) {
//            如果两个数不相等
            if (nums[i]!=nums[i+1]){
//                则添加进去
                integers.add(nums[i]);
                i-=1;
            }
        }
//        如果最后两个数不相等，则需要把最后一个数添加进去
        if (nums[nums.length-2]!=nums[nums.length-1]){
            integers.add(nums[nums.length-1]);
        }
        int[] result=new int[integers.size()];
//        循环添加进数组
        for (int i = 0; i < integers.size(); i++) {
            result[i]= (int) integers.get(i);
        }
        return result;
    }


}