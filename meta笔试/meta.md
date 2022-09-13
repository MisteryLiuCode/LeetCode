meta

今天我发现meta给我发了笔试的链接，这个公司的产品就是类似于元宇宙，一些vr产品，看网上说是受众大多是儿童。我发现他们的笔试比较不一样，并不是一道题一道题，每一道题分为几道小题，这几道小题都不难，但每道题的结果是作为下一道小题的参数，也就是说如果某一道题不会，或者做错，那么之后的题也会出错。总共有四道大题，每一道大题又分为四道小题，我做题还是太慢了，只做了两道题，就快没时间了，就提交了，而且前两道题我也忘记截屏了，这里只能放上代码

第一道题：看注释还能大概可以猜出来

```java
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
```

第二道题：

```java
public class Test2 {
    public static void main(String[] args) {
        int [] x={4,3,2,15};
        int answer = Test2.answer(x);
        System.out.println(answer);
    }

    public static int answer(int[] x) {
        int n=29;
//        对数组从小到大进行排序
        for (int i = 0; i <= x.length - 2; i++) {
            for (int j = i + 1; j < x.length - 1; j++) {
                if (x[i] > x[j]) {
                    // 交换位置
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
//        System.out.println(Arrays.toString(x));
//        数组已经从小到大进行排序
        int output=0;
        for (int i = 0; i < x.length; i++) {
            if (n<=x[i]) {
                output = i;
            }
            if (i==x.length-1){
                output=x.length;
            }
            }
//        System.out.println(output);
        //        4作为输入，求约数
        List<Integer> list=new ArrayList<Integer>();
        for (int i = 1; i <=output; i++) {
            list.add(i);
        }
//    双重循环判断约数
        List<Integer> res=new ArrayList<Integer>();
            for (int j = 0; j < output; j++) {
                if ( output%list.get(j)==0){
                    res.add(list.get(j));
                }
            }
//            判断数组的长度是否为0，如果为0，则返回6
        if (res.size()==0){
            return 6;
        }
//        1,2,3,4,5,6,

        int result=0;
        if (res.size()%2==1){
            if (res.size()>=7){
                for (int i=res.size()/2-3;i<=res.size()/2+3;i++){
                    result+=res.get(i);
                }
            }
            else {
                for (int i = 0; i < res.size(); i++) {
                    result+=res.get(i);
                }
            }
        }
        else {
            if (res.size()>=6){
                for (int i=res.size()/2-3;i<=res.size()/2+3;i++){
                    result+=res.get(i);
                }
            }
            else {
                for (int i = 0; i < res.size(); i++) {
                    result+=res.get(i);
                }
            }
        }


        return result;
        }

    }
```

能放在前两道题上估计也不会太难，有空把后两道做了。

后两道题目：

第三道题竟然没有截全。。。。。



![image-20211219152003956](https://gitee.com/misteryliu/typora/raw/master/image/image-20211219152003956.png)

![image-20211219151940598](https://gitee.com/misteryliu/typora/raw/master/image/image-20211219151940598.png)



