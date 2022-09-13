/**
 * @program: MaximumDifferenceBetweenIncrementalElements
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-26 15:41
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{7,1,5,4};
        System.out.println(myTest.maximumDifference(nums));
    }
    public int maximumDifference(int[] nums) {
        int max=-1;
//        对数组进行循环
        for (int i=0;i<nums.length;i++){
            for (int j=i;j< nums.length;j++){
                if (nums[j]-nums[i]>max){
                    max=nums[j]-nums[i];
                }
            }
        }
        if (max==0){
            return -1;
        }
        return max;
    }


}
