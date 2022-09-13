import java.util.Arrays;

/**
 * @program: Algorithm
 * @description: 测试算法
 * @author: 刘帅彪
 * @create: 2021-10-30 09:45
 **/


public class Main {
    public static void main(String[] args) {
        Violence violence = new Violence();

//
        int [] arr1={2,7,11,15};
        int [] arr2={3,2,4};
        int [] arr3={3,3};
        int target1=9;
        int target2=6;
//        int[] vio = violence.vio(arr, target);
//        System.out.println(Arrays.toString(violence.vio(arr1, target1)));
//        System.out.println(Arrays.toString(violence.vio(arr2, target2)));
//        System.out.println(Arrays.toString(violence.vio(arr3, target2)));


//
        HashMapMethod hashMapMethod = new HashMapMethod();
//        System.out.println(Arrays.toString(hmm));
//        System.out.println(Arrays.toString(hashMapMethod.hmm(arr2, target2)));
        hashMapMethod.hmm(arr1,target1);
    }
}
