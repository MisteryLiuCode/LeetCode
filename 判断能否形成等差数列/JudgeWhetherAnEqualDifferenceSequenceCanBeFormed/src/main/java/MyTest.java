import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public boolean canMakeArithmeticProgression(int[] arr) {
        if (arr.length==2){
            return true;
        }
        Arrays.sort(arr);
        int n=arr[0]-arr[1];
        for (int i = 0; i < arr.length-1; i++) {
            if ((arr[i]-arr[i+1])!=n){
                return false;
            }
        }
        return true;
    }

}
