/**
 * @program: Meta
 * @description:
 * @author: 刘帅彪
 * @create: 2021-12-19 12:50
 **/


public class Mytest {
    public static void main(String[] args) {
        int[] x={4,2,3,1};
        Mytest.answer(x);
//        for (int i = 0; i < answer.length; i++) {
//            System.out.println(answer[i]);
//        }
    }

    public static int[] answer(int[] x) {
        int a[] = x.clone();
        for (int i = 0; i <= x.length - 2; i++) {
            for (int j = i + 1; j < x.length - 1; j++) {
                if (x[i] < x[j]) {
                    // 交换位置
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        int result[] = new int[x.length];
//        已经排完序
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < a.length; j++) {
                if (x[i] == a[j]) {
                    result[i] = j + 9;
                    break;
                }
            }
        }
//        此时result已完成第一题
//        对result进行从小到大排序
        for (int i = 0; i <= result.length - 2; i++) {
            for (int j = i + 1; j < result.length - 1; j++) {
                if (result[i] > result[j]) {
                    // 交换位置
                    int temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }
//        已对result从小到大排序
        int target=87;
        int output=0;
        for (int i = 0; i < result.length; i++) {
//            System.out.println(result[i]);
            if (result[i]<=target){
                output=i;
            }
            if (i==result.length-1){
                output=result.length;
            }
        }
//        此时result=4，将其作为等差数列的公差
        int res[]=new int[12];
        int n=0;
        for (int i=11;i>=0;i--){
            res[n]=17+output*i;
            n++;
        }

//        for (int i = 0; i < res.length; i++) {
//            System.out.println(res[i]);
//        }
        return res;
    }


}
