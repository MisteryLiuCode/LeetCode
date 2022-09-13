/**
 * @program: MaximumSubarraySum
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-08 14:49
 **/


public class MyTest {
    public static void main(String[] args) {
        int[] arr=new int[]{-2,1,-3,4,-1,2,1,-5,4};
        int i = maxSubArray(arr);
        System.out.println(i);
    }
    public static int maxSubArray(int[] nums) {
//        设置一个数用来保存历史最大值。
//        设max为第一个值
        int max=nums[0];
        int high=0;
        for (int i = 0; i < nums.length; i++) {
//            判断high是否大于0，如果大于0，则可以继续对high进行相加
            if (high>=0){
//                对high进行相加
                high+=nums[i];
//                相加完之后判断high比当前的max大，如果大，则替换。
            }
            else {
//                如果high当前小于0，则丢弃之前的计算值，使high等于当前值
                high=nums[i];
            }

//            每一轮循环之后判断此时max和high的大小，看是否需要进行替换
//                使high值为当前值，这时要判断当前的high值是否比max值大
            if (max<high) {
                max = high;
            }
        }
        return max;
    }
}
