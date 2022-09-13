/**
 * @program: DesignGoalParser
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-16 16:33
 **/


public class MyTest {


    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.interpret("(al)G(al)()()G"));
    }

    public String interpret(String command) {
//        对字符遍历
        String result="";
        for (int i=0;i<command.length();i++){
            if (command.charAt(i)=='G'){
                result+="G";
                continue;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)==')'){
                result+="o";
                i=i+1;
                continue;
            }
            if (command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                result+="al";
                i=i+3;
                continue;
            }
        }
        return result;
    }
}
