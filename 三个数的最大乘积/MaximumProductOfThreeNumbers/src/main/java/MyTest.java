import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        return Math.max(nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3],nums[nums.length-1]*nums[0]*nums[1]);
    }


}
