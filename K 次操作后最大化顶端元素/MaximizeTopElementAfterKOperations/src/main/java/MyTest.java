import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{35, 43, 23, 86, 23, 45, 84, 2, 18, 83, 79, 28, 54, 81, 12, 94, 14, 0, 0, 29, 94, 12, 13, 1, 48, 85, 22, 95, 24, 5, 73, 10, 96, 97, 72, 41, 52, 1, 91, 3, 20, 22, 41, 98, 70, 20, 52, 48, 91, 84, 16, 30, 27, 35, 69, 33, 67, 18, 4, 53, 86, 78, 26, 83, 13, 96, 29, 15, 34, 80, 16, 49};
        System.out.println(myTest.maximumTop(nums, 15));
    }

    public int maximumTop(int[] nums, int k) {
        if (nums.length == 1 && k % 2 == 1) {
            return -1;
        }
        int result = 0;
        int[] out = new int[nums.length];
        if (k - 1 <= nums.length) {
            for (int i = 0; i < k - 1; i++) {
                out[i] = nums[i];
            }
//        对out排序
            Arrays.sort(out);
//        对nums排序
            if (nums.length > k && out[out.length - 1] < nums[k]) {
                result = nums[k];
            } else {
                result = out[out.length - 1];
            }
        } else {
//            对nums排序
            Arrays.sort(nums);
            result = nums[nums.length - 1];
        }
        return result;
    }


}