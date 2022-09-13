import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] gain=new int[]{-5,1,5,0,-7};
        System.out.println(myTest.largestAltitude(gain));
    }
    public int largestAltitude(int[] gain) {
//        创建数组
        int[] res=new int[gain.length+1];
        res[0]=0;
        for (int i = 0; i < gain.length; i++) {
            res[i+1]=res[i]+gain[i];
        }
//        排序
        Arrays.sort(res);
        return res[res.length-1];
    }


}
