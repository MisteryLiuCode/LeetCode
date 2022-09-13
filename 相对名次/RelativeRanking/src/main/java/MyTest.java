import java.util.Arrays;
import java.util.HashMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] score=new int[]{10,3,8,9,4};
        System.out.println(Arrays.toString(myTest.findRelativeRanks(score)));
    }

    public String[] findRelativeRanks(int[] score) {
        String[] res=new String[score.length];
        int[] cloneScore=score.clone();
        HashMap<Integer,String > map = new HashMap<>();
        Arrays.sort(cloneScore);

        for (int i = cloneScore.length - 1; i >= 0; i--) {
            if (i==cloneScore.length-1){
                map.put(cloneScore[cloneScore.length-1],"Gold Medal");
            }
            else if (i==cloneScore.length-2){
                map.put(cloneScore[cloneScore.length-2],"Silver Medal");
            }
            else if (i==cloneScore.length-3){
                map.put(cloneScore[cloneScore.length-3],"Bronze Medal");
            }
            else {
                map.put(cloneScore[i],String.valueOf(cloneScore.length-i));
            }
        }

        for (int i = 0; i < score.length; i++) {
            res[i]=map.get(score[i]);
        }
        return res;
    }



}
