import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] list1=new String[]{"Shogun", "Tapioca Express", "Burger King", "KFC"};
        String[] list2=new String[]{"Piatti", "The Grill at Torrey Pines", "Hungry Hunter Steakhouse", "Shogun"};
        System.out.println(Arrays.toString(myTest.findRestaurant(list1, list2)));
    }

    public String[] findRestaurant(String[] list1, String[] list2) {
        ArrayList<String> res = new ArrayList<>();
//        创建一个map存储list1的键值
        HashMap<String, Integer> map = new HashMap<>();
//        遍历list1存储键值
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i],i);
        }
//        创建索引和，因为求最小值，所以假设为最大值
        int sum=Integer.MAX_VALUE;
//        对list2进行遍历
        for (int i = 0; i < list2.length; i++) {
//            if map.value=list[i],add result
            if (map.containsKey(list2[i])){
                if (map.get(list2[i])+i<sum){
//                    update sum
                    sum=map.get(list2[i])+i;
                    res.clear();
                    res.add(list2[i]);
                }
                else if (map.get(list2[i])+i==sum){
                    res.add(list2[i]);
                }
            }
        }
        return res.toArray(new String[res.size()]);
    }

}
