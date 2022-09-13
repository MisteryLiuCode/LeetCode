import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
/**
 * @program: Algorithm
 * @description: 通过value获取key
 * @author: 刘帅彪
 * @create: 2021-10-30 19:17
 **/
public class GetKeyThroughValue {
    public static Set<Integer> getKeySet(Map<Integer, Integer> map, Integer value) {
        Set<Integer> keySet = new LinkedHashSet<Integer>();
        for (Integer k : map.keySet()) {
            if (map.get(k).equals(value)) {
                keySet.add(k);
            }
        }
        return keySet;
    }
}
