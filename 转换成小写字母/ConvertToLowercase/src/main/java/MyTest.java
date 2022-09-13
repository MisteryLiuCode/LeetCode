public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.toLowerCase("aHe&llo"));
    }

    public String toLowerCase(String s) {
        String result="";
//        对s遍历
        for (int i=0;i<s.length();i++){
            byte n = (byte)s.charAt(i);
            if (n<=90 && n>=65){
                char ch= (char) (s.charAt(i)+32);
                result+=ch;
                continue;
            }
            result+=s.charAt(i);
        }
        return result;
    }


}
