import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums = new int[]{2, 2, 2, 2, 2};
        System.out.println(myTest.findKDistantIndices(nums, 2, 2));
    }

    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        /*存储结果*/
        List<Integer> result = new ArrayList<>();
        /*
         * 对数组进行遍历，找到等于key的下标
         * 长度不确定，使用Araaylist存储
         * */
        List<Integer> index = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == key) {
                index.add(i);
            }
        }
//        对下标的list遍历
//        hashSet去重
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < index.size(); i++) {
            for (int j = index.get(i) - k; j <= index.get(i) + k; j++) {
                if (j >= 0 && j < nums.length) {
                    if (set.add(j)) {
                        result.add(j);
                    }

                }
            }
        }
        return result;
    }


}