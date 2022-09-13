import java.util.Arrays;

public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] g=new int[]{1,2};
        int[] s=new int[]{1,2,3};
        System.out.println(myTest.findContentChildren3(g, s));
    }
    public int findContentChildren(int[] g, int[] s) {
//        对两个数组排序
        Arrays.sort(g);
        Arrays.sort(s);
        int res=0;
        int gn= g.length-1;
        int sn= s.length-1;
        while (gn>=0 && sn>=0){
            if (g[gn]<=s[sn]){
                sn--;
                gn--;
                res++;
            }
            else {
                gn--;
            }
        }
        return res;
    }

        public int findContentChildren2(int[] g, int[] s) {
//        对两个数组排序
            Arrays.sort(g);
            Arrays.sort(s);
            int res=0;
            for (int i = 0; i < g.length; i++) {
                for (int j = 0; j < s.length; j++) {
                    if (g[i]<=s[j]){
                        s[j]=-1;
                        res++;
                        break;
                    }
                }
            }
            return res;
        }


    public int findContentChildren3(int[] g, int[] s) {

        g=sort(g);
        s=sort(s);

        int num=0;
//        s饼干
        int index=0;
        for (int i =s.length-1; i>=0; i--) {

            for (int j=g.length-1-index; j >=0; j--) {
                if (s[i]>=g[j]){
                    index++;
                    num++;
                    break;
                }
                index++;
            }
            if (num==g.length){
                return num;
            }
        }
        return num;
    }

    public int[] sort(int[] arr){
        int temp=0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }
}
