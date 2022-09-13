import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.largestInteger(65875));
    }
    public int largestInteger(int num) {
        StringBuilder res = new StringBuilder();
        ArrayList<Integer> evenNumbersList = new ArrayList<>();
        ArrayList<Integer> oddNumberList = new ArrayList<>();
        String s = String.valueOf(num);
        for (int i=0;i<s.length();i++){
            int n=s.charAt(i)-'0';
            if (n%2==0){
                evenNumbersList.add(n);
            }
            else {
                oddNumberList.add(n);
            }
        }
        Collections.sort(evenNumbersList);
        Collections.sort(oddNumberList);

        int a=evenNumbersList.size();
        int b=oddNumberList.size();
        for (int i=0;i<s.length();i++){
            int n=s.charAt(i)-'0';
            if (n%2==0){
                res.append(evenNumbersList.get(--a));
            }
            else{
                res.append(oddNumberList.get(--b));
            }
        }

        return Integer.valueOf(res.toString());
    }



}
