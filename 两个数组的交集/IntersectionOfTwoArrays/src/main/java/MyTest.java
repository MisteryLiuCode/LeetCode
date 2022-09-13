import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums1=new int[]{1,2,2,1};
        int[] nums2=new int[]{2,2};
        System.out.println(Arrays.toString(myTest.intersection(nums1, nums2)));
    }

    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> set = new HashSet<>();
        for (int i : nums1) {
            set.add(i);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])){
                if (!res.contains(nums2[i])){
                    res.add(nums2[i]);
                }
            }
        }

//        list转化为int数组
        int[] resInt = new int[res.size()];
        resInt=res.stream().mapToInt(Integer::valueOf).toArray();
        return resInt;
    }

}
