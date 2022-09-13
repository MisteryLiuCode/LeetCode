public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        System.out.println(myTest.repeatedSubstringPattern("abab"));
//        System.out.println(myTest.repeatedSubstringPattern("abcabcabcabc"));
        System.out.println(myTest.repeatedSubstringPattern("aabaaba"));
    }
    public boolean repeatedSubstringPattern(String s) {
        Boolean flag=true;
        for (int i=1;i<=s.length()/2;i++){
            flag=true;
            for (int j=i;j<s.length();j+=i){
//               截取字符串
                String a=s.substring(0,i);
//                超出下标
                if (j+i>s.length()){
                    flag=false;
                    break;
                }
//                判断是否相等
                if (!a.equals(s.substring(j,j+i))){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                return true;
            }
        }
        return false;
    }


}
