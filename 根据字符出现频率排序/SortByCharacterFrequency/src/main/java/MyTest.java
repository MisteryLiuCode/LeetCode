import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.frequencySort("Aabb"));
    }

    public String frequencySort(String s) {
        if (s.length() == 1) {
            return s;
        }
        String res = "";

//        把字符串转换成char
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

//        把数据转进map里，key为字符，value为数量
        Map map = mapSum(chars);

//        把数量放进数组中,并且排序
        int[] values = arrValue(map);

//        对排好序的value倒叙，通过value获取map里key拼接结果
        return splicingRes(values,res,map);
    }

    //根据value值获取到对应的一个key值
    public static Character getKey(Map<Character, Integer> map, int value) {
        Character key =null;
        //Map,HashMap并没有实现Iteratable接口.不能用于增强for循环.
        for (Character getKey : map.keySet()) {
            if (map.get(getKey).equals(value)) {
                map.put(getKey,-1);
                key = getKey;
                break;
            }
        }
        return key;
        //这个key肯定是最后一个满足该条件的key.
    }

//    每一个字符为key，数量是value
    public static Map mapSum(char[] chars){
        Map<Character, Integer> map = new HashMap<>();
        HashSet<Character> set = new HashSet<>();
        int k = 1;
        for (int i = 0; i < chars.length; i++) {
            if (set.add( chars[i])) {
                k = 1;
                map.put( chars[i], k);
            } else {
                k++;
                map.put( chars[i], k);
            }
        }
        return map;
    }
//    map进行遍历并且放进数组中
    public int[] arrValue(Map map){
        Iterator it = map.entrySet().iterator();
        int[] values = new int[map.size()];
        int m = 0;
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            values[m] = (int) entry.getValue();
            m++;
        }
        Arrays.sort(values);
        return values;
    }

    public String splicingRes(int[] values,String res,Map map){
        for (int i = values.length - 1; i >= 0; i--) {
            Character key = getKey(map, values[i]);
            for (int j=0;j<values[i];j++){
                res+=key;
            }
        }
        return res;
    }

}
