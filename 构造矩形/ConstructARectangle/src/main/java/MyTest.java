import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(Arrays.toString(myTest.constructRectangle(122122)));

    }

    public int[] constructRectangle(int area) {
        int W=1;
        int L=area;
        int[] res=new int[2];
        while (L>=W){
            int areaCurrent=L*W;
            if (areaCurrent==area){
                res[0]=L;
                res[1]=W;
                W++;
                L--;
            }
            else if (areaCurrent<area){
                W++;
            }
            else {
                L--;
            }
        }
        return res;
    }
}
