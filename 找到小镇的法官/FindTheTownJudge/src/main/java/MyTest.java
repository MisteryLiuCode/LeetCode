import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[][] trust = new int[][]{{1, 3}, {2, 3}};
//        int[][] trust = new int[][]{{1, 3}, {2, 3}};
//        int[][] trust = new int[][]{{1, 3}, {2, 3},{3,1}};
        int[][] trust = new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}};
        System.out.println(myTest.findJudge(4, trust));

    }


    public int findJudge(int n, int[][] trust) {
        if (trust.length==0){
            if (n==1){
                return 1;
            }
            else {
                return -1;
            }
        }
        ArrayList<Integer> res = new ArrayList<>();
//        被信任的作为key，信任他的为value
        HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        for (int i = 0; i < trust.length; i++) {
            if (!map.containsKey(trust[i][1])) {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(trust[i][0]);
                map.put(trust[i][1], list);
            } else {
                ArrayList list = map.get(trust[i][1]);
                list.add(trust[i][0]);
                map.put(trust[i][1], list);
            }
        }
//        把符合   每个人（除了小镇法官）都信任这位小镇法官。  这条记录添加list,
//        遍历map
        for (Integer key : map.keySet()) {
            if (map.get(key).size() == n - 1) {
                ArrayList<Integer> list = map.get(key);
                Collections.sort(list);
                int k = 1;
                Boolean flag=false;
                for (int i = 0; i < list.size(); i++) {
                    if (!list.get(i).equals(key)) {
                        if (k == key) {
                            flag=true;
                            res.add(key);
                        }
                        k++;
                    }
                }
                if (flag==false && key==n){
                    res.add(key);
                }
            }
        }


//        保证法官不会信任其他人
        Boolean flag=true;
        for (Integer re : res) {
            flag=true;
            for (Integer key : map.keySet()) {
                ArrayList<Integer> list = map.get(key);
                if (list.contains(re)){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                return re;
            }
        }
        return -1;
    }

}
