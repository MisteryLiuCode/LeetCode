import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr=new int[]{-3,0,1,-3,1,1,1,-3,10,0};
        System.out.println(myTest.uniqueOccurrences(arr));
    }

    public boolean uniqueOccurrences(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(arr);
        int left=0;
        int num=1;
        left=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]!=left){
                if (!set.add(num)){
                    return false;
                }
                num=0;
                left=arr[i];
            }
            num++;
        }
        if (!set.add(num)){
            return false;
        }
        return true;
    }
}
