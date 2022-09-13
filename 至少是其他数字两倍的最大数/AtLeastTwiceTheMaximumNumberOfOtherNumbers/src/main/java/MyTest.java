import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{3, 6, 1, 0};
        System.out.println(myTest.dominantIndex(nums));
    }

    public int dominantIndex1(int[] nums) {
        int[] cloneNums = nums.clone();
        Arrays.sort(nums);
        if (nums.length < 2) {
            return 0;
        }
        if (nums[nums.length - 1] >= nums[nums.length - 2] * 2) {
            for (int i = 0; i < cloneNums.length; i++) {
                if (cloneNums[i] == nums[nums.length - 1]) {
                    return i;
                }
            }
        } else {
            return -1;
        }
        return 0;
    }

    public int dominantIndex(int[] nums) {
        if (nums.length < 2) {
            return 0;
        }
        int max = 0, idx = 0, less = 1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > max) {
                less = max;
                max = nums[i];
                idx = i;
            } else if (nums[i] > less) {
                less = nums[i];
            }
        }
        return max >= (less * 2) ? idx : -1;
    }


}
