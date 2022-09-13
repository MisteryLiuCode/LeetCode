/**
 * @program: WaterThePlants
 * @description:
 * @author: 刘帅彪
 * @create: 2022-01-27 16:30
 **/


public class MyTest {
    public static void main(String[] args) {
        MyTest myTest = new MyTest();
        int[] plants=new int[]{7,7,7,7,7,7,7};
        System.out.println(myTest.wateringPlants(plants, 8));
    }

    public int wateringPlants(int[] plants, int capacity) {
        int cloneCapacity=capacity;
//        记录步数
        int steps=0;
//        遍历数组
        for (int i=0;i<plants.length;i++){
            if (plants[i]>capacity){
//                原题要求的是走到上一步，如果发现下一个不够了就直接回去，再回到这一步
//                而这样直接到这一步了，发现不够回去，多走了一步，所以减去
                steps+=2*(i+1)-1;
//                加满水
                capacity=cloneCapacity;
//                减去此时植物所需要的水
                capacity-=plants[i];
            }else {
//                如果水够，直接减去，步数+1
                capacity-=plants[i];
                steps++;
            }
        }
        return steps;
    }
}
