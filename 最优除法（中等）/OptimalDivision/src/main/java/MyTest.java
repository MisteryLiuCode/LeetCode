/**
 * @program: OptimalDivision
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-27 10:27
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1000,100,10,2};
        System.out.println(myTest.optimalDivision(nums));


    }

    public String optimalDivision(int[] nums) {
        if (nums.length==1){
            return String.valueOf(nums[0]);
        }
        if (nums.length==2){
            return nums[0]+"/"+nums[1];
        }
        String result="";
//        对数组进行遍历
        for(int i=0;i<nums.length;i++){
            if (i==1){
                result+="(";
            }
            result+=nums[i];
            result+="/";
        }
        String s = result.substring(0, result.length() - 1) + ")";
        return s;
    }
}
