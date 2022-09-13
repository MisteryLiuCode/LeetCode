import java.util.HashMap;
import java.util.HashSet;

/**
 * @program: IsomorphicStrings
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-05 13:34
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isIsomorphicThree("bbbaaaba", "aaabbbba"));
    }

    public boolean isIsomorphicThree(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
                continue;
            } else if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)) || map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                return false;
            } else {
                if (map.get(s.charAt(i)) != t.charAt(i)) {
                    return false;
                }
            }

        }
        return true;
    }

    public boolean isIsomorphicTwo(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        HashMap<Character, Character> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            if (!map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                map.put(s.charAt(i), t.charAt(i));
            }
            if (!map.containsKey(s.charAt(i)) && map.containsValue(t.charAt(i)) || map.containsKey(s.charAt(i)) && !map.containsValue(t.charAt(i))) {
                return false;
            }
        }
        return true;
    }


    public boolean isIsomorphicOno(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && t.charAt(i) != t.charAt(i + 1)) {
                return false;
            }
            if (s.charAt(i) != s.charAt(i + 1) && t.charAt(i) == t.charAt(i + 1)) {
                return false;
            }
        }
        return true;

    }
}
