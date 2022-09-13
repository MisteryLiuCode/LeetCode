import java.util.HashMap;
import java.util.Map;

/**
 * @program: WordRule
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-10 14:52
 **/

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.wordPattern("abba", "dog cat cat dog"));
    }

    public boolean wordPattern(String pattern, String s) {
//        对str中的字符串进行进行空格分词
        String[] strArr=s.split(" ");
//        如果数组的长度和字符串的长度不相等，则直接返回false
        if (pattern.length()!=strArr.length){
            return false;
        }
//        创建两个map
        Map<String, Integer> sMap = new HashMap<>(pattern.length());
        Map<Character, Integer> pMap = new HashMap<>(pattern.length());
//        对数组进行循环
        for (int i=0;i<pattern.length();i++){
            Object sm=sMap.put(strArr[i], i);
            Object pm=pMap.put(pattern.charAt(i), i);
            if (sm != pm){
             return  false;
            }
        }
        return true;
    }


    public boolean wordPattern2(String pattern, String str) {
        String[] words = str.split(" ");
        if (words.length != pattern.length()) {
            return false;
        }
        Map<Object, Integer> smap = new HashMap<>();
        Map<Object, Integer> pmap = new HashMap<>();
        for (Integer i = 0; i < words.length; i++) {
            if (smap.put(pattern.charAt(i), i) != pmap.put(words[i], i)) {
                return false;
            }
        }
        return true;
    }
}
