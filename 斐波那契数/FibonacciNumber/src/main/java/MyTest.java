public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.fib(4));
    }

    public int fib(int n) {
        if (n==0){
            return 0;
        }
//        初始化前两个数
        int a=0;
        int b=1;
//        初始化c=1，对应n=1时
        int c=1;
        for (int i=1;i<n;i++){
            c=a+b;
            a=b;
            b=c;
        }
        return c;
    }


}
