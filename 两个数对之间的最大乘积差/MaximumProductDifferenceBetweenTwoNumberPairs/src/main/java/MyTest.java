import java.util.Arrays;

/**
 * @program: MaximumProductDifferenceBetweenTwoNumberPairs
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-17 21:40
 **/


public class MyTest {

    public int maxProductDifference(int[] nums) {
//        对数组进行排序
        Arrays.sort(nums);
//        计算前两个和后两个的平方差值
        return nums[nums.length-1]*nums[nums.length-2]-nums[0]*nums[1];
    }
}
