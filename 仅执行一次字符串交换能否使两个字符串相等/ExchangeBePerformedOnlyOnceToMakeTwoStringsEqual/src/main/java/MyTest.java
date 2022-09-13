/**
 * @program: ExchangeBePerformedOnlyOnceToMakeTwoStringsEqual
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-17 17:10
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();

        String s1 = "caa";
        String s2 = "aaz";
        System.out.println(myTest.areAlmostEqual(s1, s2));
    }


    public boolean areAlmostEqual(String s1, String s2) {
        StringBuilder sb1=new StringBuilder(s1);
//        记录下标
        int a=0;
        int b=0;
//        记录下标对应的字符
        char left=0;
        char right=1;
//        记录两个字符不一样的个数
        int flag = 1;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
//                第一次一样
                if (flag == 1) {
                    a=i;
                    left=s1.charAt(i);
                    flag++;
                    continue;
                }
//                第二次不一样
                if (flag == 2) {
                    b=i;
                    right=s1.charAt(i);
                    break;
                }
            }
        }
//        第一次，直接返回true
        if (flag==1){
            return true;
        }
//        两个位置进行进行替换
        sb1.replace(a,a+1, String.valueOf(right));
        sb1.replace(b,b+1, String.valueOf(left));
//        把StringBuilder转换为字符串
        String sb1s=new String(sb1);
//        相等的话，就返回true
        return sb1s.equals(s2);
    }
}
