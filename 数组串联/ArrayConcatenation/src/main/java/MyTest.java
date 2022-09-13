/**
 * @program: ArrayConcatenation
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-30 23:21
 **/


public class MyTest {

    public int[] getConcatenation(int[] nums) {
        int[] result=new int[nums.length*2];
        for (int i=0;i<nums.length;i++){
            result[i]=nums[i];
            result[i+ nums.length]=nums[i];
        }
        return result;
    }
}
