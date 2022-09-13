import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{0,1,0,1,0,1,99};
        System.out.println(myTest.singleNumber(nums));
    }

    public int singleNumber(int[] nums) {
        if (nums.length==1){
            return nums[0];
        }
        Arrays.sort(nums);
//        对nums进行遍历
        for (int i=1;i<nums.length-1;i++){
            if (nums[i]!=nums[i-1] && nums[i]!=nums[i+1]){
                return nums[i];
            }
        }
        if (nums[0]!=nums[1]){
            return nums[0];
        }
        else {
            return nums[nums.length-1];
        }
    }
}