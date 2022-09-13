import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2,3,4};
        System.out.println(Arrays.toString(myTest.productExceptSelf(nums)));
    }

    public int[] productExceptSelf(int[] nums) {
//        创建一个数组
        int[] arr=new int[nums.length];
        int left=1;
        for (int i = 0; i < nums.length; ++i) {
            arr[i]=left;
            left*=nums[i];
        }
        int right=1;
        for (int i = nums.length - 1; i >= 0; i--) {
            arr[i]*=right;
            right*=nums[i];
        }
        return arr;
    }


}
