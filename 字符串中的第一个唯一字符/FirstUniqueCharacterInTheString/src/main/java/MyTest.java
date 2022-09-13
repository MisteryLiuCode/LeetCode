import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.firstUniqChar("loveleetcode"));
    }

    public int firstUniqChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
//        对s遍历
        for (int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);
        }
//        返回value只有1的键
        for (int i=0;i<s.length();i++){
            if (map.get(s.charAt(i))==1){
                return i;
            }
        }
        return -1;
    }


}
