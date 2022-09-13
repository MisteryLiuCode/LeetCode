import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{4,-2,-3,4,1};
        System.out.println(myTest.subArrayRanges(nums));
    }

    public long subArrayRanges(int[] nums) {
        long result=0;
        int max=0;
        int min=0;
        for (int i = 0; i < nums.length; i++) {
            max=nums[i];
            min=nums[i];
//            双重for循环
            for (int j=i+1;j<nums.length;j++){
//                关键步骤，每次更新一下max和min的值
                max=Math.max(max,nums[j]);
                min=Math.min(min,nums[j]);
                result+=(max-min);
            }
        }
        return result;
    }


}