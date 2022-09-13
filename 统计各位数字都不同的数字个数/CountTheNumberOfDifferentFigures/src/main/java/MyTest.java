public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.countNumbersWithUniqueDigits(2));
    }

    public int countNumbersWithUniqueDigits(int n) {
        /**
         * n=0 rs=1
         * n=1 res=1+9
         * n=2 1+9+9*9
         * n=3 1+9+9*9+9*8
         *
         * 第一位要除去0，所以一共有9位
         * 第二位除去第一位有8个
         * 第三位除去前两位 有7个
         * 以此类推
         */
        if (n==0){
            return 1;
        }
        int res=1;
        int mul=9;
        for (int i=1;i<=n;i++){
            res=mul+res;
            mul*=(10-i);
        }
        return res;
    }

}
