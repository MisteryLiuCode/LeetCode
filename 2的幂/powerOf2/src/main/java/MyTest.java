public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isPowerOfTwo(8));
    }


    public boolean isPowerOfTwo(int n) {
        if (n<1){
            return false;
        }
        while (n%2==0){
            n/=2;
        }
        return n==1;
    }


}
