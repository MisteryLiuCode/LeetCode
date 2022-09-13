import java.util.HashSet;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] candyType=new int[]{1,1,2,2};
        System.out.println(myTest.distributeCandies(candyType));
    }

    public int distributeCandies(int[] candyType) {
        int res=0;
        int n=candyType.length/2;
//        创建一个HashSet
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < candyType.length; i++) {
            if (set.add(candyType[i])){
                res++;
            }
            if (set.size()==n){
                break;
            }
        }
        return res;
    }

}
