public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.rotateString("abcde", "cdeab"));
    }

    public boolean rotateString(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }
        if ((s+s).contains(goal)){
            return true;
        }
        return false;
    }


}
