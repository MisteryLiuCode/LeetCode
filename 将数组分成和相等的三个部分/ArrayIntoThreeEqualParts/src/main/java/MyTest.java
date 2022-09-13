public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
//        int[] arr=new int[]{0,2,1,-6,6,-7,9,1,2,0,1};
//        int[] arr=new int[]{0,2,1,-6,6,7,9,-1,2,0,1};
//        int[] arr=new int[]{3,3,6,5,-2,2,5,1,-9,4};
        int[] arr=new int[]{1,-1,1,-1};
        System.out.println(myTest.canThreePartsEqualSum(arr));

    }
    public boolean canThreePartsEqualSum(int[] arr) {
//        定义两个指针
        int left=0;
        int right=arr.length-1;
        int leftSum=arr[left];
        int rightSum=arr[right];
        Boolean flag=false;
        int sum=0;
//        求和
        for (int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        if (sum%3!=0){
            return false;
        }
        int avg=sum/3;
        while (left<right){
            if (leftSum!=avg){
                leftSum+=arr[left];
                left++;
            }
            if (rightSum!=avg){
                rightSum+=arr[right];
                right--;
            }
            if (leftSum==avg && rightSum==avg){
                flag=true;
                break;
            }
        }
        if (left-right>=-1){
            return false;
        }
        return flag;
    }
}
