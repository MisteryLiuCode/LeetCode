给你数字 `k` ，请你返回和为 `k` 的斐波那契数字的最少数目，其中，每个斐波那契数字都可以被使用多次。

斐波那契数字定义为：

- F1 = 1
- F2 = 1
- Fn = Fn-1 + Fn-2 ， 其中 n > 2 。

数据保证对于给定的 `k` ，一定能找到可行解。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：k = 7
输出：2 
解释：斐波那契数字为：1，1，2，3，5，8，13，……
对于 k = 7 ，我们可以得到 2 + 5 = 7 。
```

**示例 2：**

```
输入：k = 10
输出：2 
解释：对于 k = 10 ，我们可以得到 2 + 8 = 10 。
```

**示例 3：**

```
输入：k = 19
输出：3 
解释：对于 k = 19 ，我们可以得到 1 + 5 + 13 = 19 。
```

 **提示：**

- `1 <= k <= 10^9`

## 思路：

- 判断本身是否是斐波那契数
  - 是，返回
  - 否，k—减去最接近的斐波那契数
  - 判断是否本身就在里面，
    - 是，返回
    - 否，减去，判断
- 循环

## 代码：

```java
public int findMinFibonacciNumbers(int k) {
        int result=0;
        int befor=1;
        int behind=1;
        while (k!=0) {
//            重置
            befor=1;
            behind=1;
            while (behind <=k) {
//                更新位置，都往后走一位
                behind = befor + behind;
                befor = behind-befor;
            }
//            跳出说明有一个数
            result++;
            k-=befor;
        }
        return result;
    }
```

## 结果：

![image-20220203141738342](https://gitee.com/misteryliu/typora/raw/master/image/image-20220203141738342.png)