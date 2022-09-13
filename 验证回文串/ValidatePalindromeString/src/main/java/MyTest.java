public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isPalindrome("A man, a plan, a canal: Panama"));
    }
    public boolean isPalindrome(String s) {
        String res="";
        String replace = s.toLowerCase();
        for (int i=0;i<replace.length();i++){
            if (replace.charAt(i)<97 || replace.charAt(i)>122){
                if (replace.charAt(i)>=48 && replace.charAt(i)<=57){
                    res+=replace.charAt(i);
                }
                continue;
            }
            res+=replace.charAt(i);
        }
        StringBuilder stringBuilder = new StringBuilder(res);
        return res.equals(stringBuilder.reverse().toString());
    }
}
