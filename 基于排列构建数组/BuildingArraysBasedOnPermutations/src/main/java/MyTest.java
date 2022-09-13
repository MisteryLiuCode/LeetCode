/**
 * @program: BuildingArraysBasedOnPermutations
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-30 23:09
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{0,2,1,5,3,4};
        myTest.buildArray(nums);
    }

    public int[] buildArray(int[] nums) {
//        创建数据
        int[] result=new int[nums.length];
//        遍历数组装填数据
        for (int i = 0; i < nums.length; i++) {
            result[i]=nums[nums[i]];
        }
        return result;
    }

}
