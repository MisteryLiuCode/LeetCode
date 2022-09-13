import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.secondHighest("dfa12321afd"));
    }

    public int secondHighest(String s) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < s.length(); i++) {
            int num = s.charAt(i) - '0';
            if (num < 10 && num >= 0) {
                set.add(num);
            }
        }
        if (set.size() > 1) {
            List<Integer> list = new ArrayList(set);
            return list.get(list.size() - 2);
        }
        else {
            return -1;
        }
    }

}
