import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr=new int[]{2,2,2,2,4};
        System.out.println(myTest.findLucky(arr));

    }

    public int findLucky(int[] arr) {
        int max=-1;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i], 0)+1);
        }
        for (Integer key : map.keySet()) {
            if (key==map.get(key)){
                max=Math.max(max,key);
            }
        }
        return max;
    }
}
