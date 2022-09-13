import java.util.ArrayList;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        String[] ops=new String[]{"5","2","C","D","+"};
        String[] ops2=new String[]{"5","-2","4","C","D","9","+","+"};
        System.out.println(myTest.calPoints(ops2));
    }

    public int calPoints(String[] ops) {
        int res=0;
//        创建一个list保存有效数据
        ArrayList<Integer> list = new ArrayList<>();

        for (int i=0;i< ops.length;i++){
            if (ops[i].equals("+")){
                list.add(list.get(list.size()-1)+list.get(list.size()-2));
            }
            else if (ops[i].equals("D")){
                list.add(list.get(list.size()-1)*2);
            }
            else if (ops[i].equals("C")){
                list.remove(list.size()-1);
            }
            else {
                list.add(Integer.valueOf(ops[i]));
            }
        }

        for (Integer num : list) {
            res+=num;
        }
        return res;
    }
}
