import java.util.HashSet;

/**
 * @program: MaximumNumberOfWordsInASentence
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-30 23:32
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] sentences=new String[]{"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        System.out.println(myTest.mostWordsFound(sentences));

    }
    public int mostWordsFound(String[] sentences) {
        int result=1;
        int flag=1;
        for (int i = 0; i < sentences.length; i++) {
            flag=1;
            for (int j=0;j<sentences[i].length();j++){
                if (Character.isSpaceChar(sentences[i].charAt(j))){
                    flag++;
                }
            }
            result=result>flag?result:flag;
        }
        return result;
    }
}
