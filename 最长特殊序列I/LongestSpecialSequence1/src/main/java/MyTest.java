public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.findLUSlength("abc", "abcd"));
    }
    public int findLUSlength(String a, String b) {
//        如果字符串相等直接返回这个-1
        if (a.equals(b)) {
            return -1;
        } else if (a.length() == b.length()) {
            return a.length();
        } else {
            int max = a.length() >= b.length() ? a.length() : b.length();
            return max;
        }
    }
}