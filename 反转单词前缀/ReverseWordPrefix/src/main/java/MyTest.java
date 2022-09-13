/**
 * @program: ReverseWordPrefix
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-02 14:17
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.reversePrefix("xyxzxe", 'e'));
    }

    public String reversePrefix(String word, char ch) {
        StringBuffer pre=new StringBuffer();
        for (int i=0;i<word.length();i++){
            if (word.charAt(i)==ch){
                pre.append(word.charAt(i));
                word=pre.reverse()+word.substring(i+1,word.length());
                break;
            }
            else {
                pre.append(word.charAt(i));
            }
        }
        return word;
    }
}
