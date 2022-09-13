public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.minOperations2(3));
    }

    public int minOperations1(int n) {
        int result=0;
//        求总和
        int sum=0;
//        还原数组
        int[] arr=new int[n];
        for (int i=0;i<n;i++){
            sum+=2*i+1;
            arr[i]=2*i+1;
        }
        int avg=sum/n;
        for (int i = 0; i < arr.length; i++) {
            if (avg>arr[i]){
                result+=avg-arr[i];
            }
        }

        return result;

}

    public int minOperations2(int n) {
        int result=0;
//        求总和
        int an=1+(n-1)*2;
        int sum=n*(1+an)/2;
        int avg=sum/n;

        for (int i=0;i<n/2;i++){
            int a=2*i+1;
            result+=avg-a;
        }
        return result;
    }


}