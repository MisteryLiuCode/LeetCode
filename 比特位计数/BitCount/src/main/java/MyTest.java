import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(Arrays.toString(myTest.countBits(5)));
    }

    public int[] countBits(int n) {
        int[] res=new int[n+1];
        res[0]=0;
//        对每个数进行遍历
        for (int i=1;i<=n;i++){
            int m=i;
            int count=0;
            while (m!=0){
                int a=m%2;
                if (a==1){
                    count++;
                }
                m=m/2;
            }
            res[i]=count;
        }
        return res;
    }

}
