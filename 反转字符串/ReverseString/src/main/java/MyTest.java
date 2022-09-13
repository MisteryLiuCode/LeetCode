import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        char[] s=new char[]{'H','a','n','n','a','g'};
        myTest.reverseString(s);
    }

    public void reverseString(char[] s) {
        int left=0;
        int right=s.length-1;
        int n=s.length/2;
        char temp;
        for (int i=0;i<n;i++){
            temp=s[left];
            s[left]=s[right];
            s[right]=temp;
            left++;
            right--;
        }
    }


}