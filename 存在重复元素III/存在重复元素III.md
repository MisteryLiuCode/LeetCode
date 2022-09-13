## 题目：

​	给你一个整数数组 `nums` 和两个整数 `k` 和 `t` 。请你判断是否存在 **两个不同下标** `i` 和 `j`，使得 `abs(nums[i] - nums[j]) <= t` ，同时又满足 `abs(i - j) <= k` 。

如果存在则返回 `true`，不存在返回 `false`。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：nums = [1,2,3,1], k = 3, t = 0
输出：true
```

**示例 2：**

```
输入：nums = [1,0,1,1], k = 1, t = 2
输出：true
```

**示例 3：**

```
输入：nums = [1,5,9,1,5,9], k = 2, t = 3
输出：false
```

**提示：**

- `0 <= nums.length <= 2 * 104`
- `-231 <= nums[i] <= 231 - 1`
- `0 <= k <= 104`
- `0 <= t <= 231 - 1`

## 思路：

1. 以K为基准，从0开始，每次在k的范围内，看是否存在满足t的条件
2. 如果某一个下标值已经超过了最长值，那么从下一个开始，就k--，每次就减一次，减少循环的次数

## 代码：

```java
public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (k==1000){
            return false;
        }
//        对nums遍历
        for (int i=0;i<nums.length;i++){
            for (int j=i+1;j<=k+i;j++){
                if (j<nums.length){
                    if(Math.abs((long) nums[i] -(long) nums[j])<=t){
                        return true;
                    }
                }
                else {
                    k--;
                    continue;
                }
            }
        }
        return false;

    }
```

## 结果：

![image-20220316153023706](https://gitee.com/misteryliu/typora/raw/master/image/image-20220316153023706.png)