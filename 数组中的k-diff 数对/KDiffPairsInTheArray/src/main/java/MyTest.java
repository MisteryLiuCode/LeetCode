import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MyTest {
    public int findPairs(int[] nums, int k) {
        int sum=0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            map.put(num,map.getOrDefault(num,0)+1);
        }
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()){
            if (k==0){
                if (map.get(iterator.next())>1){
                    sum++;
                }
            }
            else{
                if (map.containsKey(k+iterator.next())){
                    sum++;
                }
            }
        }
        return sum;
    }
}
