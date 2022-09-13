import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] word1 = new String[]{"ab", "c"};
        String[] word2 = new String[]{"a", "bc"};
        System.out.println(myTest.arrayStringsAreEqual(word1, word2));
    }

    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();

        splicing(stringBuilder1,word1);
        splicing(stringBuilder2,word2);
        if (stringBuilder1.length()!=stringBuilder2.length()){
            return false;
        }
        return stringBuilder1.toString().equals(stringBuilder2.toString());
    }


    public void splicing( StringBuilder stringBuilder,String[] word){
        for (int i = 0; i < word.length; i++) {
            stringBuilder.append(word[i]);
        }
    }
}
