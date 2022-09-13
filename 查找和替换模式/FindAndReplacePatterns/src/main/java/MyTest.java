import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        String[] words = new String[]{"abc", "deq", "mee", "aqq", "dkd"};
        MyTest myTest = new MyTest();
        System.out.println(myTest.findAndReplacePattern(words, "abb"));
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
//        结果集
        //            两个map
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (int i = 0; i < words.length; i++) {
            Boolean flag = true;
            for (int j = 0; j < words[i].length(); j++) {
                /*
                 如果map里没有该值返回null，有了返回值
                 对应这个，如果有有该字符了，就返回下标
                 */
                Integer put1 = map1.put(words[i].charAt(j), j);
                Integer put2 = map2.put(pattern.charAt(j), j);
//                如果不想等，flag为false
                if (put1 != put2) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                res.add(words[i]);
            }
            map1.clear();
            map2.clear();
        }
        return res;
    }

    public static List<String> findAndReplacePattern2(String[] words, String pattern) {
        ArrayList<String> list = new ArrayList<>();

        for (String word : words) {
            //判断当 pattern 为 key , Word 为 value  结果是否为true
            //判断当 Word 为 key , pattern 为 value  结果是否为true
            //map 是 一对多  , 让他一对一
            if (isEqusl(pattern, word, word.length()) == true && isEqusl(word, pattern, word.length()) == true) {
                list.add(word);
            }
        }
        return list;
    }

    public static boolean isEqusl(String key, String value, int length) {

        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < length; i++) {
            //添加 key , value 值
            Character put = map.put(key.charAt(i), value.charAt(i));
            //如果有 key 则返回 null ,如果没有 ,修改 value 值,并返回原来的 value
            //如果原来的 value 和 现在的 value 一样 ,则没改变对应规则,
            if (put != null && put != value.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}

