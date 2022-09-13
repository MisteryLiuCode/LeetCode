/**
 * @program: StoneGame
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-10 16:02
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] piles=new int[]{3,7,2,3};
        System.out.println(myTest.stoneGame(piles));

    }

    public boolean stoneGame(int[] piles) {

        int resultAlice=0;
        int resultBob=0;
        int max=0;
        int n=piles.length;
//        遍历
        for (int i = 0; i < n; i++) {
//            偶数环节
            if (piles[i]>piles[n-1]){
                max=piles[i];
            }
            else {
                max=piles[n-1];
                n=n-1;
            }
            if (i%2==0){
                resultAlice+=max;
            }
//            奇数环节
            if (i%2==1){
                resultBob+=max;
            }
        }
        Boolean result=resultAlice>resultBob?true:false;
        return result;
    }


}
