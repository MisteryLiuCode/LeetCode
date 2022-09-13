import java.util.Arrays;
import java.util.HashMap;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(4,3);
//        map.put(2,2);
        System.out.println(myTest.maxGoods(map, 5));
    }

    public int maxGoods(HashMap<Integer,Integer> map,int num){
        int result=0;
//        创立一个数组，存储每个map的key
        int[] nums=new int[map.size()];
        int i=0;
        for(Integer key : map.keySet()){
            nums[i]=key;
            i++;
        }
        int temp=0;
//        对nums遍历
        Arrays.sort(nums);
//        对nums遍历
        for (int j = 0; j < nums.length; j++) {
            if (num>0){
//                记录用的最后一个容量
                temp=nums[j];
//                减去全部此类商品
                num-=map.get(nums[j])*nums[j];
//                result加上此类型全部的数量
                result+=map.get(nums[j]);
            }
            else {
                break;
            }
        }

        if (num<0){
            if (Math.abs(num)%temp>0){
                result-=Math.abs(num)/temp+1;
            }
            else {
                result-=Math.abs(num)/temp;
            }
        }
        return result;
    }


}
