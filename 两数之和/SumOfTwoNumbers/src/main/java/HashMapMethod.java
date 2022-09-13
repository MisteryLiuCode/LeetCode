import org.junit.Test;

import java.util.HashMap;
import java.util.Set;

/**
 * @program: Algorithm
 * @description: 哈希表的方法
 * @author: 刘帅彪
 * @create: 2021-10-30 10:40
 **/
public class HashMapMethod {
    //    使用hash表的方法解题
//    int [] arr1={2,7,11,15};
    @Test
    public int[] hmm(int[] arr, int target) {
        int res[] = new int[2];
        HashMap<Integer, Integer> map = new HashMap<>();
//        往hashmap里装数据，但是不能把数值装到value里，因为value可能会重复
        for (int i = 0; i < arr.length; i++) {
            map.put(i, arr[i]);
        }
//        从数组里拿数据，看看map里有没有这个数据
        for (int i = 0; i < arr.length; i++) {
            if (map.containsValue(target - arr[i])) {
                Set<Integer> keySet = GetKeyThroughValue.getKeySet(map, (target - arr[i]));
                System.out.println(keySet);
//                    res[1]= Integer.parseInt(keySet.toString());
            }
            res[0]=i;
        }
        return res;
    }
}
