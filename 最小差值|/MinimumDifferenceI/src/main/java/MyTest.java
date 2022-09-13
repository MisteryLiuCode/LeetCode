import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {

    }

    public int smallestRangeI(int[] nums, int k) {
        Arrays.sort(nums);
        int res = nums[nums.length - 1] - nums[0];
        int different = res - 2 * k;
        if (different < 0) {
            return 0;
        }
        return different;
    }


}
