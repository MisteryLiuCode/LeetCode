public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[] nums=new int[]{1,2,3,1};
//        int[] nums=new int[]{2,7,9,3,1};
        int[] nums = new int[]{2, 1, 1, 2};
        System.out.println(myTest.rob(nums));
    }

    public int rob(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        if (nums.length == 1) {
            return nums[0];
        }

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
//        求相邻两个最大值
        dp[1] = Math.max(dp[0], nums[1]);
        for (int i = 2; i < nums.length; i++) {
//            每次都能取得最大值
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + nums[i]);
        }
        return dp[nums.length - 1];
    }


}
