/**
 * @program: CountTheNumberOfConsistentStrings
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-25 23:45
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] words=new String[]{"ad","bd","aaab","baa","badab"};
        System.out.println(myTest.countConsistentStrings("ab", words));
    }


    public int countConsistentStrings(String allowed, String[] words) {
        int result=0;
//        对words遍历
        for (int i = 0; i < words.length; i++) {
            int flag=0;
            for (int k = 0; k < words[i].length(); k++) {
                for (int j = 0; j < allowed.length(); j++) {
                    if (words[i].charAt(k)==allowed.charAt(j)){
                        flag++;
                        break;
                    }
                }
            }
            if (flag==words[i].length()){
                result++;
            }
        }
        return result;
    }
}
