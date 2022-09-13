import java.util.Arrays;

/**
 * All rights Reserved, Designed By jiexingcloud.
 *
 * @author 刘帅彪
 * @Date2022/9/10 19:34
 * Copyright ©2022 jiexingcloud. All rights reserved.
 * 注意：本内容仅限于结行云创内部传阅，禁止外泄以及用于其他的商业用途。
 */

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{4,2,3,4};
        System.out.println(myTest.triangleNumber(nums));
    }

    public int triangleNumber(int[] nums) {
//        排序
        Arrays.sort(nums);
        int res=0;
//         所有的遍历其实就是选择固定的数
        for (int i=nums.length-1;i>1;i--){
//            初始化l=0,r=固定数的前一位
            int l=0;
            int r=i-1;
            while (l<r){
                if (nums[l]+nums[r]>nums[i]) {
                    res += r - l;
                    r--;
                }else {
                    l++;
                }
            }
        }
        return res;
    }



}
