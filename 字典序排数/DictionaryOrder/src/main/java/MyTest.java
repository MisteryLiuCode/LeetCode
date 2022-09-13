import java.util.ArrayList;
import java.util.List;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.lexicalOrder(12));
    }

    public List<Integer> lexicalOrder(int n) {
        List<Integer> list = new ArrayList<>();
        TreeSet<String> set = new TreeSet<>();
        for(int i=1;i<=n;i++){
            String s = String.valueOf(i);
            set.add(s);
        }
        for (String s : set) {
            list.add(Integer.valueOf(s));
        }
        return list;
    }
}
