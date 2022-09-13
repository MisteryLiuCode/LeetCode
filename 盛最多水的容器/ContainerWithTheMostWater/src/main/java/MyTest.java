/**
 * @program: ContainerWithTheMostWater
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-25 20:30
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] height=new int[]{1,3,2,5,25,24,5};
        System.out.println(myTest.maxArea(height));
    }

    public int maxArea(int[] height) {
//       创建两个指针，一个指向开头一个指向结尾
        int begin=0;
        int previous=0;
        int end=height.length-1;
        int max=0;
        int area=0;
        int hight=0;
        int flag=-1;
        for (int i=0;i<height.length;i++){
            if (flag==0 && previous>=height[begin]){
                if (height[begin]<=height[end]){
                    previous=height[begin];
                    begin++;
                    flag=0;
                }else {
                    previous=height[end];
                    flag=1;
                    end--;
                }
                continue;
            }
            if (flag==1 && previous>=height[end]){
                if (height[begin]<=height[end]){
                    previous=height[begin];
                    begin++;
                    flag=0;
                }else {
                    previous=height[end];
                    flag=1;
                    end--;
                }
                continue;
            }
            hight=height[begin]<height[end]?height[begin]:height[end];
            area=(end-begin)*hight;
            if (max<area){
                max=area;
            }
            if (height[begin]<=height[end]){
                previous=height[begin];
                begin++;
                flag=0;
            }else {
                previous=height[end];
                flag=1;
                end--;
            }
        }
        return max;
    }
}
