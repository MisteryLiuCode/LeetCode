public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.reverseStr("abcdefg", 2));
    }

    public String reverseStr(String s, int k) {
        StringBuilder res= new StringBuilder(s);
        for (int i=2*k;i<=s.length();i+=2*k){
            reverseString(res,i - 2 * k,i-k);
        }
        /**
         * 让s的长度对2k取余，得出是小于k，还是大于等于k,小于等于2k
         */
        int n=s.length()%(2*k);
        if (n<k){
            reverseString(res,s.length() - n, s.length());
        }
        else {
            reverseString(res,s.length() - n, s.length() - n + k);
        }
        return res.toString();
    }

    /**
     * 截取字符串，将字符串反转，替换字符串，抽象出来
     */
    public void reverseString(StringBuilder res,int start,int end){
        String sub= res.substring(start, end);
        StringBuilder stringReverse = new StringBuilder(sub);
        StringBuilder reverse = stringReverse.reverse();
        res.replace(start, end,reverse.toString());
    }


}
