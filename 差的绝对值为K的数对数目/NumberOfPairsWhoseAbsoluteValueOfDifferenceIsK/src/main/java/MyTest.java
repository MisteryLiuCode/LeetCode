/**
 * @program: NumberOfPairsWhoseAbsoluteValueOfDifferenceIsK
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-09 11:43
 **/


public class MyTest {

    public int countKDifference(int[] nums, int k) {
        int left=0;
        int right=nums[nums.length-1];
        int result=0;
        for (int i=0;i<nums.length;i++){
                if (Math.abs(nums[left]-nums[right])==k){
                    result++;
                }
                
            }

        return result;
    }


}
