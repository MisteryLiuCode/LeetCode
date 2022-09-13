import java.util.Arrays;

/**
 * @program: DivideAnArrayAccordingToAGivenNumber
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-06 16:00
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{-3,4,3,2};
        myTest.pivotArray(nums,2);
    }

    public int[] pivotArray(int[] nums, int pivot) {
//        深拷贝数组
        int[] cloneNums=nums.clone();
//        先排小的
//        设置指针
        int m=0;
        int exchange=0;
        for (int i=0;i< nums.length;i++){
            if (nums[i]<pivot){
                exchange=nums[m];
                nums[m]=nums[i];
                nums[i]=exchange;
                m++;
            }
        }
//        对大的排序
        int n=nums.length-1;
        for (int i= cloneNums.length-1;i>=0;i--){
            if (cloneNums[i]>pivot){
                exchange=cloneNums[n];
                cloneNums[n]=cloneNums[i];
                cloneNums[i]=exchange;
                n--;
            }
        }
        for (int i=m;i<nums.length;i++){
            if (i<n+1){
                nums[i]=pivot;
                continue;
            }
            else {
                nums[i]=cloneNums[i];
            }
        }
        return nums;
    }
}
