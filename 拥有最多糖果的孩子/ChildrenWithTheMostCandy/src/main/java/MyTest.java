import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] candis=new int[]{4,2,1,1,2};
        System.out.println(myTest.kidsWithCandies(candis, 1));
    }

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        List<Boolean> result=new ArrayList<>();

        int max=0;
        for (int i = 0; i < candies.length; i++) {
            if (max<candies[i]){
                max=candies[i];
            }
        }
        for (int i = 0; i < candies.length; i++) {
            if (candies[i]+extraCandies>=max){
                result.add(true);
            }
            else {
                result.add(false);
            }
        }
        return result;
    }


}