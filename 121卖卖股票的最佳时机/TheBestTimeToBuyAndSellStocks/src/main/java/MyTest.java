/**
 * @program: TheBestTimeToBuyAndSellStocks
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-08 16:26
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr=new int[]{2,4,1};
        int i = myTest.maxProfit(arr);
        System.out.println(i);
    }

    public int maxProfit(int[] prices) {
        int min=prices[0];
        int max=prices[0];
        int result=0;
//        两重遍历，用每一个数减去后面的，最小的输出
        for (int i = 1; i < prices.length; i++) {
//            如果这个值比min小，则替换，相反如果这个值比max大则也替换
            if (prices[i]>max){
                max=prices[i];
            }
//            如果比min小，那么就使max和min同时指向当前的数，因为此时min变化了
//            之前的max就无效了。
            if (prices[i]<min){
                min=prices[i];
                max=min;
            }
//            每一轮比较一下result的值，看是否需要变化
            if (result<max-min) {
                result = max - min;
            }
        }
        return result;
    }
}
