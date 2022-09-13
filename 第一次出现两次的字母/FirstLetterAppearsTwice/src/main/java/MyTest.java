import java.util.HashSet;

/**
 * @ClassName MyTest
 * @Description
 * @Author 刘帅彪
 * @Date2022/7/24 12:24
 **/
public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        String s="abccbaacz";
        String s="eesll";
        System.out.println(myTest.repeatedCharacter(s));
    }
    public char repeatedCharacter(String s) {
        char res = 0;
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<s.length();i++){
            if (!set.add(s.charAt(i))){
                res=s.charAt(i);
                break;
            }
        }
        return res;
    }
}
