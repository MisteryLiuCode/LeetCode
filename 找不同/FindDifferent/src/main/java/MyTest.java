/**
 * @program: FindDifferent
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-24 23:17
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.findTheDifference("abcd", "abcde"));
    }


    public char findTheDifference(String s, String t) {
        int sCount=0;
        int tCount=0;
        for (int i=0;i<s.length();i++){
            sCount+=s.charAt(i);
        }
        for (int i=0;i<t.length();i++){
            tCount+=t.charAt(i);
        }
        return  (char) (tCount-sCount);
    }


        public char findTheDifferenceTwo(String s, String t) {
            char[] sArray = s.toCharArray();
            char[] tArray = t.toCharArray();
            int sCount=0;
            int tCount=0;
            for (int i=0;i<sArray.length;i++){
                sCount+=sArray[i];
            }
            for (int i=0;i<tArray.length;i++){
                tCount+=tArray[i];
            }
            return  (char) (tCount-sCount);
        }




}
