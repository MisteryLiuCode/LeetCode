import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(Arrays.toString(myTest.diStringMatch("IDID")));
    }

    public int[] diStringMatch(String s) {
        int n=s.length();
        int bg=0;
        int[] res=new int[n+1];
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='I'){
                res[i]=bg;
                bg++;
            }
            else {
                res[i]=n;
                n--;
            }
        }
        res[res.length-1]=n;
        return res;
    }


}
