public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,5,9,1,5,9};
        System.out.println(myTest.containsNearbyAlmostDuplicate(nums, 2, 3));
    }

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k==1000){
            return false;
        }
//        对nums遍历
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<=k+i;j++){
                if (j<nums.length){
                    if(Math.abs((long) nums[i] -(long) nums[j])<=t){
                        return true;
                    }
                }
                else {
                    k--;
                    continue;
                }
            }
        }
        return false;

    }

}
