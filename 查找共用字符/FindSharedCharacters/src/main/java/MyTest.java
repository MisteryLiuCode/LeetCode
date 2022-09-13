import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] words=new String[]{"bella","label","roller"};
        System.out.println(myTest.commonChars(words));
    }
    public List<String> commonChars(String[] words) {
        ArrayList<String> res = new ArrayList<>();
        ArrayList<HashMap<Character, Integer>> list = new ArrayList<>();
        for (String word : words) {
            HashMap<Character, Integer> map = new HashMap<>();
            for (int i=0;i<word.length();i++){
                map.put(word.charAt(i),map.getOrDefault(word.charAt(i),0)+1);
            }
            list.add(map);
        }
        HashSet<Character> set = new HashSet<>();
        for (int i=0;i<words[0].length();i++){
            set.add(words[0].charAt(i));
        }
        Object[] array = set.toArray();
        for (int i=0;i<array.length;i++){
            int min=Integer.MAX_VALUE;
            Boolean flag=true;
            for (int j = 0; j < list.size(); j++) {
                min= Math.min(list.get(j).getOrDefault(array[i], 0), min);
                if (min==0){
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                for (int j=0;j<min;j++){
                    res.add(String.valueOf(array[i]));
                }
            }

        }
        return res;
    }
}
