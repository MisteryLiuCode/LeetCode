public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public void rotate(int[] nums, int k) {
//       求实际的下标
        k=k%nums.length;
//        翻转整个数组
        flip (nums,0,nums.length-1);
//        翻转前半部分，翻转后半部分
        flip(nums,0,k-1);
        flip(nums,k,nums.length-1);
    }


    public void flip(int[] nums,int begin,int end){
        for (int i=begin,j=end;i<j;i++,j--) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
    }
}
