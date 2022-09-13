import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[] nums=new int[]{4,2,3};
//        int[] nums=new int[]{-2,9,9,8,4};
//        int[] nums=new int[]{3,-1,0,2};
//        int[] nums=new int[]{5,6,9,-3,3};
//        int[] nums=new int[]{-8,3,-5,-3,-5,-2};
//        int[] nums=new int[]{8,-7,-3,-9,1,9,-6,-9,3};
//        int[] nums=new int[]{2,-3,-1,5,-4};
        int[] nums=new int[]{-4,-2,-3};
        System.out.println(myTest.largestSumAfterKNegations(nums, 4));

    }

    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum = 0;
        Arrays.sort(nums);
        int index = 0;
        Boolean flag = true;
        for (int i = 0; i < k; i++) {
            if (k<)
            if (nums[i] < 0) {
                nums[i]=Math.abs(nums[i]);
                sum +=nums[i];
            } else if (nums[i] == 0) {
                break;
            } else {
                if ((k - i) % 2 != 0) {
                    flag = false;
                }
                break;
            }
            index++;
        }
        for (int i=index;i<nums.length;i++){
            sum+=nums[i];
        }
        Arrays.sort(nums);
        return flag==true?sum:sum-nums[0]*2;
    }
}
