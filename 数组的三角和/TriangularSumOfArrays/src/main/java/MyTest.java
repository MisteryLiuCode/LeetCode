import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{5};
        System.out.println((myTest.triangularSum(nums)));
    }

    public int triangularSum(int[] nums) {
        int n=nums.length;
        for (int i=0;i<n-1;i++){
            int[] cal = cal(nums);
            nums=cal;
        }
        return nums[0];
    }
    public int[] cal(int[] nums){
        int[] res=new int[nums.length-1];
        for (int i = 0; i < nums.length-1; i++) {
            res[i]=(nums[i]+nums[i+1])%10;
        }
        return res;
    }

}
