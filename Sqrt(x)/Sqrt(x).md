题目：

给你一个非负整数 x ，计算并返回 x 的 算术平方根 。

由于返回类型是整数，结果只保留 整数部分 ，小数部分将被 舍去 。

注意：不允许使用任何内置指数函数和算符，例如 pow(x, 0.5) 或者 x ** 0.5 。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/sqrtx
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：x = 4
输出：2
```

**示例 2：**

```
输入：x = 8
输出：2
解释：8 的算术平方根是 2.82842..., 由于返回类型是整数，小数部分将被舍去。
```

## 思路：

- 设立两个指针，一个指向开头，一个指向结尾，每次计算两数的平均数
- 如果偏大，则让后面的指针指向结果的数
- 偏小，前面的数指向结果的数
- 需要注意的是，如果数字偏大的话，使用两个数相乘会溢出，所以，所用除法进行计算比较

## 代码：

```java
public int mySqrt(int x) {
        if (x==0){
            return 0;
        }
        int begin=1;
        int end=x;
        int result=0;
        while (begin+1<end){
            result=(begin+end)/2;
//           本来是result*result<=x, 这里防止溢出，所以使用除法
            if (x/result>=result){
                begin=result;
            }
            if (x/result<result){
                end=result;
            }

        }
        return begin;
    }
```

## 结果：

![image-20220126143233426](https://gitee.com/misteryliu/typora/raw/master/image/image-20220126143233426.png)