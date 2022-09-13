import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int arrayPairSum(int[] nums) {
        int res=0;
//        排序，奇位相加
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i=i+2) {
            res+=nums[i];
        }
        return res;
    }

}
