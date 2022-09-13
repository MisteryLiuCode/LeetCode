import java.util.Arrays;
import java.util.HashMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{8, 1, 2, 2, 3};
        System.out.println(Arrays.toString(myTest.smallerNumbersThanCurrent(nums)));
    }

    public int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] res = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int k = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    k++;
                }
            }
            res[i] = k;
        }
        return res;
    }

    //    使用HashMap计算每一个数字前面有几个比它小的数
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res = nums.clone();
        Arrays.sort(res);
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < res.length; i++) {
            if (!map.containsKey(res[i])) {
                map.put(res[i], i);
            }
        }
        for (int j = 0; j < nums.length; j++) {
            nums[j] = map.get(nums[j]);
        }
        return nums;
    }

}
