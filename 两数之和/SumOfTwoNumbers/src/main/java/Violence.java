/**
 * @program: Algorithm
 * @description: 暴力破解
 * @author: 刘帅彪
 * @create: 2021-10-30 09:34
 **/
public class Violence {
    public int [] vio(int [] arr,int target){
//        这个方法输入的是一个数组和目标值
        /*算法的基本思想：
        依次从数组中拿出数据进行遍历，依次和后面的数据进行相加
        * */
        int res[]=new int[2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if ((arr[i]+arr[j])==target){
                    res[0]=i;
                    res[1]=j;
                    return res;
                }
            }

        }
        return res;
    }
}
