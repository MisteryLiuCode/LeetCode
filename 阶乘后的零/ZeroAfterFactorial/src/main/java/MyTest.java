public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.trailingZeroes(3));
    }

    public int trailingZeroes(int n) {
        int ans=0;
        while(n!=0){
            n/=5;
            ans+=n;
        }
        return ans;
    }

}
