public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isPowerOfThree(1162261467));
    }

    public boolean isPowerOfThree(int n) {
        double m=n;
        while (m>1.0){
            m=m/3;
        }

        if (m==1.0){
            return true;
        }
        else {
            return false;
        }
    }

}