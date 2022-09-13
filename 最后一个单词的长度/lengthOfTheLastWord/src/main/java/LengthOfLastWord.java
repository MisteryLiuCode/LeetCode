/**
 * @program: lengthOfTheLastWord
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-15 20:14
 **/


public class LengthOfLastWord {
    public static void main(String[] args) {
        LengthOfLastWord lengthOfLastWord = new LengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord(""));
    }
    public int lengthOfLastWord(String s) {
        String s1 = s.trim();
        int reslut=0;
        if (s.length()==0) {
            return reslut;
        }
        for(int i=s1.length();i>=1;i--){
            if (s1.substring(i-1,i).equals(" ")){
                break;
            }
            else {
                reslut++;
            }
        }
        return reslut;
    }


}
