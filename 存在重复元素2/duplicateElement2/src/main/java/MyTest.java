import java.util.Arrays;

/**
 * @program: duplicateElement2
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-28 21:45
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2,3,1,2,3};
        System.out.println(myTest.containsNearbyDuplicate(nums, 2));
    }
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<=i+k && j<nums.length;j++){
                if (nums[i]==nums[j]){
                        return true;
                }
            }
        }
        return false;
    }

}
