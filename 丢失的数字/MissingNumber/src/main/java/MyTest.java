import java.util.Arrays;

/**
 * @program: MissingNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-12 13:16
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2};
        System.out.println(myTest.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int result=0;
        int flag=0;
        for (int i=0;i<nums.length;i++){
            if (nums[i]!=i){
                result=i;
                flag=1;
                break;
            }
        }
        if (flag==0){
            result=nums[nums.length-1]+1;
        }
        return result;
    }

}
