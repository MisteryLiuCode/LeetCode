/**
 * @program: RansomLetter
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-17 18:50
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.canConstruct("aa", "ab"));
    }
    public boolean canConstruct(String ransomNote, String magazine) {
        char flag;
        if (ransomNote.length()>magazine.length()){
            return false;
        }
        for (int i=0;i<ransomNote.length();i++) {
            flag='0';
            for (int j = 0; j < magazine.length(); j++) {
                if(magazine.charAt(j)==ransomNote.charAt(i)){
                    flag=magazine.charAt(j);
                    break;
                }
            }
            if (flag=='0'){
                return false;
            }
            else {
                magazine=magazine.replaceFirst(String.valueOf(flag),"");
            }
        }
        return true;
    }
}
