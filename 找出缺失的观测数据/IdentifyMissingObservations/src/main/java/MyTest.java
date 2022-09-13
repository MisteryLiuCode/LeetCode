import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[] rolls=new int[]{3,2,4,3};
//        int[] rolls=new int[]{1,5,6};
//        int[] rolls=new int[]{1,2,3,4};
//        int[] rolls=new int[]{3,5,3};
//        int[] rolls=new int[]{1,5,6};
//        int[] rolls=new int[]{6,3,4,3,5,3};
        int[] rolls=new int[]{4,2,2,5,4,5,4,5,3,3,6,1,2,4,2,1,6,5,4,2,3,4,2,3,3,5,4,1,4,4,5,3,6,1,5,2,3,3,6,1,6,4,1,3};
        System.out.println(Arrays.toString(myTest.missingRolls(rolls, 2, 53)));
    }

    public int[] missingRolls(int[] rolls, int mean, int n) {
        int[] res=new int[n];

        int sum=0;
//        求现在数的总和
        for (int i = 0; i < rolls.length; i++) {
            sum+=rolls[i];
        }
//        求应该的总和
        int sumMax=(rolls.length+n)*mean;

//        求差值
        int difference=sumMax-sum;
//        求平均数
        int avg=difference/n;

//        分两种情况，如果 平均数向上取整大于6，或者平均数等于6，但是求余>0,那么月请返回空
        if (Math.ceil((double)difference/n)>6 || avg==6 && difference%n>0 || avg<=0 ){
            return new int[]{};
        }
        else {
//            对每一个数赋值avg
            for (int i=0;i<n;i++){
                res[i]=avg;
            }
//            对多余的情况进行分发
            for (int i=0;i<difference%n;i++){
                res[i]+=1;
            }
        }
        return res;
    }
}
