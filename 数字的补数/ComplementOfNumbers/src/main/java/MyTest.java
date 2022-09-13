public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.findComplement(5));
    }

    public int findComplement(int num) {
        int res=0;
        int i=0;
        while (num!=0){
            int n=num%2>0?0:1;
            res+=n*Math.pow(2,i);
            i++;
            num=num/2;
        }
        return res;
    }

}
