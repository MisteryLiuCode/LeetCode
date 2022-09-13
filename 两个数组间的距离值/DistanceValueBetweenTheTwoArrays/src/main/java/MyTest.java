public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr1=new int[]{4,5,8};
        int[] arr2=new int[]{10,9,1,8};
        System.out.println(myTest.findTheDistanceValue(arr1, arr2, 2));
    }

    public int findTheDistanceValue(int[] arr1, int[] arr2, int d) {
        int len=arr2.length;
        int res=0;
        for (int i=0;i<arr1.length;i++){
            int sum=0;
            for (int j=0;j<arr2.length;j++){
                if (Math.abs(arr1[i]-arr2[j])>d){
                    sum++;
                }
            }
            if (sum==len){
                res++;
            }
        }
        return res;
    }
}
