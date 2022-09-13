public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] flowerbed=new int[]{0};
        System.out.println(myTest.canPlaceFlowers(flowerbed,0));
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        如果长度为0，直接返回false
        if (flowerbed.length==0){
            return false;
        }
//        如果长度为1并且第一个数为0
        if (flowerbed.length==1 && flowerbed[0]==0){
//            如果画的个数<=1，直接返回true
            if (n<=1){
                return true;
            }
//            否则返回false
            else {
                return false;
            }
        }
//        判断开头是否有两个0
        if (flowerbed[0]==0 && flowerbed[1]==0){
            flowerbed[0]=1;
            n--;
        }
//        如果有三个连续的0，则符合要求
        for (int i = 0; i < flowerbed.length-2; i++) {
            if (flowerbed[i]==0 && flowerbed[i+1]==0 && flowerbed[i+2]==0){
                flowerbed[i+1]=1;
                n--;
            }
        }
//        如果最后两个数等于0，那么也符合要求
        if (flowerbed[flowerbed.length-1]==0 && flowerbed[flowerbed.length-2]==0){
            n--;
        }
        return n<=0?true:false;
    }


}