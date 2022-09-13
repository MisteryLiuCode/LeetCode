public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.isPowerOfFour(16));
    }

    public boolean isPowerOfFour(int n) {
        if (n<=0){
            return false;
        }
        Boolean flag=true;
        while (flag){
            if (n==1){
                return true;
            }
            if (n%4!=0){
                return false;
            }
            n=n/4;
        }
        return false;
    }


}
