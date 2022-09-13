/**
 * @program: truncateSentence
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-06 10:27
 **/


public class MyTest {
    public String truncateSentence(String s, int k) {
//       进行for循环，当遇到一个单词结尾的时候，就让k-1，看看是否为0，如果为0，那就是截取第一个单词
//        那么我需要返回是截取的第几个单词
        int sub=0;
        for (int i=0;i<s.length();i++){
            if (i==s.length()-1){
                sub=s.length();
            }
            if(s.charAt(i)==' '){
                k--;
                if (k==0){
                    sub=i;
                    break;
                }
            }
        }
        return s.substring(0,sub);
    }
}
