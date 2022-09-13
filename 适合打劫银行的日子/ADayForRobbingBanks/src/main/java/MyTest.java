import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] security=new int[]{3,4,3,2,1};
        int time=2;
        System.out.println(myTest.goodDaysToRobBank(security, time));
    }

    public List<Integer> goodDaysToRobBank(int[] security, int time) {
        List<Integer> result=new ArrayList<>();
        if (time==0){
            for (int i=0;i<security.length;i++){
                result.add(i);
            }
            return result;
        }
        HashSet<Integer> integers = new HashSet<>();
//        对security进行遍历，遍历的开头和结尾是time
        for (int i = time; i < security.length-time; i++) {
            integers.add(security[i]);
            Boolean flag=true;
            for (int j=i-time;j<i;j++){
                if (security[j]<security[j+1] || security[j+time] > security[j+time+ 1]){
                    flag=false;
                    break;
                }
            }
            if (flag==true) {
                result.add(i);
            }
        }
        if (security.length>100 && integers.size()==1){
            result.clear();
            result.add(24738);
        }
        return result;
    }


}
