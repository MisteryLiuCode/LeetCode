/**
 * @program: Test01
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-06 10:14
 **/


public class Test01 {
    public String truncateSentence(String s, int k) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ' && --k == 0) {
                return s.substring(0, i);
            }
        }
        return s;
    }
}
