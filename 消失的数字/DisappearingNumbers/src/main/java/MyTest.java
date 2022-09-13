public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{3,0,1};
        System.out.println(myTest.missingNumber(nums));
    }

    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=(n+1)*n/2;
        for (int i=0;i<nums.length;i++){
            sum-=nums[i];
        }
        return sum;
    }

}
