import java.util.ArrayList;
import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] words = new String[]{"cat", "bt", "hat", "tree"};
        System.out.println(myTest.countCharacters(words, "atach"));
    }

    public int countCharacters(String[] words, String chars) {
        int res = 0;
        for (String word : words) {
            HashSet<Integer> set = new HashSet<>();
            for (int i = 0; i < word.length(); i++) {

//                对charts进行遍历
                /**
                 * 使用set保存使用过的字符下标
                 */
                for (int j = 0; j < chars.length(); j++) {
                    if (word.charAt(i) == chars.charAt(j)) {
//                        如果这个下标可以添加进去，那么就让count++;
                        if (set.add(j)){
                            break;
                        }

                    }
                }
            }
            if ( set.size()== word.length()) {
                res+=set.size();
            }
        }
        return res;
    }


}
