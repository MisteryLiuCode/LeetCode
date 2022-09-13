/**
 * @program: ColorClassification
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-28 16:17
 **/


public class MyTest {
    public static void main(String[] args) {
        int[] nums=new int[]{1,2,0};
        MyTest myTest = new MyTest();
        myTest.sortColors(nums);
    }
    public void sortColors(int[] nums) {
        int n=nums.length;
        int left=0;
        int end=nums.length-1;
        for (int i=0;i<n;i++){
            if (nums[i]==0){
//                与前指针交换
//                left++，先执行后++
                exchange(nums,i,left++);
            }
            if (nums[i]==2){
//                同样遇到2，与后面指针对应的数交换位置
                exchange(nums,i,end--);
//                不必遍历新换的数了
                n--;
//                判断新换来的数
                i-=1;
            }
        }
    }
//    两个数字交换的方法
    private void exchange(int[] nums,int i,int temp){
        int backups=nums[temp];
        nums[temp]=nums[i];
        nums[i]=backups;
    }

}
