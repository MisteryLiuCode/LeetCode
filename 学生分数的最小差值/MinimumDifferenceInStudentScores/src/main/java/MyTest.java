import java.util.Arrays;

/**
 * @program: MinimumDifferenceInStudentScores
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-07 18:14
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{9,4,1,7};
        System.out.println(myTest.minimumDifference(nums, 2));
    }

    public int minimumDifference(int[] nums, int k) {
//        对数组排序
        int min=1000000;
        Arrays.sort(nums);
        for (int i=0;i<nums.length-k+1;i++){
            min=(nums[i+k-1]-nums[i])>min?min:(nums[i+k-1]-nums[i]);
        }
        return min;
    }
}
