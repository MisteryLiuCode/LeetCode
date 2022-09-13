/**
 * @program: CountTheNumberOfCombatUnits
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-23 14:00
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] rating=new int[]{2,1,3};
        System.out.println(myTest.numTeams(rating));
    }
    public int numTeams(int[] rating) {
        int result=0;
        int flag=-1;
        for (int i=0;i<rating.length;i++){
            for (int j=i+1;j< rating.length;j++){
                if (rating[i]<rating[j]){
                    flag=0;
                }
                else {
                    flag=1;
                }
                for (int k=j+1;k< rating.length;k++){
                    if (flag==0){
                        if (rating[k]> rating[j]){
                            result++;
                        }
                    }
                    else if (flag==1){
                        if (rating[k]<rating[j]){
                            result++;
                        }
                    }
                }
            }
        }
        return result;
    }

}
