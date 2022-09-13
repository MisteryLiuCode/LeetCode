import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @program: MostElements
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-06 19:50
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr = new int[]{3, 2, 3};
        System.out.println(myTest.majorityElement(arr));
    }

    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> integerIntegerHashMap = new HashMap<>();
//        遍历数组,如果里面hashmap里面的数据包括数组里面的，那么就把value加一
//        否则创建一个新的key，val是1
        for (int i = 0; i < nums.length; i++) {
            if (integerIntegerHashMap.containsKey(nums[i])) {
                Integer value = integerIntegerHashMap.get(nums[i]);
                value++;
                integerIntegerHashMap.put(nums[i], value);
            } else {
                integerIntegerHashMap.put(nums[i], 1);
            }
        }

//        对hashmap进行取值如果大于num.length/2那么就返回
        int result = 0;
        for (Integer key : integerIntegerHashMap.keySet()) {
            Integer value = integerIntegerHashMap.get(key);
            if (value > nums.length / 2) {
                result = key;
            }
        }
        return result;
    }
}
