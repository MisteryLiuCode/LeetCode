import java.util.ArrayList;
import java.util.List;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        System.out.println(myTest.generatePossibleNextMoves("+-"));
    }
    public List<String> generatePossibleNextMoves(String currentState) {
        List<String> list=new ArrayList<>();
        int count=0;
        for (int i=0;i<currentState.length()-1;i++){
            if (currentState.charAt(i)=='+' && currentState.charAt(i+1)=='+'){
                StringBuilder stringBuilder=new StringBuilder(currentState);
                StringBuilder newCur=stringBuilder.replace(i,i+2,"--");
                list.add(newCur.toString());
                count++;
            }

        }
        if (count==0){
            list.clear();
            return list;
        }
        return list;
    }


}
