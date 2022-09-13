import java.util.ArrayList;
import java.util.Arrays;

/**
 * @program: ExecuteAllSuffixInstructions
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-25 18:52
 **/


public class MyTest {

    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] startPos = new int[]{0, 1};
        String s = "RRDDLU";
        System.out.println(Arrays.toString(myTest.executeInstructions(3, startPos, s)));

    }

    public int[] executeInstructions(int n, int[] startPos, String s) {
//        对字符串进行遍历
        int flag = 0;
        int a = startPos[0];
        int b = startPos[1];
        int[] result = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            flag = 0;
            startPos[0] = a;
            startPos[1] = b;
            for (int j = i; j < s.length(); j++) {

                if (s.charAt(j) == 'R') {
                    startPos[1]++;
                }
                if (s.charAt(j) == 'L') {
                    startPos[1]--;
                }
                if (s.charAt(j) == 'D') {
                    startPos[0]++;
                }
                if (s.charAt(j) == 'U') {
                    startPos[0]--;
                }
                if (startPos[0] > n - 1 || startPos[0] < 0 || startPos[1] > n - 1 || startPos[1] < 0 || j == s.length() - 1) {
                    if (j == s.length() - 1 && startPos[0] <= n - 1 && startPos[1] <= n - 1 && startPos[0] >= 0 && startPos[1] >= 0) {
                        flag++;
                    }
                    result[i] = flag;
                    break;
                } else {
                    flag++;
                }

            }
        }
        return result;
    }

}
