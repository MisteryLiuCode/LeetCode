import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public int peakIndexInMountainArray1(int[] arr) {
        int res=0;
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                res=i;
            }
        }
        return res;
    }

    public int peakIndexInMountainArray(int[] arr) {
        int mid=0;
        int left=0;
        int right=arr.length-1;
        while (left<right){
            mid=(left+right)/2;
            if (arr[mid]<arr[mid+1] && arr[mid]>arr[mid-1]){
                left=mid;
            }
            else if (arr[mid]>arr[mid+1] && arr[mid]<arr[mid-1]){
                right=mid;
            }
            else if (arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                break;
            }
        }
        return mid;
    }
}
