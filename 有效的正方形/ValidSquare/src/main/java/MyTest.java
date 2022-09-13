import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
    }
    public boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<int[]> list1 = new ArrayList<>();
        list1.add(p1);
        list1.add(p2);
        list1.add(p3);
        list1.add(p4);

        HashSet<Integer> set = new HashSet<>();

        int count = 0;
        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list1.size(); j++) {
                int x1 = list1.get(i)[0];
                int x2 = list1.get(i)[1];
                int y1 = list1.get(j)[0];
                int y2 = list1.get(j)[1];
                int sum1 = (int) Math.pow((x1 - y1), 2);
                int sum2 = (int) Math.pow((x2 - y2), 2);
                int sum3=Math.abs(sum1+sum2);
                if (x1 == y1 && x2==y2) {
                    count++;
                    continue;
                }
                set.add(sum3);
            }
        }
        if (set.size() == 2 && count==4) {
            return true;
        } else {

            return false;
        }
    }



}