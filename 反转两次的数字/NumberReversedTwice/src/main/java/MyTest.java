public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public boolean isSameAfterReversals(int num) {
        if (num % 10 == 0 && num != 0) {
            return false;
        }
        return true;
    }


}
