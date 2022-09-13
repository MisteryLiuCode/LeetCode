import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{5,1,5,2,5,3,5,4};
        System.out.println(myTest.repeatedNTimes(nums));
    }

    public int repeatedNTimes(int[] nums) {
//        排序
        Arrays.sort(nums);
        int left=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left]!=nums[i]){
                int len=i-left;
                if (len==nums.length/2){
                    return nums[left];
                }
                left=i;
            }

        }
        return nums[nums.length-1];
    }


}
