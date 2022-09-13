import java.util.ArrayList;
import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{3, 1, -2, -5, 2, -4};
        System.out.println(Arrays.toString(myTest.rearrangeArray(nums)));
    }


    public int[] rearrangeArray1(int[] nums) {
//        两个list，一个存储证书
        ArrayList<Integer> positiveNumberlist = new ArrayList<>();
        ArrayList<Integer> negativeNumberlist = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] >= 0) {
                positiveNumberlist.add(nums[i]);
            } else if (nums[i] < 0) {
                negativeNumberlist.add(nums[i]);
            }
        }
        for (int i = 0; i < nums.length; i++) {
            if (i % 2 == 0) {
                nums[i] = positiveNumberlist.get(i / 2);
            } else {
                nums[i] = negativeNumberlist.get(i / 2);
            }
        }
        return nums;
    }

    public int[] rearrangeArray(int[] nums) {
//        两个list，一个存储证书
        int left = 0;
        int right = 1;
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n >= 0) {
                res[left] = n;
                left += 2;
            } else {
                res[right] = n;
                right += 2;
            }
        }
        return res;
    }

}
