import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] words=new String[]{"gin", "zen", "gig", "msg"};
        System.out.println(myTest.uniqueMorseRepresentations(words));
    }

    public int uniqueMorseRepresentations(String[] words) {
        /**
         * 做一个表，每个单词进行对应
         */

        String[] table = new String[]{".-",
                "-...",
                "-.-.",
                "-..",
                ".",
                "..-.",
                "--.",
                "....",
                "..",
                ".---",
                "-.-",
                ".-..",
                "--",
                "-.",
                "---",
                ".--.",
                "--.-",
                ".-.",
                "...",
                "-",
                "..-",
                "...-",
                ".--",
                "-..-",
                "-.--",
                "--.."};
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < words.length; i++) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int j = 0; j < words[i].length(); j++) {
                stringBuilder.append(table[(int) (words[i].charAt(j) - 'a')]);
            }
            set.add(stringBuilder.toString());
        }
        return set.size();
    }

}
