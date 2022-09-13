import java.util.HashMap;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.maxPower("cc"));
    }

    public int maxPower(String s) {
        if (s.length() == 1) {
            return 1;
        }
        int left = 0;
        int right = 1;
        int max = 0;
        for (int i = 0; i < s.length() && right < s.length(); i++) {
            if (s.charAt(left) != s.charAt(right)) {
                max = Math.max(max, right - left);
                left = right;
                i++;
            }
            right++;
        }
        max=Math.max(max, right - left);
        return max;
    }

}
