import java.util.HashSet;

/**
 * @program: LongestSubstring
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-03 16:32
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.longestNiceSubstring("YazaAay"));
    }


    public String longestNiceSubstring(String s) {
        //记录当前满足的最长字符串
        int max=0;
        int n=s.length();
//        记录结果
        String res="";
//        两个set，一个记录截取后的原字符串，一个记录，截取后的全部大写的字符串
        HashSet<Character> set1=new HashSet<>();
        HashSet<Character> set2=new HashSet<>();
//        遍历字符串
        for(int i=0;i<n;i++){
//            每次清空
            set1.clear();
            set2.clear();
            for(int j=i;j<n;j++){
                set1.add(s.charAt(j));
//                如果不是大写，就变为大写添加进set里面
                if (s.charAt(j)<=122 && s.charAt(j)>=97){
                    set2.add((char)(s.charAt(j)-32));
                }
                else {
                    set2.add((s.charAt(j)));
                }
//                如果两个set是两倍关系，并且大于目前的最大长度，就重新赋值
                if(set1.size()==set2.size()*2 && j-i+1>max){
                    //是美好的
//                    记下此时符合的长度
                    max=j-i+1;
//                    截取目标字符串
                    res=s.substring(i,j+1);
                }
            }
        }
        return res;
    }
}
