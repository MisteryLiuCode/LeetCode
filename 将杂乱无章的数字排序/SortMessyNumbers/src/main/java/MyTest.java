import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] mapping =new int[]{8,9,4,0,2,1,3,5,7,6};
        int[] nums =new int[]{991,338,38};
        System.out.println(Arrays.toString(myTest.sortJumbled(mapping, nums)));
    }
    /*
    * 对二维数组进行遍历，使用while循环对每一个数进行相除
    * 求maping里面数
    *使用map进行存储
    * */
    public int[] sortJumbled(int[] mapping, int[] nums) {
        int[] result=new int[nums.length];
        int[] finalResult=new int[nums.length];
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int a=nums[i];
            int temp=0;
            int mappingNums=0;
            int n=0;
            while (a!=0){
                temp=a%10;
                a=a/10;
//                获得此时mapping里面的数
                int mapNum=mapping[temp];
                mappingNums+=mapNum*Math.pow(10,n);
                n++;
            }
             /* 方法描述
               991  338  38
               669 0   7 1    7 2
               2
              */
//            while结束循环之后就得到了一个新的映射值
//            设置一个map，把新生成的作为键，旧的作为值，这样在对比键的时候
            map.put(i,mappingNums);
            result[i]=mappingNums;
        }
//        排序
        /*map存储的是
        0>669
        1>7
        2>7
        * */
        /*result存储   669 7 7
        * 排完序  7，7，669
        * */
        Arrays.sort(result);
//        for (int i = 0; i < result.length-1; i++) {
//            if (result[i]!=result[i+1]){
//                List<Integer> key1= getKey(map, result[i]);
//                List<Integer> key2 = getKey(map, result[i+1]);
//                finalResult[i]=nums[key1.get(0)];
//                finalResult[i+1]=nums[key2.get(0)];
//            }
//            else {
////                1,2
//                List<Integer> keys= getKey(map, result[i]);
////                比较k1和k2
//                for (int j = 0; j < keys.size(); j++) {
//
//                }
//                if (key1>key2){
//                    finalResult[i]=nums[key2];
//                    finalResult[i+1]=nums[key1];
//                }
//
//            }
//
//        }

        return finalResult;
    }

    //根据map的value获取map的key
    private static List<Integer> getKey(Map<Integer,Integer> map, Integer value){
        List<Integer> key=new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if(value.equals(entry.getValue())){
                key.add(entry.getKey());
            }
        }
        return key;
    }



}