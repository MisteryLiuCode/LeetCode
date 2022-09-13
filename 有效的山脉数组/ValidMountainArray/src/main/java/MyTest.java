public class MyTest {
    public static void main(String[] args) {
//        int[] arr=new int[]{0,3,2,1};
        int[] arr=new int[]{1,3,2};
//        int[] arr=new int[]{2,1};
        MyTest myTest = new MyTest();
        System.out.println(myTest.validMountainArray(arr));
    }

    public boolean validMountainArray1(int[] arr) {
        int flag=0;
        for (int i = 1; i < arr.length-1; i++) {
//            如果遇到一个山峰
            if (arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                flag++;
            }
//            如果遇到平的，或者凹下去的
            if (arr[i]==arr[i-1] || arr[i]==arr[i+1] || arr[i]<arr[i-1] && arr[i]<=arr[i+1] ){
                return false;
            }
        }
//        判断最后一个数是否造成了山峰
        if(flag==1 && arr[arr.length-2]>arr[arr.length-1]){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean validMountainArray(int[] arr) {
        if (arr.length<3){
            return false;
        }
        int left=0;
        int right=arr.length-1;

        while (left<arr.length-1 && arr[left]<arr[left+1] ){
            left++;
        }

        while (right>0 && arr[right]<arr[right-1]){
            right--;
        }

//        如果两个指针相等，并且不在开始和结尾的时候返回true
        if (left==right && left!=0 && right !=arr.length-1){
            return true;
        }
        return false;
    }


}
