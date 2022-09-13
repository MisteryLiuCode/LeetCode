/**
 * @program: RemoveDuplicatesFromAnOrderedArray
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-20 18:54
 **/


public class MyTest {
    public static void main(String[] args) {
        int[] nums = new int[]{0,0,1,1,1,2,2,3,3,4};
        MyTest myTest = new MyTest();
        int i = myTest.removeDuplicates(nums);
        System.out.println(i);
    }
    public int removeDuplicates(int[] nums) {
//        如果长度只有1，那么不会有重复的，直接返回
        if (nums.length < 2) {
            return nums.length;
        }
//        定义指针
        int temp = 0;
        for (int i = 1; i < nums.length; i++) {
//            如果小于的话，那么就赋值给当前排序好的数组后面的值
            if (nums[temp] < nums[i]) {
                nums[++temp] = nums[i];
            }
        }
        return ++temp;
    }
}
