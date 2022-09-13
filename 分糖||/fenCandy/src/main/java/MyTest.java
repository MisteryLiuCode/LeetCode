import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(Arrays.toString(myTest.distributeCandies(60, 4)));
    }

    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int n = 0;
        int i=0;
        while (candies>0){
            int index = i % (num_people);
            res[index] +=Math.min(candies,++n);
            candies -= n;
            i++;
        }
        return res;
    }


}
