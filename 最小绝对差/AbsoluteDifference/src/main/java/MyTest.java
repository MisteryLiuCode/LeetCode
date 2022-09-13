import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(arr);
        int len = Integer.MAX_VALUE;
        for (int i = 1; i < arr.length; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            int dis = arr[i] - arr[i - 1];
            if (dis <= len) {
                if (dis < len) {
                    len = dis;
                    res.clear();
                }
                list.add(arr[i - 1]);
                list.add(arr[i]);
                res.add(list);
            }
        }
        return res;
    }
}
