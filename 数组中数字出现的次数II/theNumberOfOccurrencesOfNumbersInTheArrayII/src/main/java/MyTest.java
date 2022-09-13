import java.util.Arrays;

/**
 * @program: theNumberOfOccurrencesOfNumbersInTheArrayII
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-07 17:25
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,4,3,3};
        System.out.println(myTest.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
//        对数组进行排序
        int result=0;
        Arrays.sort(nums);
//        对nums进行循环
        for (int i=0;i<nums.length-2;i=i+3){
//            因为三个中只有一个不一样，那么不是第一个就是最后一个
            if (nums[i]!=nums[i+1] || nums[i+1]!=nums[i+2]){
                if (nums[i]!=nums[i+1]){
                   result=nums[i];
                   break;
                }
                else {
                   result=nums[i+2];
                   break;
                }
            }
        }
//        因为必然有答案，如果遍历到最后还是0，那么说明答案就是最后一个
        if (result==0){
            result=nums[nums.length-1];
        }
        return result;
    }
}
