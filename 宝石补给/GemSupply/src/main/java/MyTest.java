import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int giveGem(int[] gem, int[][] operations) {
        for (int[] operation : operations) {
//            送宝石的两个下标
            int x=operation[0];
            int y=operation[1];
//            该下标目前的数量
            int m=gem[x];
            int n=gem[y];
//            赠送宝石
            gem[x]=m-m/2;
            gem[y]=n+m/2;
        }
        Arrays.sort(gem);
        int res=gem[gem.length-1]-gem[0];
        return res;
    }


}
