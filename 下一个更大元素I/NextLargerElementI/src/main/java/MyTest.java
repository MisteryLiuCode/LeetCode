import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums1 = new int[]{4, 1, 2};
        int[] nums2 = new int[]{1, 3, 4, 2};
        System.out.println(Arrays.toString(myTest.nextGreaterElement(nums1, nums2)));
    }

    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//        遍历
        Boolean flag = false;
        for (int i = 0; i < nums1.length; i++) {
            for (int j = 0; j < nums2.length; j++) {
                if (nums1[i] == nums2[j]) {
                    flag = true;
                } else if (flag == true && nums2[j] > nums1[i]) {
                    nums1[i] = nums2[j];
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                nums1[i] = -1;
            }

        }
        return nums1;
    }


}
