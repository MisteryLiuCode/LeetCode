import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{18,20,22,21};
        System.out.println(myTest.fullReductionActivity(nums, 30));
    }

    public int fullReductionActivity(int[] nums,int n){
//        对nums排序
        Arrays.sort(nums);
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            if (n>0){
                n-=nums[i];
                res+=nums[i];
            }
            else {
                break;
            }
        }
        return res;
    }


}
