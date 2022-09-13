public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] words=new String[]{"a","b","c","ab","bc","abc"};
        System.out.println(myTest.countPrefixes(words, "abc"));
    }

    public int countPrefixes(String[] words, String s) {
        int result = 0;
        for (String word : words) {
            if(s.startsWith(word)){
                result++;
            }
        }
        return result;
    }


}
