public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] cost=new int[]{1,100,1,1,1,100,1,1,100,1};
        System.out.println(myTest.minCostClimbingStairs(cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        if (cost == null || cost.length == 0){
            return 0;
        }
        if (cost.length==1){
            return cost[0];
        }
        int[] dp=new int[cost.length];
        dp[0]=cost[0];
        dp[1]=cost[1];
        for (int i = 2; i < cost.length; i++) {
//            模拟这个过程，看你是从第一个还是第二个跳过来的
            dp[i]=Math.min(dp[i-1],dp[i-2])+cost[i];
        }
//        返回最后两个中最小的那个
        return Math.min(dp[dp.length-1],dp[dp.length-2]);
    }


}
