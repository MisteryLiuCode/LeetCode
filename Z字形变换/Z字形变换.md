将一个给定字符串 s 根据给定的行数 numRows ，以从上往下、从左到右进行 Z 字形排列。

比如输入字符串为 "

" 行数为 3 时，排列如下：

```
P   A   H   N
A P L S I I G
Y   I   R
```

之后，你的输出需要从左往右逐行读取，产生出一个新的字符串，比如：`"PAHNAPLSIIGYIR"`。

请你实现这个将字符串进行指定行数变换的函数：

```
string convert(string s, int numRows);
```

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/zigzag-conversion
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

<!--more-->

**示例 1：**

```
输入：s = "PAYPALISHIRING", numRows = 3
输出："PAHNAPLSIIGYIR"
```

**示例 2：**

```
输入：s = "PAYPALISHIRING", numRows = 4
输出："PINALSIGYAHRPI"
解释：
P     I    N
A   L S  I G
Y A   H R
P     I
```

**示例 3：**

```
输入：s = "A", numRows = 1
输出："A"
```

## 思路：

- 如果row<2，也就是说row只有1或者0，那么就没有Z字形，直接返回字符串即可

- 如果row>1

  - 把整体看成一个List数组。

  - 循环numRow，初始化几个List内存,方便之后对里面的数据进行存储。

  - 遍历List

```
字符串 P A Y P A L I S H I  R  I  N   G
下标   0 1 2 3 4 5 6 7 8 9 10 11  12  13
行数   0 1 2 1 0 1 2 1 0 1  2  1  0   1
2n-2  0 1 2  
```

- 由上面的例子可以发现一个规律是循环的次数n+n-2=2n-2
- 那么每一个数存储的行数=该数下标%2n-2
- 但是这样算出来的所存储的行数会有可能超出下标，因为并不是使用所有行数来进行取余的，那么一定会有超出下标的，对于超出下标的，就是要反过来存储的数，也就是存储在N的那条斜边。
  - 此时使用这个公式进行计算：(2 * numRows - 2) - index，来计算出真实下标
- 遍历List，拼接字符串，返回结果

## 代码：

```java
public String convert(String s, int numRows) {
    if (numRows<2){
        return s;
    }
    String result="";
    int index=0;
    List<Character>[] lists = new ArrayList[numRows];
    for (int i = 0; i < lists.length; i++) {
        lists[i] = new ArrayList<>();
    }
        for (int i=0;i<s.length();i++){
            index=i%(2 * numRows - 2);
            if(index>=numRows){
                index = (2 * numRows - 2) - index;
            }
            lists[index].add(s.charAt(i));
        }
    for (int i=0;i<lists.length;i++){
        for (int j=0;j<lists[i].size();j++){
            result+=lists[i].get(j);
        }
    }
    return result;
}
```

## 结果：

![image-20220124230444285](https://gitee.com/misteryliu/typora/raw/master/image/image-20220124230444285.png)