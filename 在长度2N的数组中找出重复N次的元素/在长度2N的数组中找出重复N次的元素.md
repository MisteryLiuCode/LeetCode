# 题目：

​	给你一个整数数组 `nums` ，该数组具有以下属性：

- `nums.length == 2 * n`.
- `nums` 包含 `n + 1` 个 **不同的** 元素
- `nums` 中恰有一个元素重复 `n` 次

找出并返回重复了 `n` 次的那个元素。



来源：力扣（LeetCode） 链接：https://leetcode-cn.com/problems/SNJvJP 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：nums = [1,2,3,3]
输出：3
```

**示例 2：**

```
输入：nums = [2,1,2,5,3,2]
输出：2
```

**示例 3：**

```
输入：nums = [5,1,5,2,5,3,5,4]
输出：5
```

 

**提示：**

- `2 <= n <= 5000`
- `nums.length == 2 * n`
- `0 <= nums[i] <= 104`
- `nums` 由 `n + 1` 个 **不同的** 元素组成，且其中一个元素恰好重复 `n` 次

## 思路：

- 排序
- 双指针遍历，计数

## 代码：

```java
public int repeatedNTimes(int[] nums) {
//        排序
        Arrays.sort(nums);
        int left=0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[left]!=nums[i]){
                int len=i-left;
                if (len==nums.length/2){
                    return nums[left];
                }
                left=i;
            }

        }
        return nums[nums.length-1];
    }
```

## 结果：

![image-20220424164104995](https://misteryliu.oss-cn-beijing.aliyuncs.com/image/image-20220424164104995.png)