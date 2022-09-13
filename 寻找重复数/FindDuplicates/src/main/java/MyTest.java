import java.util.HashSet;

public class MyTest {


    public int findDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.add(nums[i])){
                return nums[i];
            }
        }
        return 0;
    }
}
