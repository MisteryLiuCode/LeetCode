import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr=new int[]{1,0,2,3,0,4,5,0};
        myTest.duplicateZeros(arr);
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                move(arr,i);
                i++;
            }
        }
    }
//    倒着遍历数组
    public void move(int[] arr,int index){
        for (int i = arr.length - 1; i > index; i--) {
            arr[i]=arr[i-1];
        }
    }
}
