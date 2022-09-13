import java.util.ArrayList;
import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(Arrays.toString(myTest.shortestToChar("loveleetcode", 'e')));
    }

    public int[] shortestToChar(String s, char c) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0;i<s.length();i++){
            if (s.charAt(i)==c){
                list.add(i);
            }
        }
        int[] res=new int[s.length()];
        for (int i=0;i<s.length();i++){
            int min=s.length();
            for (Integer index : list) {
                min=Math.min(min,Math.abs(i-index));
            }
            res[i]=min;
        }
        return res;
    }

}
