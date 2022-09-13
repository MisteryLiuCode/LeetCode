public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public void duplicateZeros(int[] arr) {
        for (int i=0;i<arr.length;i++){
            if (arr[i]==0){
//                倒着遍历，相邻的进行复制，一直到这个点
                for (int j=arr.length-1;j>i;j--){
                    arr[j]=arr[j-1];
                }
//                跳过下一个i
                i++;
            }
        }
    }

}
