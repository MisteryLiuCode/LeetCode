import java.util.ArrayList;
import java.util.List;

/**
 * @program: CountTheNumberOfItemsMatchingTheSearchRules
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-28 16:49
 **/


public class MyTest {
    public static void main(String[] args) {
        ArrayList<String> item1 = new ArrayList<>();
        ArrayList<String> item2 = new ArrayList<>();
        ArrayList<String> item3 = new ArrayList<>();
        List<List<String>> items=new ArrayList<>();
        items.add(item1);
        items.add(item2);
        items.add(item3);
        String ruleKey="color";
        String ruleValue="silver";
        MyTest myTest = new MyTest();
        System.out.println(myTest.countMatches(items, ruleKey, ruleValue));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int result=0;
        int index=0;
        switch (ruleKey){
            case "color":
                index=1;
                break;
            case "name" :
                index=2;
                break;
        }
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i));
            if (items.get(i).get(index).equals(ruleValue)){
                result++;
            }
        }
        return result;
    }


}
