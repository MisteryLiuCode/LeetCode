import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[] nums1 = new int[]{1, 2, 2, 1};
        int[] nums1 = new int[]{9,4,9,8,4};
//        int[] nums2 = new int[]{2, 2};
        int[] nums2 = new int[]{4,9,5};
        System.out.println(Arrays.toString(myTest.intersect(nums1, nums2)));
    }

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        for (int i : nums1) {
            if (map1.containsKey(i)) {
                Integer sum = map1.get(i);
                map1.put(i, ++sum);
            } else {
                map1.put(i, 1);
            }
        }

        for (int i : nums2) {
            if (map2.containsKey(i)) {
                Integer sum = map2.get(i);
                map2.put(i, ++sum);
            } else {
                map2.put(i, 1);
            }
        }
        Set<Integer> keySet = map1.keySet();
        for (Integer key : keySet) {
            if (map1.get(key) != null && map2.get(key) != null) {
                int m1 = map1.get(key);
                int m2 = map2.get(key);
                int n = Math.min(m1, m2);
                for (int i = 0; i < n; i++) {
                    list.add(key);
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }
}
