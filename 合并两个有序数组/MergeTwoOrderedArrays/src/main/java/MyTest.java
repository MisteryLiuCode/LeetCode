import java.util.Arrays;
import java.util.Map;

/**
 * @program: MergeTwoOrderedArrays
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-08 19:21
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums1 = new int[]{2,0};
        int[] nums2 = new int[]{1};
        myTest.merge(nums1, 1, nums2, 1);
    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
//        定义三个指针，一个指针指向第一个数组的最后一个数字，一个指向数组的最后一位，一个指向第二个数组的最后一个数。
        if (m==0){
//            代表第一个数组数组没有元素，直接把第二个数组的元素复制到第一个数组
            System.arraycopy(nums2,0,nums1,0,n);
            System.out.println(Arrays.toString(nums1));
            return;
        }
//        第一个数组的最后一个有效值
        int high = m - 1;
//        第一个数组的最后一个数
        int max1 = m + n - 1;
//        第二个数组的最后一个元素
        int max2 = n - 1;
        while (max2 >=0) {
//            代表第一个数组已经从后向前遍历完了，直接把第二个数组剩下的数复制到第一个前面即可
            if (high==-1){
                break;
            }
//            如果第二个数组大于第一个数组
            if (nums2[max2] >= nums1[high]) {
//                把当前第二个数组的最后一个数复制到第一个数组当前指向的最后一个数
                nums1[max1] = nums2[max2];
//                指针后退
                max1--;
                max2--;
            } else {
//                否则把当前第一个数组的最后一个有效数字复制给当前第一个数字的最后一个数
                nums1[max1] = nums1[high];
//                指针后退
                high--;
                max1--;
            }
        }
    }
}
