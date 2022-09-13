/**
 * @program: TotalAssetsOfRichestCustomers
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-05 21:24
 **/


public class MyTest {

    public static void main(String[] args) {

    }

    public int maximumWealth(int[][] accounts) {
//        遍历数组
        int max=0;
        int result=0;
        for (int i=0;i<accounts.length;i++){
            result=0;
            for (int j=0;j<accounts[i].length;j++){
                result+=accounts[i][j];
            }
            max=max<result?result:max;
        }
        return max;
    }

}
