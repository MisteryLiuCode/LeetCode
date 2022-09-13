public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        System.out.println(myTest.countPrimeSetBits(6, 10));
        System.out.println(myTest.countPrimeSetBits(10, 15));
    }
    public int countPrimeSetBits(int left, int right) {
        int res=0;
        for (int i=left;i<=right;i++){
//            把数字转化成二进制
            int count=tranBinary(i);
//            判断个数是否是质数
             res+=primeNumber(count)?1:0;
        }
        return res;
    }
    public Integer tranBinary(int n){
        int res=0;
        while (n!=0){
            int n1=n%2;
            if (n1==1){
                res++;
            }
            n/=2;
        }
        return res;
    }
    public Boolean primeNumber(int n){
        if (n==1){
            return false;
        }
        for (int i=2;i<n;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }

}
