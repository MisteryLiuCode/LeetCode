import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

/**
 * @program: DuplicateElements
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-28 17:51
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{0, 1, 10 ^ -8 - 1, 10 ^ -8};
        System.out.println(myTest.containsDuplicate(nums));

    }

    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> integers = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (!integers.add(nums[i])) {
                return true;
            }
        }
        return false;
    }
}
