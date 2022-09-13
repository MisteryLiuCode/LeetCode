public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.binaryGap(5));
    }

    public int binaryGap(int n) {
//        转化成二进制
        String str="";
        while (n!=0){
            str=n%2+str;
            n/=2;
        }
        int left=0;
        int max=0;
        for (int i=0;i<str.length();i++){
            int num=str.charAt(i)-'0';
            if (num==1){
                int len=i-left;
                max=Math.max(max,len);
                left=i;
            }
        }
        return max;
    }

}
