import java.util.Arrays;

/**
 * @program: DynamicSumOfDimensionGroups
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-11 18:29
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,1,2,10,1};
        System.out.println(Arrays.toString(myTest.runningSum(nums)));
    }

    public int[] runningSum(int[] nums) {
        for(int i=1 ; i<nums.length; ++i){
            nums[i] +=nums[i-1];
        }
        return nums;
    }
}
