import java.util.ArrayList;
import java.util.List;

/**
 * @program: NeedTable
 * @description:
 * @author: 刘帅彪
 * @create: 2022-03-05 14:47
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        List<List<Integer>> list=new ArrayList<>(3);
        ArrayList<Integer> list1 = new ArrayList<>();
        ArrayList<Integer> list2 = new ArrayList<>();
        ArrayList<Integer> list3 = new ArrayList<>();
        list1.add(1);
        list1.add(2);

        list2.add(2);
        list2.add(3);

        list3.add(5);
        list3.add(4);

        list.add(list1);
        list.add(list2);
        list.add(list3);
        System.out.println(myTest.needTable(5, list));
    }

    public int needTable(int n,List<List<Integer>> list){
        int result=list.size();
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                if (list.get(i).get(0).equals(list.get(j).get(0))
                        || list.get(i).get(0).equals(list.get(j).get(1))
                        || list.get(i).get(1).equals(list.get(j).get(0)) || list.get(i).get(1).equals(list.get(j).get(1))){
                    result--;
                    break;
                }
            }
        }
        return result;
    }
}
