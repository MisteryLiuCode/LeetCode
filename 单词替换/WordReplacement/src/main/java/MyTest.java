import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * @ClassName MyTest
 * @Description
 * @Author 刘帅彪
 * @Date2022/7/7 16:13
 **/
public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        ArrayList<String> dictionary = new ArrayList<>();
        dictionary.add("cat");
        dictionary.add("bat");
        dictionary.add("rat");
        String sentence = "the cattle was rattled by the battery";
        String s = myTest.replaceWords(dictionary, sentence);
        System.out.println(s);

    }

    public String replaceWords(List<String> dictionary, String sentence) {
        String[] split = sentence.split(" ");
        HashMap<String, String> map = new HashMap<>();
//        词遍历
        for (String s : split) {
//            词根遍历
            for (String s1 : dictionary) {
//                如果以词根开头
                if (s.startsWith(s1)) {
                    if (map.get(s) != null) {
                        String s2 = map.get(s);
//                        比较长度
                        s2 = s2.length() > s1.length() ? s1 : s2;
                        map.put(s, s2);
                        continue;
                    }
                    map.put(s, s1);
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : split) {
            if (map.containsKey(s)) {
                stringBuilder.append(map.get(s));
                stringBuilder.append(" ");
                continue;
            }
            stringBuilder.append(s);
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }


//    罗银莲方法
    public static String replaceWords2(List<String> dictionary, String sentence) {
        Collections.sort(dictionary, (o1, o2) -> o1.length() - o2.length());
        StringBuilder sb = new StringBuilder();
        String[] split = sentence.split(" ");
        for (String s : split) {
            for (String s1 : dictionary) {
                if (s.startsWith(s1)) {
                    s = s1;
                    break;
                }
            }
            sb.append(s).append(" ");
        }
        return sb.toString().trim();
    }
}


