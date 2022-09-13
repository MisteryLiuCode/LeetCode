实现strStr

## 题目：

### 声明：这道题正确解法是让用kmp解法的，我这是属于走捷径了。

实现 strStr() 函数。

给你两个字符串 haystack 和 needle ，请你在 haystack 字符串中找出 needle 字符串出现的第一个位置（下标从 0 开始）。如果不存在，则返回  -1 。

 

说明：

当 needle 是空字符串时，我们应当返回什么值呢？这是一个在面试中很好的问题。

对于本题而言，当 needle 是空字符串时我们应当返回 0 。这与 C 语言的 strstr() 以及 Java 的 indexOf() 定义相符。

 

示例 1：

输入：haystack = "hello", needle = "ll"
输出：2
示例 2：

输入：haystack = "aaaaa", needle = "bba"
输出：-1
示例 3：

输入：haystack = "", needle = ""
输出：0


提示：

0 <= haystack.length, needle.length <= 5 * 104
haystack 和 needle 仅由小写英文字符组成

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/implement-strstr
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

### 解法思路和代码：

```java
public int strStr(String haystack, String needle) {
//        遍历haystack，看是否以needle开头的。
        int result=-1;
//         先赋值，后面为了进行裁切。
        String s=haystack;

//        如果都为空，那么直接输出为0
        if (haystack.equals("")&&needle.equals("")){
            result=0;
        }
        for (int i=0;i<haystack.length();i++){
//            如果是以needle为开头的话，那么直接返回此时的i值，并且停止循环
            if (s.startsWith(needle)){
                result=i;
                break;
            }
            else {
//                否则就裁切一次。
                s=haystack.substring(i+1,haystack.length());
            }
        }
        return result;
    }
```

### 菜鸡结果：

![执行结果：通过 显示详情、](https://gitee.com/misteryliu/typora/raw/master/image/%E6%89%A7%E8%A1%8C%E7%BB%93%E6%9E%9C%EF%BC%9A%E9%80%9A%E8%BF%87%20%E6%98%BE%E7%A4%BA%E8%AF%A6%E6%83%85%E3%80%81.png)





## 不讲武德的解法：

```java
//        这种方法简直狗血，直接使用indexof（)方法，这个方法的作用是，返回第一次出现子串的开始值。
//        答案也没毛病，就是不讲武德。
        return haystack.indexOf(needle);
```

### API结果：

![执行结果：通过 显示详情，](https://gitee.com/misteryliu/typora/raw/master/image/执行结果：通过 显示详情，.png)