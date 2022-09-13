import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,2,3,2,2,2};
        System.out.println(myTest.divideArray(nums));
    }

    public boolean divideArray(int[] nums) {
//        对数组排序
        Arrays.sort(nums);
        int count=0;
        for (int i = 0; i < nums.length-1; i=i+2) {
            if (nums[i]==nums[i+1]){
                count++;
            }
        }
        if (count== nums.length/2){
            return true;
        }
        else {
            return false;
        }

    }

}
