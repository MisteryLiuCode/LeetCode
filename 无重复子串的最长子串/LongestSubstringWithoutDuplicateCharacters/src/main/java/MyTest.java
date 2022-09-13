import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/**
 * @program: LongestSubstringWithoutDuplicateCharacters
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-16 13:37
 **/


public class MyTest {
    public static void main(String[] args) {
        String s="ohvhjdml";
        int i = MyTest.lengthOfLongestSubstring(s);
        System.out.println(i);



    }


    public static int lengthOfLongestSubstring(String s) {
//        利用hashset的特性只能存储不同的值
        HashSet<Character> strings = new HashSet<>();
//        把s复制一份，方便对s1进行字符串截取
        String s1=s;
//        存储每次循环中最长字符串长度
        int max=0;
//        根据比较的子串的长度，每次比较会-1,第一次是每次一个，第二次每次两个，需要比较length-1次
        int length=s.length();
//        从一个字符串到最后整个字符串，需要比较length次
        for (int i=0;i<s.length();i++){
//            每一个子串中比较
            for (int j=0;j<length;j++){
//                比如："pwwkew" 截取子串，i=0时第一个字符串是p，i=1时第一个是pw
                s1=s1.substring(j,i+j+1);
//                每次加入到hashtable中
                for (int j1=0;j1<s1.length();j1++) {
                    strings.add(s1.charAt(j1));
                }
//                重置s1
                s1=s;
//                每次hashset加入完之后，判断max的最大值，如果hashtable的值增加了，那么就重置max值
                if (max<strings.size()){
                    max=strings.size();
                }
//                如果hashset的值等于此时选择的子串长度，那么就进行下一个子串的比较 2个子串——>3个子串
                if (max==(i+1)){
                    strings.clear();
                    break;
                }
//                重置hashset
                strings.clear();
            }
//            如果一整轮的循环下来，max的值还是小于此轮每次截取的字符串，也就没比较再往后比较了
            if (max<(i+1)){
                return max;
            }
//            每次一整轮比较后，截取的字符串长一位，所以比较的次数少一位
            length--;
        }
        return max;
    }
}
