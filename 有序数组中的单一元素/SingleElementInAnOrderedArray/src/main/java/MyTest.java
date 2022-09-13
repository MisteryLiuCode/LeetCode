/**
 * @program: Single element in an ordered array
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-14 10:26
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,3,5};
        System.out.println(myTest.singleNonDuplicate(nums));
    }

    public int singleNonDuplicate(int[] nums) {
//        设定两个指针
        if (nums.length<2){
            return nums[0];
        }
        int result=0;
        int left=0;
        int right=1;
        int falg=0;
        for (int i=0;i<nums.length-1;i++){
            if (nums[left]!=nums[right]){
                falg++;
            }
            else {
                falg=0;
            }
            if (falg==2){
                return nums[left];
            }
            left++;
            right++;
        }
        switch (falg){
            case 0:
                return nums[0];
            case 1:
                return nums[nums.length-1];
            case 2:
                return result;
        }
//        if (falg==0){
//            return nums[0];
//        }
//        if (falg==1){
//            return nums[nums.length-1];
//        }
//        return result;
        return 0;
    }
}
