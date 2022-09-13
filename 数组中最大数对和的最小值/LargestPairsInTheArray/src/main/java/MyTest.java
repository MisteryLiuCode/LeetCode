import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Map;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/9/5 18:14
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,5,2,3};
        System.out.println(myTest.minPairSum(nums));

    }


    public int minPairSum(int[] nums) {
        Arrays.sort(nums);
        int res=0;
        int left=0;
        int right=nums.length-1;
        while (left<right){
            res= Math.max(nums[left]+nums[right],res);
            left++;
            right--;
        }
        return res;
    }


}
