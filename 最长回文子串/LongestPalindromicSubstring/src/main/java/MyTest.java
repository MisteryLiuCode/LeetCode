/**
 * @program: LongestPalindromicSubstring
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-16 20:14
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.longestPalindrome("a"));
    }

    public String longestPalindrome(String s) {
//        备份s1，之后对截取的字符串
        String s1=s;
//        设置一个flag
        int flag=0;
//        保存长度
        int lenth=s.length();
//        每次重置起始位置
        int begin= 0;
//        如果初始字符就是正确答案，那么就返回结果
        if (s.equals(reverseStringBuffer(s))){
            return s;
        }
//        对字符串遍历
        for (int i=0;i<s.length();i++){
            begin=0;
//           遍历的时候去掉一个整字符串
            lenth--;
//            循环的条件：比如一共有5个字符，截取连续的4个，一共有两种情况，截取三个，一共有三种情况.....
            while (begin+lenth<=s1.length()){
//                对字符串截取
                s=s.substring(begin,begin+lenth);
//              对截取之后的字符遍历
                for (int j=0;j<s.length()/2;j++) {
//                    如果当前的首字符串和尾字符串不相等，那么就直接brek
//                    为什么要设置flag，因为不知道跳出for循环的时候，是因为brek了，还是所有的字符都相等
                    if ((s.charAt(j) != s.charAt(s.length() - j - 1))) {
                        flag=1;
                        break;
                    }
                }
//                如果跳出循环的时候，flag=0,那么说明所有都相等，返回字符串
                if (flag==0){
                    return s;
                }
//                如果flag=1,那说明次字符串不符合条件，重置flag值
                flag=0;
//                重置s，重新截取
                s=s1;
//                截取的起始位置+1
                begin++;
            }
        }
        return "";
    }

//    字符串反转的方法
    public static String reverseStringBuffer(String s){
        StringBuffer sb = new StringBuffer(s);
        String afterReverse = sb.reverse().toString();
        return afterReverse;
    }
}
