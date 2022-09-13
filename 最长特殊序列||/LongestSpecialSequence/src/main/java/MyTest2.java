import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class MyTest2 {
    public static void main(String[] args) {
        String[] strs = {"aaa", "aaa", "aa"};
//        String[] strs = {"aba","cdc","eae"};
        System.out.println("findLUSlength(strs) = " + findLUSlength(strs));
    }

    public static int findLUSlength(String[] strs) {
        int max = -1;
        Arrays.sort(strs);
        System.out.println("strs = " + Arrays.toString(strs));
        for (int i = 0; i < strs.length; i++) {
            boolean flag = false;
            for (int j = 0; j < strs.length; j++) {
                if (i == j) continue;
                if (strs[i].equals(strs[j])) {
                    flag = true;
                    break;
                }
                //遍历字符串的每一个字符是否在 J中,I是否是J的子序列
                int num = -1;
//                获取到当前字符串
                String s = strs[j];
                for (int m = 0; m < strs[i].length(); m++) {
                    s = s.substring(num + 1);
                    num = s.indexOf(strs[i].charAt(m));
                    if (num == -1) {
                        flag = true;
                        break;
                    }
                }
                if (flag) {
                    max = Math.max(max, strs[i].length());
                } else {
                    break;
                }
            }
        }
        return max;
    }

}
