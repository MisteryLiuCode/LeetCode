import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: SumOfTheNearestThree
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-26 19:21
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2,4,8,16,32,64,128};
        System.out.println(myTest.threeSumClosest(nums, 82));
    }

    public int threeSumClosest(int[] nums, int target) {
//        数组排序
        Arrays.sort(nums);
//        定义两个指针
        int begin=0;
        int end=0;

//        初始化sum值
        int sum=0;
//        结果
        int result=0;
        //        初始化min的值
        int min=Math.abs(sum-target);
//        数组遍历
        for (int i=0;i<nums.length-2;i++){
//            重置数组
            begin=i+1;
            end=nums.length-1;
            while (begin<end){
                sum=nums[begin]+nums[i]+nums[end];
//                如果满足条件更新result的值
                if (min>=Math.abs(nums[begin]+nums[i]+nums[end]-target)){
                    result=nums[begin]+nums[i]+nums[end];
                    min=Math.abs(sum-target);
                }

//                指针移动
               if (sum>target){
                   end--;
                   continue;
               }
                if (sum<target){
                    begin++;
                    continue;
                }
//                等于0的时候直接返回
                if (min==0){
                    return target;
                }
            }
        }
        return result;
    }
}
