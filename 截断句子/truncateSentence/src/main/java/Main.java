/**
 * @program: truncateSentence
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-06 10:19
 **/


public class Main {
    public static void main(String[] args) {
        Test01 test01 = new Test01();
        String s = test01.truncateSentence("What is the solution to this problem", 4);
//        System.out.println(s);

        MyTest myTest = new MyTest();
        String s1 = myTest.truncateSentence("What is the solution to this problem", 3);
        System.out.println(s1);
    }
}
