import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @program: PancakeSorting
 * @description:
 * @author: 刘帅彪
 * @create: 2022-02-19 15:18
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] arr=new int[]{1,3,4,2};
        /*1、4，3，1，2     3
             2，1，3，4     4
             3，1，2，4     3
             2，1，3，4     3
             2，1，3，4     1
             1，2，3，4     2

        * */
        System.out.println(myTest.pancakeSort(arr));
    }

    public List<Integer> pancakeSort(int[] arr) {
//        记录结果
        List<Integer> result=new ArrayList<>();
//       设定指针指向最后一个数
        int temp=arr.length-1;
//        对数组排序，并且克隆数组
        int[] cloneArr=arr.clone();
        Arrays.sort(arr);
//        创建一个新的数组存储翻转后的数组，然后再赋值给原数组

//        对排序数组遍历
        for (int i=arr.length-1;i>=0;i--){
//            对原数组遍历
            for (int j=0;j<cloneArr.length;j++){

                if (arr[i]==cloneArr[j]){
                    //                设定一个指针，来记录第一次翻转，起初指向0，每赋值一次，就++
                    int oneExchangeTemp=0;
                    int[] flipArr=new int[arr.length];
//                    把一个结果添加进去
                    result.add(j+1);
//                    从这里开始，往前是反着遍历，赋值
                    for (int m=j;m>=0;m--){
                        flipArr[oneExchangeTemp]=cloneArr[m];
                        oneExchangeTemp++;
                    }
//                    往后是正着遍历，赋值
                    for (int n=j+1;n<cloneArr.length;n++){
                        flipArr[n]=cloneArr[n];
                    }
                    int[] flipArrClone=flipArr.clone();
                    cloneArr=flipArr;
//                    完成了第一次翻转，需要再次从未确定的位置翻转
                    int twoExchangeTemp=0;
                    for (int m=temp;m>=0;m--){
                        cloneArr[m]=flipArrClone[twoExchangeTemp];
                        twoExchangeTemp++;
                    }
                    result.add(temp+1);
                    temp--;
                    break;
                }
            }
        }
        return result;
    }

}
