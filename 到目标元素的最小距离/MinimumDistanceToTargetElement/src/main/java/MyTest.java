public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] nums=new int[]{1,2,3,4,5};
        System.out.println(myTest.getMinDistance(nums, 5, 3));
    }

    public int getMinDistance1(int[] nums, int target, int start) {
        for (int i = start; i < nums.length+start; i++) {
            int k=i%nums.length;
            if (nums[k]==target){
                return Math.abs(k-start);
            }
        }
        return 0;
    }

    public int getMinDistance(int[] nums, int target, int start) {
        int res=nums.length;
        int left=start;
        int right=start;
        while (left>=0 || right<nums.length){
            if (left>=0){
                if (nums[left]==target){
                    res=Math.min(res,start-left);
                }
            }
            if (right<nums.length){
                if (nums[right]==target) {
                    res = Math.min(res, right - start);
                }
            }
            left--;
            right++;
        }
        return res;
    }

}
