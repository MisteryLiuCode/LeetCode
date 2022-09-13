import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeSet;

/**
 * @program: SecondLargestNumberInAString
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-14 18:08
 **/


public class MyTestTwo {

    public int secondHighest(String s) {
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> set = new TreeSet<>();
        for (int i=0;i<s.length();i++){
            int num=s.charAt(i)-'0';
            if (num<10 && num>=0){
                map.put(num,map.getOrDefault(num,0)+1);
            }
        }
        int [] re=new int[map.size()];









        Iterator<Integer> it = set.iterator(); //Iterator 接口
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        while (it.hasNext()) {
            count++;
            list.add(it.next());
        }
        if (count>1){
            return list.get(list.size()-2);
        }
        else {
            return -1;
        }
    }



}
