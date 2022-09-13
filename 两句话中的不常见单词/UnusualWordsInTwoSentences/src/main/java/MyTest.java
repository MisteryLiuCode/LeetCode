import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        myTest.uncommonFromSentences("this apple is sweet","this apple is sour");
    }

    public String[] uncommonFromSentences(String s1, String s2) {
        ArrayList<String> list = new ArrayList<>();
        String s=s1+" "+s2;
        String[] sSplit = s.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (int i=0;i<sSplit.length;i++){
            if (map.containsKey(sSplit[i])){
                Integer value = map.get(sSplit[i]);
                map.put(sSplit[i],value+1);
                continue;
            }
            map.put(sSplit[i],1);
        }
        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            if (map.get(key)==1){
                list.add(key);
            }
        }
        String[] res = new String[list.size()];
        return list.toArray(res);
    }

}
