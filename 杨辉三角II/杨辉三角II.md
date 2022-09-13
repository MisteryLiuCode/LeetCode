## 题目：

​	给定一个非负索引 `rowIndex`，返回「杨辉三角」的第 `rowIndex` 行。

在「杨辉三角」中，每个数是它左上方和右上方的数的和。

![img](https://gitee.com/misteryliu/typora/raw/master/image/1626927345-DZmfxB-PascalTriangleAnimated2-20211230204415190.gif)



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1:**

```
输入: rowIndex = 3
输出: [1,3,3,1]
```

**示例 2:**

```
输入: rowIndex = 0
输出: [1]
```

**示例 3:**

```
输入: rowIndex = 1
输出: [1,1]
```

**提示:**

- `0 <= rowIndex <= 33`

## 思路：

- 如果rowIndex=0或者rowIndex=1；直接返回对应的数字
- 从rowIndex=1开始，对rowIndex进行遍历

```java
public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> previous = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
//        如果rowIndex=0或者rowIndex=1直接返回
        previous.add(1);
        if (rowIndex == 0) {
            return previous;
        }
        previous.add(1);
        if (rowIndex==1){
            return previous;
        }
//        rowIndex此时大于一
        for (int i = 1; i < rowIndex; i++) {
//            每次在开头添加1
            result.add(1);
//            对中间的数进行计算
            for (int j = 0; j < previous.size()-1;j++) {
//                填充中间值
                result.add(previous.get(j)+previous.get(j+1));
            }
//            添加末尾的值
            result.add(1);
//            如果已经遍历到最后一个了，那就直接返回
            if (i==rowIndex-1){
                return result;
            }
            else {
//                否则的话把这个数组复制为上一个数组
                previous= (ArrayList<Integer>) result.clone();
//                清空result重新遍历
                result.clear();
            }
        }
        return result;
    }
```

## 结果：

![image-20220301150244644](https://gitee.com/misteryliu/typora/raw/master/image/image-20220301150244644.png)