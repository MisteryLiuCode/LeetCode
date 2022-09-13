import java.util.*;

public class MyTest {
    public static void main(String[] args) {
        int[] ques=new int[]{2,1,6,2};
//        int[] ques=new int[]{1,5,1,3,4,5,2,5,3,3,8,6};
        MyTest myTest = new MyTest();
        System.out.println(myTest.halfQuestions3(ques));
    }
    public int halfQuestions1(int[] questions) {
        int res=0;
//        把数字装进map里，key:数组 value：出现的次数
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int question : questions) {
            map.put(question, map.getOrDefault(question,0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list,new Comparator<Map.Entry<Integer,Integer>>() {
            //value降序排序
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        int n=questions.length/2;
        for (Map.Entry<Integer, Integer> e: list) {
            res++;
            n-=e.getValue();
            if (n<=0){
                break;
            }
        }
        return res;
    }

    public int halfQuestions2(int[] questions) {

        int[] hash = new int[1001];
        for(int num: questions){
            hash[num]++;
        }
        Arrays.sort(hash);
        int total = questions.length / 2;
        int res = 1;
        for(int i=hash.length-1;i>=0;i--){
            total -= hash[i]; // 剩余的
            if(total>0){
                res++;
            }else{
                break;
            }
        }
        return res;
    }

    public int halfQuestions3(int[] questions) {

        int count = questions.length / 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < questions.length; i++) {
            if (map.containsKey(questions[i])) {
                Integer value = map.get(questions[i]);
                map.put(questions[i], value + 1);
            } else {
                map.put(questions[i], 1);
            }
        }

        Collection<Integer> values = map.values();
        ArrayList<Integer> values1 = new ArrayList<>(values);
        Collections.sort(values1);
        int sum = 0;
        int num = 0;
        for (int i = values1.size() - 1; i >= 0; i--) {
            sum += values1.get(i);
            if (sum >= count) {
                num = values1.size() - i;
                break;
            }
        }
        return num;
    }
}
