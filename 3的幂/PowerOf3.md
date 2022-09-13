##  题目：

​	给定一个整数，写一个函数来判断它是否是 3 的幂次方。如果是，返回 `true` ；否则，返回 `false` 。

整数 `n` 是 3 的幂次方需满足：存在整数 `x` 使得 `n == 3x`



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：n = 27
输出：true
```

**示例 2：**

```
输入：n = 0
输出：false
```

**示例 3：**

```
输入：n = 9
输出：true
```

**示例 4：**

```
输入：n = 45
输出：false
```

**提示：**

- `-231 <= n <= 231 - 1`

## 思路：

- while循环除以3
- 当小于等于1的跳出循环

## 代码：

```java
public boolean isPowerOfThree(int n) {
    double m=n;
    while (m>1.0){
        m=m/3;
    }

    if (m==1.0){
        return true;
    }
    else {
        return false;
    }
}
```

## 结果：

![image-20220303231249006](https://gitee.com/misteryliu/typora/raw/master/image/image-20220303231249006.png)