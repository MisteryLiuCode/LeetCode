import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.reverseWords("Let's take LeetCode contest"));
    }

    public String reverseWords(String s) {
        String res="";
        String[] split = s.split(" ");
        for (String s1 : split) {
            StringBuilder stringBuilder = new StringBuilder(s1);
            stringBuilder.reverse();
            res+=stringBuilder.toString();
            res+=" ";
        }
        String substring = res.substring(0, res.length() - 1);
        return substring;
    }


}
