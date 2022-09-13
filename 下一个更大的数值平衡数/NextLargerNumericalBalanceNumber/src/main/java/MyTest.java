import java.util.HashMap;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.nextBeautifulNumber(120));
    }

    public int nextBeautifulNumber(int n) {
        HashMap<Character, Integer> map = new HashMap<>();
        while (true) {
            map.clear();
            Boolean flag = true;
            n++;
            String s = String.valueOf(n);
            for (int i = 0; i < s.length(); i++) {
                if (map.containsKey(s.charAt(i))) {
                    Integer sum = map.get(s.charAt(i));
                    map.put(s.charAt(i), ++sum);
                    continue;
                }
                map.put(s.charAt(i), 1);
            }
            Set<Character> keySet = map.keySet();
            for (Character key : keySet) {
                int keyIn = key - '0';
                if (keyIn != map.get(key)) {
                    flag = false;
                    break;
                }
            }
            if (flag == true) {
                return n;
            }
        }
    }

}
